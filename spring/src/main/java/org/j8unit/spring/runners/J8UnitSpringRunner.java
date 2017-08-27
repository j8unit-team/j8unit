package org.j8unit.spring.runners;

import static java.util.Objects.requireNonNull;
import org.junit.runners.model.InitializationError;
import org.springframework.test.context.TestContextManager;

/**
 * {@code J8UnitSpringRunner} is an <em>alias</em> for the {@link J8UnitSpringJUnit4ClassRunner}.
 *
 * <p>
 * If you would like to use the Spring TestContext Framework with this runner, use
 * {@link org.springframework.test.context.junit4.rules.SpringClassRule} and
 * {@link org.springframework.test.context.junit4.rules.SpringMethodRule}.
 *
 * @see J8UnitSpringJUnit4ClassRunner
 * @see org.springframework.test.context.junit4.rules.SpringClassRule
 * @see org.springframework.test.context.junit4.rules.SpringMethodRule
 */
public class J8UnitSpringRunner
extends J8UnitSpringJUnit4ClassRunner {

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
    public J8UnitSpringRunner(final Class<?> clazz)
    throws InitializationError {
        super(requireNonNull(clazz));
    }

}
