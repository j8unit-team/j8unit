package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.PortableServer.POAManager interface
 * org.omg.PortableServer.POAManager}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.PortableServer.POAManagerTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.PortableServer.POAManagerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.PortableServer.POAManager
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface POAManagerTests<SUT extends org.omg.PortableServer.POAManager>
extends org.j8unit.repository.org.omg.PortableServer.POAManagerOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
