package org.j8unit.runners.conformance;

import static java.lang.reflect.Modifier.isAbstract;
import static java.lang.reflect.Modifier.isStatic;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.BiPredicate;
import org.junit.AssumptionViolatedException;

/**
 * Enumeration of all &ndash;&nbsp;currently supported&nbsp;&ndash; strategies to instanciate unknown Java types.
 *
 * @since 4.12.2
 */
enum InstanciationStrategies
implements BiPredicate<Class<?>, Map<? super String, ? super Callable<?>>> {

    /**
     * In case some given Java type {@linkplain Class#isEnum() is} an {@code enum}, this instantiation strategy appends
     * all available {@code enum} constants.
     */
    ENUM_CONSTANTS {

        @Override
        public final boolean test(final Class<?> candidate, final Map<? super String, ? super Callable<?>> instanciations) {
            assert candidate != null;
            assert instanciations != null;
            if (candidate.isEnum()) {
                final Enum<?>[] constants = (Enum<?>[]) candidate.getEnumConstants();
                if (constants.length == 0) {
                    final Callable<?> factory = () -> {
                        throw new AssumptionViolatedException(SKIP_EMPTY_ENUM);
                    };
                    instanciations.put("...", factory);
                } else {
                    for (final Enum<?> constant : constants) {
                        final Callable<?> factory = () -> constant;
                        instanciations.put(constant.name(), factory);
                    }
                }
                return SKIP_ANY_OTHER_STRATEGY;
            } else {
                return TRY_SOME_OTHER_STRATEGY;
            }
        }

    },

    /**
     * In case some given Java type contains {@code public} {@code static} fields (assignable from the current type),
     * this instantiation strategy appends all such available fields.
     */
    AVAILABLE_FIELDS {

        @Override
        public final boolean test(final Class<?> candidate, final Map<? super String, ? super Callable<?>> instanciations) {
            assert candidate != null;
            assert instanciations != null;
            Arrays.stream(candidate.getFields()) //
                  .filter(f -> candidate.isAssignableFrom(f.getType())) //
                  .filter(f -> isStatic(f.getModifiers())) //
                  .forEach(f -> instanciations.put(f.getName(), (Callable<?>) () -> f.get(null /* static field */)));
            return TRY_SOME_OTHER_STRATEGY;
        }

    },

    /**
     * In case some given non-{@code abstract} Java type contains provides a default (zero-arity) constructor, this
     * instantiation strategy appends an invocation of this constructor.
     */
    DEFAULT_CONSTRUCTOR {

        @Override
        public final boolean test(final Class<?> candidate, final Map<? super String, ? super Callable<?>> instanciations) {
            if (!isAbstract(candidate.getModifiers())) {
                assert candidate != null;
                assert instanciations != null;
                try {
                    final Callable<?> construction = candidate.getConstructor()::newInstance;
                    instanciations.put(candidate.getSimpleName() + "()", construction);
                } catch (final NoSuchMethodException missing) {}
            }
            return TRY_SOME_OTHER_STRATEGY;
        }

    },

    /**
     * This instantiation strategy appends a behaviour that constantly throws an {@link AssumptionViolatedException}.
     */
    FAIL_INSTANCIATION {

        @Override
        public boolean test(final Class<?> candidate, final Map<? super String, ? super Callable<?>> instanciations) {
            assert candidate != null;
            assert instanciations != null;
            final boolean isAbstr = isAbstract(candidate.getModifiers());
            final boolean isIface = candidate.isInterface();
            final boolean isAnno = candidate.isAnnotation();
            if (instanciations.isEmpty()) {
                final String cause = isAbstr ? isIface ? isAnno ? SKIP_ANNOTATION : SKIP_INTERFACE : SKIP_ABSTRACT : SKIP_UNSUPPORTED;
                final Callable<?> factory = () -> {
                    throw new AssumptionViolatedException(cause);
                };
                instanciations.put("...", factory);
            }
            return SKIP_ANY_OTHER_STRATEGY;
        }

    };

    static final String SKIP_EMPTY_ENUM = "Skipping this test because the current enum-under-test does not provide any enum constant!";

    static final String SKIP_ABSTRACT = "Skipping this test because j8unit does not support a generic way to provide instances of an abstract class-under-test.";

    static final String SKIP_INTERFACE = "Skipping this test because j8unit does not support a generic way to provide instances of an interface-under-test.";

    static final String SKIP_ANNOTATION = "Skipping this test because j8unit does not support a generic way to provide instances of an annotation-under-test.";

    static final String SKIP_UNSUPPORTED = "Skipping this test because j8unit does not support a generic way to provide instances of the current class-under-test!";

    /**
     * Return this value if no further instanciation strategy should be used.
     */
    private static final boolean SKIP_ANY_OTHER_STRATEGY = true;

    /**
     * Return this value if further instanciation strategies are allowed be used.
     */
    private static final boolean TRY_SOME_OTHER_STRATEGY = false;

    /**
     * Tries to find a way to instanciate the given unknown Java {@code type}. Each way is identified by a unique name
     * and may throw an {@link Exception} when executed.
     *
     * @param type
     *            the unknown type
     * @return a map of all available instanciation factory methods
     */
    public static final Map<String, Callable<?>> discoverInstanciations(final Class<?> type) {
        assert type != null;
        final Map<String, Callable<?>> instanciations = new HashMap<>();
        ENUM_CONSTANTS.or(AVAILABLE_FIELDS).or(DEFAULT_CONSTRUCTOR).or(FAIL_INSTANCIATION).test(type, instanciations);
        return instanciations;
    }

}
