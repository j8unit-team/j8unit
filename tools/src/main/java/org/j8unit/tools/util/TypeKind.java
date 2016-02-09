package org.j8unit.tools.util;

import static java.util.Arrays.stream;
import static java.util.Objects.requireNonNull;
import java.lang.reflect.Modifier;
import java.util.Optional;

/**
 * <p>
 * Enumeration of the kinds of Java types; Actually, there are five kinds:
 * </p>
 *
 * <ul>
 * <li>Top level types ({@link #TOP_LEVEL})</li>
 * <li>Nested types (static member types) ({@link #NESTED})</li>
 * <li>Inner types (non-static member types) ({@link #INNER})</li>
 * <li>Local types (named types declared within a method) ({@link #LOCAL})</li>
 * <li>Anonymous types ({@link #ANONYMOUS})</li>
 * </ul>
 *
 * @see Class#getEnclosingClass() source code of {@code Class#getEnclosingClass()}
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html"> The Java&trade; Tutorials: Nested
 *      Classes</a>
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/localclasses.html"> The Java&trade; Tutorials:
 *      Local Classes</a>
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html"> The Java&trade; Tutorials:
 *      Anonymous Classes</a>
 */
public enum TypeKind {

    /**
     * <p>
     * Enumeration constant representing top level types; that is, all types without an enclosing type.
     * </p>
     *
     * @see Class#getEnclosingClass()
     */
    TOP_LEVEL {

        @Override
        public boolean matches(final Class<?> type) {
            requireNonNull(type);
            return type.getEnclosingClass() == null;
        }

    },

    /**
     * <p>
     * Enumeration constant representing nested types; that is, all static member types.
     * </p>
     *
     * @see Class#isMemberClass()
     * @see Modifier#isStatic(int)
     */
    NESTED {

        @Override
        public boolean matches(final Class<?> type) {
            requireNonNull(type);
            return type.isMemberClass() && Modifier.isStatic(type.getModifiers());
        }

    },

    /**
     * <p>
     * Enumeration constant representing inner types; that is, all non-static member types.
     * </p>
     *
     * @see Class#isMemberClass()
     * @see Modifier#isStatic(int)
     */
    INNER {

        @Override
        public boolean matches(final Class<?> type) {
            requireNonNull(type);
            return type.isMemberClass() && !Modifier.isStatic(type.getModifiers());
        }

    },

    /**
     * <p>
     * Enumeration constant representing local types; that is, all named types declared within a method.
     * </p>
     *
     * @see Class#isLocalClass()
     */
    LOCAL {

        @Override
        public boolean matches(final Class<?> type) {
            requireNonNull(type);
            return type.isLocalClass();
        }

    },

    /**
     * <p>
     * Enumeration constant representing anonymous types.
     * </p>
     *
     * @see Class#isAnonymousClass()
     */
    ANONYMOUS {

        @Override
        public boolean matches(final Class<?> type) {
            requireNonNull(type);
            return type.isAnonymousClass();
        }

    };

    /**
     * <p>
     * Predicate method matching any {@link Class type} that fits to the specific kind of Java type.
     * </p>
     *
     * @see #TOP_LEVEL
     * @see #NESTED
     * @see #INNER
     * @see #LOCAL
     * @see #ANONYMOUS
     *
     * @param modifier
     *            the Java type to use for matching query
     * @return {@code true} if the given modifier fits to the specific kind of Java type; {@code false} otherwise
     */
    public abstract boolean matches(final Class<?> type);

    /**
     * <p>
     * Predicate method matching any {@linkplain Class type} that does not hold {@link #matches(int)}.
     * </p>
     *
     * @see #matches(int)
     *
     * @param type
     *            the Java type to use for mismatching query
     * @return {@code true} if the given modifier does not hold {@link #matches(Class)}; {@code false} otherwise
     */
    public final boolean mismatches(final Class<?> type) {
        requireNonNull(type);
        return !this.matches(type);
    }

    /**
     * Returns the {@link TypeKind} {@code enum} constant according to the query Java {@code type}.
     *
     * @param type
     *            the query Java type
     * @return the {@code TypeKind} {@code enum} constant according to the query Java {@code type}
     */
    public static final TypeKind kindOf(final Class<?> type) {
        requireNonNull(type);
        final Optional<TypeKind> kind = stream(TypeKind.values()).filter(k -> k.matches(type)).findFirst();
        assert kind.isPresent() : "A class cannot have a kind different to top-level, nested, inner, local, or anonymous!";
        return kind.get();
    }

}
