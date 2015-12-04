package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableServer.ServantLocator interface org.omg.PortableServer.ServantLocator},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableServer.ServantLocatorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ServantLocatorTests<SUT extends org.omg.PortableServer.ServantLocator>
extends org.j8unit.repository.org.omg.PortableServer.ServantLocatorOperationsTests<SUT>, org.j8unit.repository.org.omg.PortableServer.ServantManagerTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
