package org.j8unit.runners.conformance;

import static java.lang.ClassLoader.getSystemClassLoader;
import static java.lang.String.format;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.reflect.Modifier.isAbstract;
import static java.lang.reflect.Modifier.isPublic;
import static java.lang.reflect.Proxy.getProxyClass;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.nCopies;
import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toCollection;
import static org.j8unit.runners.conformance.InstanciationStrategies.discoverInstanciations;
import static org.j8unit.runners.conformance.J8UnitRepositoryTestsDiscovery.J8UNIT_REPOSITORY_CLASS_TESTS_SUFFIX;
import static org.j8unit.runners.conformance.J8UnitRepositoryTestsDiscovery.J8UNIT_REPOSITORY_INSTANCE_TESTS_SUFFIX;
import static org.j8unit.runners.conformance.J8UnitRepositoryTestsDiscovery.J8UNIT_REPOSITORY_PREFIX;
import static org.j8unit.util.Functional.consumeFalse;
import static org.j8unit.util.Reflection.ENFORCE_ABSTRACT;
import static org.j8unit.util.Reflection.SKIP_ABSTRACT;
import static org.j8unit.util.Reflection.constantResult;
import static org.j8unit.util.Reflection.dispatch;
import static org.j8unit.util.Reflection.fail;
import static org.j8unit.util.Reflection.getTypeHierarchyAsStream;
import static org.j8unit.util.Reflection.redundantTypes;
import static org.j8unit.util.Reflection.trySuperTypesFirst;
import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Stream;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.model.J8TestClass;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.internal.builders.AnnotatedBuilder;
import org.junit.internal.runners.ErrorReportingRunner;
import org.junit.runner.Runner;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.TestClass;
import org.junit.runners.parameterized.ParametersRunnerFactory;
import org.junit.runners.parameterized.TestWithParameters;

/**
 * <p>
 * If you ever wanted to know if your code fulfills all the API contracts of its super classes and super
 * interfaces&nbsp;&ndash; this is your test runner! If you even dreamed of a (nearly) code-less way to reuse existing
 * test methods&nbsp;&ndash; this even more is your test runner! If you want to automatically benefit from any
 * improvement within the j8unit test repository&nbsp;&ndash; believe us, this is your runner!<br />
 *
 * Honestly, just give it a try. You'll love it.
 * </p>
 *
 * <p>
 * By discovering reusable j8unit test interfaces, this runner creates ad-hoc test classes at runtime and executes all
 * of the discovered, {@code default}ly implemented single tests.
 *
 * The only thing you need to do is to specify the types you want to be API tested. Just use the mandatory
 * {@link APIConformance.APIConformanceCandidates} annotation. In addition, you can control some of the internals by
 * using the {@link APIConformance.ClassTestsDiscovery} and the {@link APIConformance.InstanceTestsDiscovery}
 * annotations.
 * </p>
 *
 * <p>
 * For example, if you want to verify the correctness of your custom collection classes, your API test suite could look
 * like this:
 * </p>
 *
 * <pre class="brush:java">
 * &#064;RunWith(APIConformance.class)
 * &#064;APIConformanceCandidates({ MyList.class, MySet.class, MyMap.class })
 * public class MyCollections {
 * }
 * </pre>
 *
 * <p>
 * A more fine-grained suite could look like this:
 * </p>
 *
 * <pre class="brush:java">
 * &#064;RunWith(APIConformance.class)
 * &#064;APIConformanceCandidates({ MyList.class, MySet.class, MyMap.class })
 * &#064;ClassTestsDiscovery(name = "{index}: {0}.class", ignoreMissings = true, ignoreInvalids = false)
 * &#064;InstanceTestsDiscovery(name = "{index}: {0}#{1}", ignoreMissings = true, ignoreInvalids = false)
 * public class MyCollections {
 * }
 * </pre>
 *
 * @see APIConformance.APIConformanceCandidates
 * @see APIConformance.ClassTestsDiscovery
 * @see APIConformance.InstanceTestsDiscovery
 *
 * @since 4.12.2
 */
