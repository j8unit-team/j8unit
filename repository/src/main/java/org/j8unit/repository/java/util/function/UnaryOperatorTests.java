package org.j8unit.repository.java.util.function;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.function.UnaryOperator interface
 * java.util.function.UnaryOperator}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link UnaryOperatorClassTests}.
 * </p>
 *
 * @see java.util.function.UnaryOperator interface java.util.function.UnaryOperator (the hereby targeted
 *      class-under-test class)
 * @see UnaryOperatorClassTests UnaryOperatorClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnaryOperatorTests<SUT extends java.util.function.UnaryOperator<T>, T>
extends FunctionTests<SUT, T, T> {

}
