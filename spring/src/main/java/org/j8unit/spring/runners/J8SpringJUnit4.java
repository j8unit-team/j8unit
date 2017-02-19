package org.j8unit.spring.runners;

import org.j8unit.runners.model.J8TestClass;
import org.junit.runners.model.InitializationError;
import org.springframework.test.context.TestContextManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>
 * Extension of {@link SpringJUnit4ClassRunner} to {@linkplain #createTestClass(Class) support the extend test class
 * model}.
 *
 * To invoke this custom {@link org.junit.runner.Runner} just use the {@link org.junit.runner.RunWith &#64;RunWith}
 * annotation:
 * </p>
 *
 * <pre>
 * &#064;RunWith(J8SpringJUnit4ClassRunner.class)
 * public class FoobarTest {
 *     [&hellip;]
 * }
 * </pre>
 *
 * @see org.junit.runner.RunWith
 * @see J8TestClass
 */
public class J8SpringJUnit4
extends SpringJUnit4ClassRunner {

    /**
     * <p>
     * Constructs a new {@code J8SpringJUnit4ClassRunner} and initializes a {@link TestContextManager} to provide Spring
     * testing functionality to enhanced standard JUnit tests.
     * </p>
     *
     * @param clazz
     *            the test class to be run
     * @see #createTestContextManager(Class)
     * @see #createTestClass(Class)
     */
    public J8SpringJUnit4(final Class<?> clazz)
    throws InitializationError {
        super(clazz);
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
        return new J8TestClass(testClass);
    }
}
