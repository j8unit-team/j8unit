package org.j8unit.repository.java.io;

import java.io.OptionalDataException;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link OptionalDataException public class java.io.OptionalDataException}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link OptionalDataExceptionClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface OptionalDataExceptionTests<SUT extends OptionalDataException>
extends ObjectStreamExceptionTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.io.OptionalDataException]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.io.OptionalDataException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.io.OptionalDataException]
}
