package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CORBA.IRObject interface org.omg.CORBA.IRObject}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA.IRObjectTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CORBA.IRObjectClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CORBA.IRObject
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IRObjectTests<SUT extends org.omg.CORBA.IRObject>
extends org.j8unit.repository.org.omg.CORBA.IRObjectOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
