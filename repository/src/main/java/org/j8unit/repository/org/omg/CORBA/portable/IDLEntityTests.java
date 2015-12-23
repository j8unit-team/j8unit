package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CORBA.portable.IDLEntity interface
 * org.omg.CORBA.portable.IDLEntity}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CORBA.portable.IDLEntityClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CORBA.portable.IDLEntity
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IDLEntityTests<SUT extends org.omg.CORBA.portable.IDLEntity>
extends org.j8unit.repository.java.io.SerializableTests<SUT> {

}
