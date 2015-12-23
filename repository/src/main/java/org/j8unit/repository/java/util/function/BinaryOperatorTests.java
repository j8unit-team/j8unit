package org.j8unit.repository.java.util.function;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.function.BinaryOperator interface
 * java.util.function.BinaryOperator}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.util.function.BinaryOperatorTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.function.BinaryOperatorClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.function.BinaryOperator
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BinaryOperatorTests<SUT extends java.util.function.BinaryOperator<T>, T>
extends org.j8unit.repository.java.util.function.BiFunctionTests<SUT, T, T, T> {

}
