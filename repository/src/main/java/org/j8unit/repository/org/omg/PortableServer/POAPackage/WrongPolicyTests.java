package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableServer.POAPackage.WrongPolicy class
 * org.omg.PortableServer.POAPackage.WrongPolicy}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link WrongPolicyClassTests}.
 * </p>
 *
 * @see org.omg.PortableServer.POAPackage.WrongPolicy class org.omg.PortableServer.POAPackage.WrongPolicy (the hereby
 *      targeted class-under-test class)
 * @see WrongPolicyClassTests WrongPolicyClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WrongPolicyTests<SUT extends org.omg.PortableServer.POAPackage.WrongPolicy>
extends org.j8unit.repository.org.omg.CORBA.UserExceptionTests<SUT> {

}
