package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.org.omg.CORBA.SystemExceptionTests;
import org.junit.experimental.categories.Category;
import org.omg.CORBA.portable.UnknownException;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link UnknownException public class org.omg.CORBA.portable.UnknownException}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.org.omg.CORBA.portable.UnknownExceptionClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnknownExceptionTests<SUT extends UnknownException>
extends SystemExceptionTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CORBA.portable.UnknownException]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CORBA.portable.UnknownException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CORBA.portable.UnknownException]

}
