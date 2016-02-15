package org.j8unit.repository.java.util.function;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.function.BinaryOperator interface
 * java.util.function.BinaryOperator}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link BinaryOperatorClassTests}.
 * </p>
 *
 * @see java.util.function.BinaryOperator interface java.util.function.BinaryOperator (the hereby targeted
 *      class-under-test class)
 * @see BinaryOperatorClassTests BinaryOperatorClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BinaryOperatorTests<SUT extends java.util.function.BinaryOperator<T>, T>
extends BiFunctionTests<SUT, T, T, T> {

}
