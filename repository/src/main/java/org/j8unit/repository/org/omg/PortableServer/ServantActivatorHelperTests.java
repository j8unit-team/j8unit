package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableServer.ServantActivatorHelper class
 * org.omg.PortableServer.ServantActivatorHelper}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ServantActivatorHelperClassTests}.
 * </p>
 *
 * @see org.omg.PortableServer.ServantActivatorHelper class org.omg.PortableServer.ServantActivatorHelper (the hereby
 *      targeted class-under-test class)
 * @see ServantActivatorHelperClassTests ServantActivatorHelperClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServantActivatorHelperTests<SUT extends org.omg.PortableServer.ServantActivatorHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
