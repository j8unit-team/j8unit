package org.j8unit.runners;

import static java.util.Objects.requireNonNull;
import org.j8unit.runners.model.J8TestClass;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

/**
 * <p>
 * Extension of {@link BlockJUnit4ClassRunner} to {@linkplain #createTestClass(Class) support the extended test class
 * model}.
 *
 * To invoke this custom {@link org.junit.runner.Runner} just use the {@link org.junit.runner.RunWith &#64;RunWith}
 * annotation:
 * </p>
 *
 * <pre class="brush:java">
 * &#064;RunWith(J8BlockJUnit4ClassRunner.class)
 * public class FoobarTest {
 *     [&hellip;]
 * }
 * </pre>
 *
 * @see org.junit.runner.RunWith
 * @see J8TestClass
 *
 * @since 4.12
 */
public class J8BlockJUnit4ClassRunner
extends BlockJUnit4ClassRunner {

    /**
     * <p>
     * Creates a {@link J8BlockJUnit4ClassRunner} instance to run the tests of the given {@link Class}.
     * </p>
     *
     * @param clazz
     *            the test class
     * @throws InitializationError
     *             if the test class is malformed
     */
    public J8BlockJUnit4ClassRunner(final Class<?> clazz)
    throws InitializationError {
        super(requireNonNull(clazz));
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
