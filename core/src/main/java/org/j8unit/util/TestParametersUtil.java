package org.j8unit.util;

import static java.util.Arrays.asList;
import java.util.List;
import java.util.concurrent.Callable;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.J8UnitTest;

/**
 * <p>
 * Utility enum (aka. helper class) providing smart methods to prepare the parameters of parameterised JUnit/J8Unit
 * tests.
 * </p>
 *
 * @since 4.12
 */
public enum TestParametersUtil {
    ;

    /**
     * <p>
     * Prepares a variable number of subject-under-test {@code instances} to be used in conjunction with parameterised
     * JUnit/J8Unit tests.
     *
     * This preparation methods supports tests with a single parameter only. According to the documentation of
     * {@link org.junit.runners.Parameterized}, this method therefore returns an {@link Iterable} of these objects.
     * (Actually it returns a {@link List} which is a slightly more specific {@code Iterable} container.)
     * </p>
     *
     * <p>
     * Typically, this method is used for instance based {@link J8UnitTest J8Unit tests}, executed by
     * {@link org.j8unit.runners.J8Parameterized} (together with
     * {@link org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory}).
     * </p>
     *
     * TODO: Give some example usages.
     *
     * @see #testParametersOf(Callable...)
     * @see #testParametersOfEnumClass(Class)
     * @see org.junit.runners.Parameterized
     * @see org.j8unit.runners.J8Parameterized
     *
     * @param instances
     *            the subject-under-test instances
     * @return a list of the subject-under-test {@code instances}
     */
    @SafeVarargs
    public static final <T> List<T> testParametersOf(final T... instances) {
        return asList(instances);
    }

    /**
     * <p>
     * Prepares a variable number of subject-under-test instance {@code factories} to be used in conjunction with
     * parameterised JUnit/J8Unit tests. Because of the {@link Callable}-API, this method allows to immediately use the
     * lambda notation of constructor references and similar (e.&thinsp;g.,
     * {@code testParametersOf(ArrayList::new, LinkedList::new, Collections::emptyList)}).
     *
     * This preparation methods supports tests with a single parameter only. According to the documentation of
     * {@link org.junit.runners.Parameterized}, this method therefore returns an {@link Iterable} of these objects.
     * (Actually it returns a {@link List} which is a slightly more specific {@code Iterable} container.)
     * </p>
     *
     * <p>
     * Typically, this method is used for {@link FactoryBasedJ8UnitTest factory based J8Unit tests}, executed by
     * {@link org.j8unit.runners.J8Parameterized} (together with
     * {@link org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory}).
     * </p>
     *
     * TODO: Give some example usages.
     *
     * @see #testParametersOf(Object...)
     * @see #testParametersOfEnumClass(Class)
     * @see org.junit.runners.Parameterized
     * @see org.j8unit.runners.J8Parameterized
     *
     * @param factories
     *            the subject-under-test instance factories
     * @return a list of the subject-under-test instance {@code factories}
     */
    @SafeVarargs
    public static final <T> List<Callable<T>> testParametersOf(final Callable<T>... factories) {
        return asList(factories);
    }

    /**
     * <p>
     * Returns a list containing all values comprising the {@code enum} class represented by the given {@code type}.
     * </p>
     *
     * TODO: Give some example usages.
     *
     * @param type
     *            the given {@code enum} type
     * @return a list of the subject-under-test instances (actually all {@code enum}'s elements)
     */
    public static final <E extends Enum<E>> List<E> testParametersOfEnumClass(final Class<E> type) {
        assert type.isEnum();
        return asList(type.getEnumConstants());
    }

}
