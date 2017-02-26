package org.j8unit.runners.parameterized;

import static java.util.Objects.requireNonNull;
import org.j8unit.runners.model.J8TestClass;
import org.junit.runners.model.InitializationError;
import org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParameters;
import org.junit.runners.parameterized.TestWithParameters;

/**
 * <p>
 * An extension of {@link BlockJUnit4ClassRunnerWithParameters} in order to support the {@linkplain J8TestClass J8Unit
 * test class model}.
 * </p>
 *
 * @since 4.12
 */
public class J8BlockJUnit4ClassRunnerWithParameters
extends BlockJUnit4ClassRunnerWithParameters {

    public J8BlockJUnit4ClassRunnerWithParameters(final TestWithParameters test)
    throws InitializationError {
        super(requireNonNull(test));
    }

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

}
