package org.j8unit.cucumber.runners;

import static java.util.Objects.requireNonNull;
import org.junit.runners.model.InitializationError;
import org.j8unit.runners.model.J8TestClass;
import cucumber.api.junit.Cucumber;

/**
 * <p>
 * Extension of {@link Cucumber} to {@linkplain #createTestClass(Class) support the extend test class
 * model}.
 *
 * To invoke this custom {@link org.junit.runner.Runner} just use the {@link org.junit.runner.RunWith &#64;RunWith}
 * annotation:
 * </p>
 *
 * <pre>
 * &#064;RunWith(J8UnitCucumber.class)
 * public class FoobarTest {
 *     [&hellip;]
 * }
 * </pre>
 *
 * @see org.junit.runner.RunWith
 * @see J8TestClass
 */
public class J8UnitCucumber
extends Cucumber {

    /**
     * <p>
     * Constructs a new {@code J8UnitCucumber} and initializes a {@link TestContextManager} to provide Cucumber testing
     * functionality to enhanced standard JUnit tests.
     * </p>
     *
     * @param clazz
     *            the test class to be run
     * @see #createTestContextManager(Class)
     * @see #createTestClass(Class)
     */
    public J8UnitCucumber(final Class<?> clazz)
    throws InitializationError, java.io.IOException  {
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
