package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableServer.AdapterActivator interface
 * org.omg.PortableServer.AdapterActivator}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link AdapterActivatorClassTests}.
 * </p>
 *
 * @see org.omg.PortableServer.AdapterActivator interface org.omg.PortableServer.AdapterActivator (the hereby targeted
 *      class-under-test class)
 * @see AdapterActivatorClassTests AdapterActivatorClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AdapterActivatorTests<SUT extends org.omg.PortableServer.AdapterActivator>
extends AdapterActivatorOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.ObjectTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
