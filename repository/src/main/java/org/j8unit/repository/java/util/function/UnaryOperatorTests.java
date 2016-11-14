package org.j8unit.repository.java.util.function;

import java.util.function.UnaryOperator;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link UnaryOperator
 * public abstract interface java.util.function.UnaryOperator<T>}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.util.function.UnaryOperatorClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnaryOperatorTests<SUT extends UnaryOperator<T>, T>
extends FunctionTests<SUT, T, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.function.UnaryOperator]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.function.UnaryOperator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.function.UnaryOperator]

}
