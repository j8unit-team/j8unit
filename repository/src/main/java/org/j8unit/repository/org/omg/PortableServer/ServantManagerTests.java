package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.PortableServer.ServantManager interface
 * org.omg.PortableServer.ServantManager}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.PortableServer.ServantManagerTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.PortableServer.ServantManagerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.PortableServer.ServantManager
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServantManagerTests<SUT extends org.omg.PortableServer.ServantManager>
extends org.j8unit.repository.org.omg.PortableServer.ServantManagerOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
