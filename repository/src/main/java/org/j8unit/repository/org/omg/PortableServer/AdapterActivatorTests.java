package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableServer.AdapterActivator interface org.omg.PortableServer.AdapterActivator},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableServer.AdapterActivatorClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AdapterActivatorTests<SUT extends org.omg.PortableServer.AdapterActivator>
extends org.j8unit.repository.org.omg.PortableServer.AdapterActivatorOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
