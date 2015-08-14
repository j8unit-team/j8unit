package de.informaticum.j8junit.runners;

import org.junit.runners.Parameterized;
import de.informaticum.j8junit.runners.model.J8TestClass;

/**
 * Extension of {@link Parameterized} to {@linkplain #createTestClass(Class) support the extended test class model}.
 *
 * To invoke this custom {@link org.junit.runner.Runner} just use {@link org.junit.runner.RunWith &#64;RunWith}
 * annotation; and (!) specify
 * {@linkplain de.informaticum.j8junit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory the custom
 * runner factory}:
 *
 * <pre>
 * &#064;RunWith(J8Parameterized.class)
 * &#064;UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
 * public class FoobarTest {
 *     [&hellip;]
 * }
 * </pre>
 *
 * @see org.junit.runner.RunWith
 * @see org.junit.runners.Parameterized.UseParametersRunnerFactory
 * @see de.informaticum.j8junit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory
 * @see J8TestClass
 * @author <a href="mailto:stefan.gasterstaedt@informaticum.de">Stefan Gasterst&auml;dt</a>
 */
public class J8Parameterized
extends Parameterized {

    /**
     * Creates a {@link J8Parameterized} instance to run the tests of the given {@link Class}.
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
     * Returns an {@linkplain J8TestClass extended test class model} of the given {@link Class}.
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
