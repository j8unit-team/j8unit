package org.j8unit.runners;

import org.j8unit.runners.model.J8TestClass;
import org.junit.runners.Parameterized;

/**
 * <p>
 * Extension of {@link Parameterized} to {@linkplain #createTestClass(Class) support the extended test class model}.
 *
 * To invoke this custom {@link org.junit.runner.Runner} just use {@link org.junit.runner.RunWith &#64;RunWith}
 * annotation; and (!) specify
 * {@linkplain org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory the custom runner factory}
 * in addition:
 * </p>
 *
 * <pre class="brush:java">
 * &#064;RunWith(J8Parameterized.class)
 * &#064;UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
 * public class FoobarTest {
 *     [&hellip;]
 * }
 * </pre>
 *
 * @see org.junit.runner.RunWith
 * @see org.junit.runners.Parameterized.UseParametersRunnerFactory
 * @see org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory
 * @see J8TestClass
 *
 * @since 4.12
 */
public class J8Parameterized
extends Parameterized {

    /*
     * TODO: Make {@link org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory} the default
     * factory for this {@link org.junit.runner.Runner}!
     */

    /**
     * <p>
     * Creates a {@link J8Parameterized} instance to run the tests of the given {@link Class}.
     * </p>
     *
     * @param clazz
     *            the parameterised test class
     * @throws Throwable
     *             if the parameterised test class is malformed
     */
    public J8Parameterized(final Class<?> clazz)
    throws Throwable {
        super(clazz);
    }

    /**
     * <p>
     * Returns an {@linkplain J8TestClass extended test class model} of the given {@link Class}.
     * </p>
     *
     * @param testClass
     *            the test class
     * @return an {@linkplain J8TestClass extended test class model} of the given {@link Class}
     */
    @Override
    protected J8TestClass createTestClass(final Class<?> testClass) {
        return new J8TestClass(testClass);
    }

}
