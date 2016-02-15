package org.j8unit.repository.org.omg.PortableServer.POAManagerPackage;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableServer.POAManagerPackage.AdapterInactive class
 * org.omg.PortableServer.POAManagerPackage.AdapterInactive}. The complementary j8unit test interface containing the
 * class relevant aspects is {@link AdapterInactiveClassTests}.
 * </p>
 *
 * @see org.omg.PortableServer.POAManagerPackage.AdapterInactive class
 *      org.omg.PortableServer.POAManagerPackage.AdapterInactive (the hereby targeted class-under-test class)
 * @see AdapterInactiveClassTests AdapterInactiveClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AdapterInactiveTests<SUT extends org.omg.PortableServer.POAManagerPackage.AdapterInactive>
extends org.j8unit.repository.org.omg.CORBA.UserExceptionTests<SUT> {

}
