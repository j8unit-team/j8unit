package org.j8unit.repository.java.nio.charset;

import java.nio.charset.CoderMalfunctionError;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link CoderMalfunctionError public class java.nio.charset.CoderMalfunctionError}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.nio.charset.CoderMalfunctionErrorClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CoderMalfunctionErrorTests<SUT extends CoderMalfunctionError>
extends org.j8unit.repository.java.lang.ErrorTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.charset.CoderMalfunctionError]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.charset.CoderMalfunctionError]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.charset.CoderMalfunctionError]
}
