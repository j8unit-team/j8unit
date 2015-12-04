package org.j8unit.repository.java.util.function;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.function.UnaryOperator interface java.util.function.UnaryOperator}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.function.UnaryOperatorClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnaryOperatorTests<SUT extends java.util.function.UnaryOperator<T>, T>
extends org.j8unit.repository.java.util.function.FunctionTests<SUT, T, T> {

}
