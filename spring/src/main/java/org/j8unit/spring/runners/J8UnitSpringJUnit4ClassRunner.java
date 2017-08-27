package org.j8unit.spring.runners;

import static java.util.Objects.requireNonNull;
import org.junit.runners.model.InitializationError;
import org.springframework.test.context.TestContextManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.j8unit.runners.model.J8TestClass;

/**
 * <p>
 * Extension of {@link SpringJUnit4ClassRunner} to {@linkplain #createTestClass(Class) support the extend test class
 * model}.
 *
 * If you would like to use the Spring TestContext Framework with this runner, use
 * {@link org.springframework.test.context.junit4.rules.SpringClassRule} and
 * {@link org.springframework.test.context.junit4.rules.SpringMethodRule}.
 *
 * @see J8UnitSpringJUnit4ClassRunner
 * @see org.springframework.test.context.junit4.rules.SpringClassRule
 * @see org.springframework.test.context.junit4.rules.SpringMethodRule
 * @see J8TestClass
 */
public class J8UnitSpringJUnit4ClassRunner
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
    public J8UnitSpringJUnit4ClassRunner(final Class<?> clazz)
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
