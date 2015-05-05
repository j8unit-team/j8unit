package de.informaticum.j8junit.runners;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;
import de.informaticum.j8junit.runners.model.J8TestClass;

/**
 * Extension of {@link BlockJUnit4ClassRunner} to {@linkplain #createTestClass(Class) support the extend test class
 * model}.
 *
 * @author <a href="mailto:stefan.gasterstaedt@informaticum.de">Stefan Gasterst&auml;dt</a>
 */
public class J8BlockJUnit4ClassRunner
extends BlockJUnit4ClassRunner {

    /**
     * Creates a {@link J8BlockJUnit4ClassRunner} to run the tests of the given {@link Class}.
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