public class APIConformance
extends Suite {

    /*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
     * Specific annotations and according discovery methods:
     *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*/

    /**
     * This mandatory {@code APIConformanceCandidates} annotation specifies the API candidates to be used when a class
     * annotated with {@code @RunWith(APIConformance.class)} is run.
     */
    @Retention(RUNTIME)
    @Target(TYPE)
    @Inherited
    public static @interface APIConformanceCandidates {

        /**
         * Returns the types to be used for API conformance tests. There is no default value.
         *
         * @return the types to be used for API conformance tests
         */
        public Class<?>[] value();

        public static final Class<?> CURRENT_PACKAGE = APIConformanceCandidates.class;

    }

    /**
     * Returns all API candidates.
     *
     * @param suite
     *            the current API conformance suite class
     * @return all API candidates
     * @throws InitializationError
     *             if there is no {@link APIConformanceCandidates} annotation or if
     *             {@link APIConformanceCandidates#value()} is empty
     */
    private static final Class<?>[] getAPIConformanceCandidates(final Class<?> suite)
    throws InitializationError {
        final APIConformanceCandidates annotation;
        final Class<?>[] candidates;
        if ((annotation = suite.getAnnotation(APIConformanceCandidates.class)) == null) {
            final String MISSING_ANNOTATION = "Class '%s' must have a '%s' annotation!";
            throw new InitializationError(format(MISSING_ANNOTATION, suite.getName(), APIConformanceCandidates.class.getSimpleName()));
        } else if ((candidates = annotation.value()).length == 0) {
            final String MISSING_CANDIDATES = "Class '%s' must have a '%s' annotation with at least a single candidate class!";
            throw new InitializationError(format(MISSING_CANDIDATES, suite.getName(), APIConformanceCandidates.class.getSimpleName()));
        } else {
            return candidates;
        }
    }

    /**
     * This optional {@code ClassTestsDiscovery} annotation specifies the discovery of the reusable j8unit test
     * interfaces which contain tests targeting the (@code static}) class API. Beside, this annotation can be used to
     * specify the tests' names and the lenity on missing/invalid j8unit interfaces.
     */
    @Retention(RUNTIME)
    @Target(TYPE)
    @Inherited
    public static @interface ClassTestsDiscovery {

        /**
         * <p>
         * Optional strategy to discover reusable j8unit test interfaces which contain tests targeting the
         * ({@code static}) class API. The strategy class must have a {@code public} constructor that must be invokable
         * using the arguments of {@link #args()}. (In case of a zero-arity constructor, {@link #args()} must be an
         * empty array.)
         * </p>
         *
         * <p>
         * The default value is <code>{@link J8UnitRepositoryTestsDiscovery}.class</code>.
         * </p>
         *
         * @return a strategy to discover reusable j8unit test interfaces which contain tests targeting the
         *         ({@code static}) class API
         */
        public Class<? extends BiFunction<? super Class<?>, ? super Consumer<? super ClassNotFoundException>, ? extends Set<Class<?>>>> value() default J8UnitRepositoryTestsDiscovery.class;

        /**
         * <p>
         * Provides the arguments used to invoke the according constructor of the class defined by {@link #value()}. (In
         * case the zero-arity constructor should be used, {@link #args()} must be an empty array.)
         * </p>
         *
         * <p>
         * The default value is
         * <code>{ {@link J8UnitRepositoryTestsDiscovery#J8UNIT_REPOSITORY_PREFIX J8UNIT_REPOSITORY_PREFIX}, {@link J8UnitRepositoryTestsDiscovery#J8UNIT_REPOSITORY_CLASS_TESTS_SUFFIX J8UNIT_REPOSITORY_CLASS_TESTS_SUFFIX} }</code>.
         * </p>
         *
         * @return the arguments used to invoke the constructor of the class defined by {@link #value()}
         */
        public String[] args() default { J8UNIT_REPOSITORY_PREFIX, J8UNIT_REPOSITORY_CLASS_TESTS_SUFFIX };

        /**
         * <p>
         * Optional pattern to derive the test's name from the API candidate class (<code>{0}</code>). In addition,
         * (<code>{index}</code>) will be replaced by the current nested runner's index.
         * </p>
         *
         * <p>
         * This declaration is mainly inspired by {@link org.junit.runners.Parameterized.Parameters#name()}.
         *
         * The default value is <code>{index}: {0}.class</code>.
         * </p>
         *
         * @see MessageFormat
         *
         * @return the {@link MessageFormat}-based name pattern (except the index placeholder)
         */
        public String name() default "{index}: {0}.class";

        /**
         * <p>
         * Optional pattern to derive the reporting test's name from the API candidate class (<code>{0}</code>). In
         * addition, (<code>{index}</code>) will be replaced by the current nested runner's index.
         * </p>
         *
         * <p>
         * This declaration is mainly inspired by {@link org.junit.runners.Parameterized.Parameters#name()}.
         *
         * The default value is <code>ℝ({index}: {0}.class)</code>.
         * </p>
         *
         * @see MessageFormat
         *
         * @return the {@link MessageFormat}-based name pattern (except the index placeholder)
         */
        public String reportName() default "ℝ({index}: {0}.class)";

        /**
         * <p>
         * Optional flag to specify the lenity on missing j8unit interfaces. {@code true} means to ignore (causing the
         * {@linkplain SummaryTest#exploreJ8UnitTestInterfaces() reporting test} to be skipped); {@code false} means to
         * notify about failures (causing the the reporting test to fail with an exception).
         * </p>
         *
         * <p>
         * The default value is {@code true}.
         * </p>
         *
         * @return {@code true} iff the ad-hocly created API conformance test shall be lenient on missing j8unit test
         *         interfaces
         */
        public boolean ignoreMissings() default true;

        /**
         * <p>
         * Optional flag to specify the lenity on invalid j8unit interfaces. {@code true} means to ignore (causing the
         * {@linkplain SummaryTest#instanciateJ8UnitTestInterfaces() reporting test} to be skipped); {@code false} means
         * to notify about failures (causing the the reporting test to fail with an exception).
         * </p>
         *
         * <p>
         * The default value is {@code true}.
         * </p>
         *
         * @return {@code true} iff the ad-hocly created API conformance test shall be lenient on invalid j8unit test
         *         interfaces
         */
        public boolean ignoreInvalids() default true;

    }

    /**
     * This optional {@code InstanceTestsDiscovery} annotation specifies the discovery of the reusable j8unit test
     * interfaces which contain tests targeting the (non-{@code static}) instance API. Beside, this annotation can be
     * used to specify the tests' names and the lenity on missing/invalid j8unit interfaces.
     */
    @Retention(RUNTIME)
    @Target(TYPE)
    @Inherited
    public static @interface InstanceTestsDiscovery {

        /**
         * <p>
         * Optional strategy to discover reusable j8unit test interfaces which contain tests targeting the
         * (non-{@code static}) instance API. The strategy class must have a {@code public} constructor that must be
         * invokable using the arguments of {@link #args()}. (In case of a zero-arity constructor, {@link #args()} must
         * be an empty array.)
         * </p>
         *
         * <p>
         * The default value is <code>{@link J8UnitRepositoryTestsDiscovery}.class</code>.
         * </p>
         *
         * @return a strategy to discover reusable j8unit test interfaces which contain tests targeting the
         *         (non-{@code static}) instance API
         */
        public Class<? extends BiFunction<? super Class<?>, ? super Consumer<? super ClassNotFoundException>, ? extends Set<Class<?>>>> value() default J8UnitRepositoryTestsDiscovery.class;

        /**
         * <p>
         * Provides the arguments used to invoke the according constructor of the class defined by {@link #value()}. (In
         * case the zero-arity constructor should be used, {@link #args()} must be an empty array.)
         * </p>
         *
         * <p>
         * The default value is
         * <code>{ {@link J8UnitRepositoryTestsDiscovery#J8UNIT_REPOSITORY_PREFIX J8UNIT_REPOSITORY_PREFIX}, {@link J8UnitRepositoryTestsDiscovery#J8UNIT_REPOSITORY_INSTANCE_TESTS_SUFFIX J8UNIT_REPOSITORY_INSTANCE_TESTS_SUFFIX} }</code>.
         * </p>
         *
         * @return the arguments used to invoke the constructor of the class defined by {@link #value()}
         */
        public String[] args() default { J8UNIT_REPOSITORY_PREFIX, J8UNIT_REPOSITORY_INSTANCE_TESTS_SUFFIX };

        /**
         * <p>
         * Optional pattern to derive the test's name from the API candidate class (<code>{0}</code>) and the instance
         * (<code>{1}</code>). In addition, (<code>{index}</code>) will be replaced by the current nested runner's
         * index.
         * </p>
         *
         * <p>
         * This declaration is mainly inspired by {@link org.junit.runners.Parameterized.Parameters#name()}.
         *
         * The default value is <code>{index}: {0}#{1}</code>.
         * </p>
         *
         * @see MessageFormat
         *
         * @return the {@link MessageFormat}-based name pattern (except the index placeholder)
         */
        public String name() default "{index}: {0}#{1}";

        /**
         * <p>
         * Optional pattern to derive the reporting test's name from the API candidate class (<code>{0}</code>) and the
         * instance (<code>{1}</code>). In addition, (<code>{index}</code>) will be replaced by the current nested
         * runner's index.
         * </p>
         *
         * <p>
         * This declaration is mainly inspired by {@link org.junit.runners.Parameterized.Parameters#name()}.
         *
         * The default value is <code>ℝ({index}: {0}#{1})</code>.
         * </p>
         *
         * @see MessageFormat
         *
         * @return the {@link MessageFormat}-based name pattern (except the index placeholder)
         */
        public String reportName() default "ℝ({index}: {0}#{1})";

        /**
         * <p>
         * Optional flag to specify the lenity on missing j8unit interfaces. {@code true} means to ignore (causing the
         * {@linkplain SummaryTest#exploreJ8UnitTestInterfaces() reporting test} to be skipped); {@code false} means to
         * notify about failures (causing the the reporting test to fail with an exception).
         * </p>
         *
         * <p>
         * The default value is {@code true}.
         * </p>
         *
         * @return {@code true} iff the ad-hocly created API conformance test shall be lenient on missing j8unit test
         *         interfaces
         */
        public boolean ignoreMissings() default true;

        /**
         * <p>
         * Optional flag to specify the lenity on invalid j8unit interfaces. {@code true} means to ignore (causing the
         * {@linkplain SummaryTest#instanciateJ8UnitTestInterfaces() reporting test} to be skipped); {@code false} means
         * to notify about failures (causing the the reporting test to fail with an exception).
         * </p>
         *
         * <p>
         * The default value is {@code true}.
         * </p>
         *
         * @return {@code true} iff the ad-hocly created API conformance test shall be lenient on invalid j8unit test
         *         interfaces
         */
        public boolean ignoreInvalids() default true;

    }

    /**
     * Dummy container to provide a blueprint instance of each optional annotation.
     *
     * Will be used as fallback by {@link #getAnnotation(Class, Class)}.
     */
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    @ClassTestsDiscovery
    @InstanceTestsDiscovery
    private static enum DummyWithDefaultAnnotations {
    }

    /**
     * Returns an instance of the requested, optional {@code annotation}; taken either from the given {@code suite}
     * class (if present) or from {@link APIConformance.DummyWithDefaultAnnotations}. (In result, this method never
     * returns {@code null}.)
     *
     * @param suite
     *            the current API conformance suite class
     * @param annotation
     *            the requested annotation type
     * @return an instance of the requested, optional annotation
     */
    private static final <A extends Annotation> A getAnnotation(final Class<?> suite, final Class<A> annotation) {
        return suite.isAnnotationPresent(annotation) ? suite.getAnnotation(annotation) : DummyWithDefaultAnnotations.class.getAnnotation(annotation);
    }

    private static final BiFunction<? super Class<?>, ? super Consumer<? super ClassNotFoundException>, ? extends Set<Class<?>>> getStrategy(final ClassTestsDiscovery discovery)
    throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InstantiationException, InvocationTargetException {
        return getStrategy(discovery.value(), discovery.args());
    }

    private static final BiFunction<? super Class<?>, ? super Consumer<? super ClassNotFoundException>, ? extends Set<Class<?>>> getStrategy(final InstanceTestsDiscovery discovery)
    throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InstantiationException, InvocationTargetException {
        return getStrategy(discovery.value(), discovery.args());
    }

    private static final BiFunction<? super Class<?>, ? super Consumer<? super ClassNotFoundException>, ? extends Set<Class<?>>> getStrategy(final Class<? extends BiFunction<? super Class<?>, ? super Consumer<? super ClassNotFoundException>, ? extends Set<Class<?>>>> prototype,
                                                                                                                                             final String[] args)
    throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InstantiationException, InvocationTargetException {
        try {
            return prototype.getConstructor(nCopies(args.length, String.class).toArray(new Class<?>[args.length])).newInstance((Object[]) args);
        } catch (final NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InstantiationException
                       | InvocationTargetException suppressed) {
            try {
                return prototype.getConstructor(String[].class).newInstance((Object) args);
            } catch (final NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InstantiationException
                           | InvocationTargetException any) {
                any.addSuppressed(suppressed);
                throw any;
            }
        }
    }

    /*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
     * Member fields:
     *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*/

    private int counter = 0;

    private final List<Runner> runners = new ArrayList<>();

    @Override
    protected List<Runner> getChildren() {
        return this.runners;
    }

    /*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
     * J8Unit customised behaviour:
     *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*/

    /**
     * Returns an {@linkplain J8TestClass extended test class model} of the given {@link Class}.
     *
     * @param testClass
     *            the test class
     * @return an extended test class model of the given {@code Class}
     */
    @Override
    protected J8TestClass createTestClass(final Class<?> testClass) {
        return new J8TestClass(requireNonNull(testClass));
    }

    /*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
     * Constructor (called reflectively):
     *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*/

    /**
     * Creates a new instance of this suite runner; called reflectively by
     * {@link AnnotatedBuilder#runnerForClass(Class)} (resp. {@link AnnotatedBuilder#buildRunner(Class, Class)}).
     *
     * @throws InitializationError
     *             if one or more problems encountered while initializing this suite test runner
     */
    public APIConformance(final Class<?> suiteClass /* , final RunnerBuilder builder */)
    throws InitializationError {
        super(requireNonNull(suiteClass), emptyList(/* this parent-runner will discover its own nested runners */));
        for (final Class<?> candidate : getAPIConformanceCandidates(suiteClass)) {
            try {
                this.insertTestRunnersForClassConformance(suiteClass, candidate);
            } catch (final InitializationError any) {
                this.runners.add(new ErrorReportingRunner(candidate, any));
            } catch (final Exception any) {
                this.runners.add(new ErrorReportingRunner(candidate, new InitializationError(any)));
            }
            try {
                this.insertTestRunnersForInstanceConformance(suiteClass, candidate);
            } catch (final InitializationError any) {
                this.runners.add(new ErrorReportingRunner(candidate, any));
            } catch (final Exception any) {
                this.runners.add(new ErrorReportingRunner(candidate, new InitializationError(any)));
            }
        }
    }

    /*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
     * Specific methods to dynamically create test-classes and wrapper runners:
     *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*/

    private static final String WRONG_TYPE = "The discovered type '%s' is not a public interface and, thus, cannot be used for proxy creation (for testing %s-API conformance of '%s')!";

    /**
     * Inserts an ad-hoc {@link Runner test runner} for the {@code class} of the given candidate {@code candidate} type.
     * In addition, there is also an
     * {@linkplain #reportingPseudoTest(int, String, Class, List, boolean, List, boolean, ParametersRunnerFactory)
     * according reporting runner}.
     *
     * @see #insertTestRunnersForInstanceConformance(Class, Class)
     *
     * @param suiteClass
     *            the test suite class
     * @param candidate
     *            the current API candidate
     * @throws NoSuchMethodException
     *             if {@link java.lang.reflect.Constructor#newInstance(Object...)} fails (either for value of
     *             {@link ClassTestsDiscovery#value()} or for value of {@link UseParametersRunnerFactory#value()})
     * @throws SecurityException
     *             if {@link java.lang.reflect.Constructor#newInstance(Object...)} fails (either for value of
     *             {@link ClassTestsDiscovery#value()} or for value of {@link UseParametersRunnerFactory#value()})
     * @throws IllegalAccessException
     *             if {@link java.lang.reflect.Constructor#newInstance(Object...)} fails (either for value of
     *             {@link ClassTestsDiscovery#value()} or for value of {@link UseParametersRunnerFactory#value()})
     * @throws IllegalArgumentException
     *             if {@link java.lang.reflect.Constructor#newInstance(Object...)} fails (either for value of
     *             {@link ClassTestsDiscovery#value()} or for value of {@link UseParametersRunnerFactory#value()})
     * @throws InstantiationException
     *             if {@link java.lang.reflect.Constructor#newInstance(Object...)} fails (either for value of
     *             {@link ClassTestsDiscovery#value()} or for value of {@link UseParametersRunnerFactory#value()})
     * @throws InvocationTargetException
     *             if {@link java.lang.reflect.Constructor#newInstance(Object...)} fails (either for value of
     *             {@link ClassTestsDiscovery#value()} or for value of {@link UseParametersRunnerFactory#value()})
     * @throws InitializationError
     *             if {@linkplain ParametersRunnerFactory#createRunnerForTestWithParameters(TestWithParameters)
     *             creation} of the parameterised test runners fails
     */
    private final void insertTestRunnersForClassConformance(final Class<?> suiteClass, final Class<?> candidate)
    throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InstantiationException, InvocationTargetException,
    InitializationError {
        assert suiteClass != null;
        assert candidate != null;
        // create proxy
        final List<Throwable> missings = new ArrayList<>();
        final Consumer<ClassNotFoundException> missingsHandler = missings::add;
        final List<Throwable> invalids = new ArrayList<>();
        final Consumer<Class<?>> invalidsHandler = t -> invalids.add(new ClassCastException(format(WRONG_TYPE, t, "class", candidate)));
        final ClassTestsDiscovery discovery = getAnnotation(suiteClass, ClassTestsDiscovery.class);
        final Set<Class<?>> interfaces = discoverJ8TestInterfaces(candidate, getStrategy(discovery), missingsHandler, invalidsHandler);
        final Class<?> proxy = adHocProxyTestClass(interfaces);
        // create invocation handler
        final Callable<Class<?>> sutFactory = () -> candidate;
        final InvocationHandler handler = adHocInvocationHandler(sutFactory);
        // create parameterised test
        final int index = ++this.counter;
        final String name = testName(index, discovery.name(), candidate.getName());
        final TestClass testClass = this.createTestClass(proxy);
        final TestWithParameters test = new TestWithParameters("[" + name + "]", testClass, asList(handler));
        // create/add j8unit test runner
        final ParametersRunnerFactory runnerFactory = getAnnotation(suiteClass, UseParametersRunnerFactory.class).value().newInstance();
        final Runner runner = runnerFactory.createRunnerForTestWithParameters(test);
        this.runners.add(runner);
        // create/add j8unit report runners
        final String reporterName = testName(index, discovery.reportName(), candidate.getName());
        final Runner reporter = this.reportingPseudoTest(index, reporterName, candidate, //
                                                         missings, discovery.ignoreMissings(), //
                                                         invalids, discovery.ignoreInvalids(), //
                                                         runnerFactory);
        this.runners.add(reporter);
    }

    /**
     * Inserts an ad-hoc {@link Runner test runner} for
     * {@linkplain InstanciationStrategies#discoverInstanciations(Class) each available instance} of the given
     * {@code candidate} type. In addition, each runner comes along with an
     * {@linkplain #reportingPseudoTest(int, String, Class, List, boolean, List, boolean, ParametersRunnerFactory)
     * according reporting runner}.
     *
     * @see InstanciationStrategies#discoverInstanciations(Class)
     * @see #insertTestRunnersForClassConformance(Class, Class)
     *
     * @param suiteClass
     *            the test suite class
     * @param candidate
     *            the current API candidate
     * @throws NoSuchMethodException
     *             if {@link java.lang.reflect.Constructor#newInstance(Object...)} fails (either for value of
     *             {@link InstanceTestsDiscovery#value()} or for value of {@link UseParametersRunnerFactory#value()})
     * @throws SecurityException
     *             if {@link java.lang.reflect.Constructor#newInstance(Object...)} fails (either for value of
     *             {@link InstanceTestsDiscovery#value()} or for value of {@link UseParametersRunnerFactory#value()})
     * @throws IllegalAccessException
     *             if {@link java.lang.reflect.Constructor#newInstance(Object...)} fails (either for value of
     *             {@link InstanceTestsDiscovery#value()} or for value of {@link UseParametersRunnerFactory#value()})
     * @throws IllegalArgumentException
     *             if {@link java.lang.reflect.Constructor#newInstance(Object...)} fails (either for value of
     *             {@link InstanceTestsDiscovery#value()} or for value of {@link UseParametersRunnerFactory#value()})
     * @throws InstantiationException
     *             if {@link java.lang.reflect.Constructor#newInstance(Object...)} fails (either for value of
     *             {@link InstanceTestsDiscovery#value()} or for value of {@link UseParametersRunnerFactory#value()})
     * @throws InvocationTargetException
     *             if {@link java.lang.reflect.Constructor#newInstance(Object...)} fails (either for value of
     *             {@link InstanceTestsDiscovery#value()} or for value of {@link UseParametersRunnerFactory#value()})
     * @throws InitializationError
     *             if {@linkplain ParametersRunnerFactory#createRunnerForTestWithParameters(TestWithParameters)
     *             creation} of the parameterised test runners fails
     */
    private final void insertTestRunnersForInstanceConformance(final Class<?> suiteClass, final Class<?> candidate)
    throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InstantiationException, InvocationTargetException,
    InitializationError {
        assert suiteClass != null;
        assert candidate != null;
        // create proxy
        final List<Throwable> missings = new ArrayList<>();
        final Consumer<ClassNotFoundException> missingsHandler = missings::add;
        final List<Throwable> invalids = new ArrayList<>();
        final Consumer<Class<?>> invalidsHandler = t -> invalids.add(new ClassCastException(format(WRONG_TYPE, t, "instance", candidate)));
        final InstanceTestsDiscovery discovery = getAnnotation(suiteClass, InstanceTestsDiscovery.class);
        final Set<Class<?>> interfaces = discoverJ8TestInterfaces(candidate, getStrategy(discovery), missingsHandler, invalidsHandler);
        final Class<?> proxy = adHocProxyTestClass(interfaces);
        for (final Entry<String, Callable<?>> instanciation : discoverInstanciations(candidate).entrySet()) {
            // create invocation handler
            final Callable<?> sutFactory = instanciation.getValue();
            final InvocationHandler handler = adHocInvocationHandler(sutFactory);
            // create parameterised test
            final int index = ++this.counter;
            final String name = testName(index, discovery.name(), candidate.getName(), instanciation.getKey());
            final TestClass testClass = this.createTestClass(proxy);
            final TestWithParameters test = new TestWithParameters("[" + name + "]", testClass, asList(handler));
            // create/add j8unit test runner
            final ParametersRunnerFactory runnerFactory = getAnnotation(suiteClass, UseParametersRunnerFactory.class).value().newInstance();
            final Runner runner = runnerFactory.createRunnerForTestWithParameters(test);
            this.runners.add(runner);
            // create/add j8unit report runners
            final String reporterName = testName(index, discovery.reportName(), candidate.getName(), instanciation.getKey());
            final Runner reporter = this.reportingPseudoTest(index, reporterName, candidate, //
                                                             missings, discovery.ignoreMissings(), //
                                                             invalids, discovery.ignoreInvalids(), //
                                                             runnerFactory);
            this.runners.add(reporter);
        }
    }

    /**
     * Creates a test name (similar to
     * {@link org.junit.runners.Parameterized#createTestWithParameters(TestClass, String, int, Object[])}).
     *
     * @param index
     *            the current test number
     * @param pattern
     *            the {@link MessageFormat}-based name pattern
     * @param arguments
     *            object(s) to format
     * @return
     */
    private static final String testName(final int index, final String pattern, final Object... arguments) {
        final String indexedPattern = pattern.replaceAll("\\{index\\}", Integer.toString(index));
        return MessageFormat.format(indexedPattern, arguments);
    }

    /**
     * Returns a test runner that reports the result of the j8unit test interface discovery. The reporting runner
     * executes all tests of {@link SummaryTest}, whereas these test will succeed, will be ignored, or will fail
     * according to the provided failures and its lenity.
     *
     * @param index
     *            the index of the API conformance runner this reporting test runner belongs to
     * @param name
     *            the name of this reporting test runner
     * @param candidate
     *            the API candidate
     * @param missings
     *            all missing j8unit interfaces
     * @param ignoreMissings
     *            flag to specify the lenity on missing j8unit interfaces
     * @param invalids
     *            all invalid types
     * @param ignoreInvalids
     *            flag to specify the lenity on invalid j8unit interfaces
     * @param runnerFactory
     *            the factory to create a runner for tests with parameters
     * @return the reporting test runner
     * @throws InitializationError
     *             if {@linkplain ParametersRunnerFactory#createRunnerForTestWithParameters(TestWithParameters)
     *             creation} of the parameterised reporting test runner fails
     */
    private final Runner reportingPseudoTest(final int index, final String name, final Class<?> candidate, final List<Throwable> missings,
                                             final boolean ignoreMissings, final List<Throwable> invalids, final boolean ignoreInvalids,
                                             final ParametersRunnerFactory runnerFactory)
    throws InitializationError {
        assert name != null;
        assert candidate != null;
        assert missings != null;
        assert invalids != null;
        assert runnerFactory != null;
        final TestClass testClass = this.createTestClass(SummaryTest.class);
        final List<Object> constructorArgs = asList(missings, ignoreMissings, invalids, ignoreInvalids);
        final TestWithParameters test = new TestWithParameters("[" + name + "]", testClass, constructorArgs);
        return runnerFactory.createRunnerForTestWithParameters(test);
    }

    /**
     * <p>
     * Returns all j8unit test interfaces representing all the reusable tests according to the given {@code candiate}
     * class. The interface discovery is controlled by the given {@code strategy}; any missing interface is relayed to
     * the given {@code missingsHandler}, any invalid type is relayed to the given {@code invalidsHandler}.
     * </p>
     * <p>
     * Invalid types are:
     * </p>
     * <dl>
     * <dt>any <strong>non-{@code public}</strong> type &hellip;</dt>
     * <dd>&hellip; because otherwise the {@link Proxy} wont be {@code public} neither!</dd>
     * <dt>any <strong>non-{@code interface}</strong> type &hellip;</dt>
     * <dd>&hellip; because {@link Proxy#getProxyClass(ClassLoader, Class...)} can handle only interfaces!</dd>
     * <dt>any <strong>annotation</strong> type &hellip;</dt>
     * <dd>&hellip; because {@link Proxy#getProxyClass(ClassLoader, Class...)} can handle only <em>pure</em>
     * interfaces!</dd>
     * </dl>
     *
     * @param candidate
     *            the candidate class
     * @param strategy
     *            the j8unit interface discovery strategy
     * @param missingsHandler
     *            the consumer of any missing j8unit interface
     * @param invalidsHandler
     *            the consumer of any invalid j8unit interface
     * @return all according j8unit test interfaces
     */
    private static final Set<Class<?>> discoverJ8TestInterfaces(final Class<?> candidate,
                                                                final BiFunction<? super Class<?>, ? super Consumer<? super ClassNotFoundException>, ? extends Set<Class<?>>> strategy,
                                                                final Consumer<? super ClassNotFoundException> missingsHandler,
                                                                final Consumer<? super Class<?>> invalidsHandler) {
        assert candidate != null;
        assert strategy != null;
        assert missingsHandler != null;
        assert invalidsHandler != null;
        final Stream<Class<?>> typeHierarchy = getTypeHierarchyAsStream(candidate);
        final Stream<Class<?>> discoveredTestTypes = typeHierarchy.flatMap(t -> strategy.apply(t, missingsHandler).stream());
        final Stream<Class<?>> publicTypes = discoveredTestTypes.filter(consumeFalse(t -> isPublic(t.getModifiers()), invalidsHandler::accept));
        final Stream<Class<?>> testInterfaces = publicTypes.filter(consumeFalse(Class::isInterface, invalidsHandler::accept));
        final Stream<Class<?>> validInterfaces = testInterfaces.filter(consumeFalse(c -> !c.isAnnotation(), invalidsHandler::accept));
        return validInterfaces.collect(toCollection(LinkedHashSet::new));
    }

    /**
     * Returns an ad-hocly created {@link Proxy} class implementing all of the given j8unit test interfaces plus
     * {@link FactoryBasedJ8UnitTest}.
     *
     * @param j8ClassTests
     *            the set of j8unit test interfaces
     * @return an ad-hocly created {@link Proxy} class implementing all of the given j8unit test interfaces
     */
    private static final Class<?> adHocProxyTestClass(final Set<Class<?>> j8ClassTests) {
        assert j8ClassTests != null;
        j8ClassTests.add(FactoryBasedJ8UnitTest.class);
        j8ClassTests.removeAll(redundantTypes(j8ClassTests));
        assert !j8ClassTests.isEmpty();
        assert j8ClassTests.stream().allMatch(Class::isInterface);
        return getProxyClass(getSystemClassLoader(), j8ClassTests.toArray(new Class<?>[0]));
    }

    /**
     * <p>
     * Returns an ad-hocly created {@link InvocationHandler} that:
     * </p>
     * <ol>
     * <li>tries to serve the invoked method by reusing one of its non-{@code abstract} super types' methods,</li>
     * <li>implements the {@link #SUT_FACTORY_METHOD subject-under-test factory method} of
     * {@link FactoryBasedJ8UnitTest} by constantly returning the given {@code factory},</li>
     * <li>serves the invoked method by reusing one of its super types' methods&nbsp;&ndash; even if that super method
     * is {@code abstract},</li>
     * <li>fails with an {@link UnsupportedOperationException} if none of its super types provides the invoked
     * method.</li>
     * </ol>
     *
     * @param factory
     *            the subject-under-test factory to use when serving {@link #SUT_FACTORY_METHOD}
     * @return an ad-hocly created {@code InvocationHandler} with custom behaviour
     */
    private static final InvocationHandler adHocInvocationHandler(final Callable<?> factory) {
        assert factory != null;
        InvocationHandler handler = fail(UnsupportedOperationException::new);
        /*
         * Actually, there should be no invocation of an abstract {@link Test} because (a) {@link Proxy} does not
         * provide any {@link Test methods} and (b) {@link
         * org.j8unit.runners.model.J8TestClass#scanAnnotatedDefaultMethods(Map)} uses {@code default} methods only.
         *
         * Nevertheless, {@link org.j8unit.util.Reflection#ENFORCE_ABSTRACT} flag enforces abstract methods to be
         * invoked, just to cause an according error.
         */
        handler = trySuperTypesFirst(handler, ENFORCE_ABSTRACT);
        /*
         * In case the {@linkplain #SUT_FACTORY_METHOD factory method} is overridden, this dispatching will not be
         * called ...
         */
        handler = dispatch(SUT_FACTORY_METHOD, constantResult(factory), handler);
        /*
         * ... because the overriding (non-{@code abstract}) method will be called before.
         */
        handler = trySuperTypesFirst(handler, SKIP_ABSTRACT);
        return handler;
    }

    /**
     * Reflective representation of {@link FactoryBasedJ8UnitTest#getSUTFactory()}.
     */
    private static final Method SUT_FACTORY_METHOD;
    static {
        try {
            SUT_FACTORY_METHOD = FactoryBasedJ8UnitTest.class.getMethod("getSUTFactory");
            assert isPublic(SUT_FACTORY_METHOD.getModifiers());
            assert isAbstract(SUT_FACTORY_METHOD.getModifiers());
            assert Callable.class.equals(SUT_FACTORY_METHOD.getReturnType());
        } catch (final NoSuchMethodException | SecurityException wtf) {
            throw new ExceptionInInitializerError(wtf);
        }
    }

}
