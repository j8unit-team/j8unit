package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;
import org.omg.PortableServer.ServantActivator;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link ServantActivator public abstract interface org.omg.PortableServer.ServantActivator}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.org.omg.PortableServer.ServantActivatorClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServantActivatorTests<SUT extends ServantActivator>
extends ServantActivatorOperationsTests<SUT>, ServantManagerTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.ServantActivator]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer.ServantActivator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.ServantActivator]

}
