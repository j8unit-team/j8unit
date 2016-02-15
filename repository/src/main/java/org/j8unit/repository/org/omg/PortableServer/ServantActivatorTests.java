package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableServer.ServantActivator interface
 * org.omg.PortableServer.ServantActivator}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ServantActivatorClassTests}.
 * </p>
 *
 * @see org.omg.PortableServer.ServantActivator interface org.omg.PortableServer.ServantActivator (the hereby targeted
 *      class-under-test class)
 * @see ServantActivatorClassTests ServantActivatorClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServantActivatorTests<SUT extends org.omg.PortableServer.ServantActivator>
extends ServantActivatorOperationsTests<SUT>, ServantManagerTests<SUT>, org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
