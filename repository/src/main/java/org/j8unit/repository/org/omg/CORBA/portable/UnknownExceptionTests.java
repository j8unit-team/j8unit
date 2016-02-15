package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.portable.UnknownException class
 * org.omg.CORBA.portable.UnknownException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link UnknownExceptionClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.portable.UnknownException class org.omg.CORBA.portable.UnknownException (the hereby targeted
 *      class-under-test class)
 * @see UnknownExceptionClassTests UnknownExceptionClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnknownExceptionTests<SUT extends org.omg.CORBA.portable.UnknownException>
extends org.j8unit.repository.org.omg.CORBA.SystemExceptionTests<SUT> {

}
