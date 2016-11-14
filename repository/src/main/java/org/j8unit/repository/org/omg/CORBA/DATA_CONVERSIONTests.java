package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;
import org.omg.CORBA.DATA_CONVERSION;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link DATA_CONVERSION
 * public final class org.omg.CORBA.DATA_CONVERSION}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.org.omg.CORBA.DATA_CONVERSIONClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DATA_CONVERSIONTests<SUT extends DATA_CONVERSION>
extends SystemExceptionTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.DATA_CONVERSION]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.DATA_CONVERSION]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.DATA_CONVERSION]

}
