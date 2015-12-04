package org.j8unit.repository.java.util.function;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.function.BinaryOperator interface java.util.function.BinaryOperator}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.function.BinaryOperatorClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BinaryOperatorTests<SUT extends java.util.function.BinaryOperator<T>, T>
extends org.j8unit.repository.java.util.function.BiFunctionTests<SUT, T, T, T> {

}
