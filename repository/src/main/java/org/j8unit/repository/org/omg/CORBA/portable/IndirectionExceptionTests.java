package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.portable.IndirectionException class
 * org.omg.CORBA.portable.IndirectionException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link IndirectionExceptionClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.portable.IndirectionException class org.omg.CORBA.portable.IndirectionException (the hereby
 *      targeted class-under-test class)
 * @see IndirectionExceptionClassTests IndirectionExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IndirectionExceptionTests<SUT extends org.omg.CORBA.portable.IndirectionException>
extends org.j8unit.repository.org.omg.CORBA.SystemExceptionTests<SUT> {

}
