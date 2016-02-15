package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.Current interface org.omg.CORBA.Current}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link CurrentClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.Current interface org.omg.CORBA.Current (the hereby targeted class-under-test class)
 * @see CurrentClassTests CurrentClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CurrentTests<SUT extends org.omg.CORBA.Current>
extends CurrentOperationsTests<SUT>, ObjectTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
