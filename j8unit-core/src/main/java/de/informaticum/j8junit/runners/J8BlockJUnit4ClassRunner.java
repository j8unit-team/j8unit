package de.informaticum.j8junit.runners;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;
import de.informaticum.j8junit.runners.model.J8TestClass;

/**
 * Extension of {@link BlockJUnit4ClassRunner} to {@linkplain #createTestClass(Class) support the extended test class
 * model}.
 *
 * To invoke this custom {@link org.junit.runner.Runner} just use the {@link org.junit.runner.RunWith &#64;RunWith}
 * annotation:
 *
 * <pre>
 * &#064;RunWith(J8BlockJUnit4ClassRunner.class)
 * public class FoobarTest {
 *     [&hellip;]
 * }
 * </pre>
 *
 * @see org.junit.runner.RunWith
 * @see J8TestClass
 * @author <a href="mailto:stefan.gasterstaedt@informaticum.de">Stefan Gasterst&auml;dt</a>
 */
public class J8BlockJUnit4ClassRunner
extends BlockJUnit4ClassRunner {

    /**
     * Creates a {@link J8BlockJUnit4ClassRunner} instance to run the tests of the given {@link Class}.
     *
     * @param clazz
     *            the test class
     * @throws InitializationError
     *             if the test class is malformed
     */
    public J8BlockJUnit4ClassRunner(final Class<?> clazz)
    throws InitializationError {
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
