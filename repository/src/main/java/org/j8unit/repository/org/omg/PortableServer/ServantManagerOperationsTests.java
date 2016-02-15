package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableServer.ServantManagerOperations interface
 * org.omg.PortableServer.ServantManagerOperations}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link ServantManagerOperationsClassTests}.
 * </p>
 *
 * @see org.omg.PortableServer.ServantManagerOperations interface org.omg.PortableServer.ServantManagerOperations (the
 *      hereby targeted class-under-test class)
 * @see ServantManagerOperationsClassTests ServantManagerOperationsClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServantManagerOperationsTests<SUT extends org.omg.PortableServer.ServantManagerOperations>
extends RepositoryTests<SUT> {

}
