package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.IRObject interface org.omg.CORBA.IRObject}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link IRObjectClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.IRObject interface org.omg.CORBA.IRObject (the hereby targeted class-under-test class)
 * @see IRObjectClassTests IRObjectClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IRObjectTests<SUT extends org.omg.CORBA.IRObject>
extends IRObjectOperationsTests<SUT>, ObjectTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
