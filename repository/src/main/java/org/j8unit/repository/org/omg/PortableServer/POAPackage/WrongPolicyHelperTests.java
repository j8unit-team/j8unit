package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableServer.POAPackage.WrongPolicyHelper class
 * org.omg.PortableServer.POAPackage.WrongPolicyHelper}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link WrongPolicyHelperClassTests}.
 * </p>
 *
 * @see org.omg.PortableServer.POAPackage.WrongPolicyHelper class org.omg.PortableServer.POAPackage.WrongPolicyHelper
 *      (the hereby targeted class-under-test class)
 * @see WrongPolicyHelperClassTests WrongPolicyHelperClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WrongPolicyHelperTests<SUT extends org.omg.PortableServer.POAPackage.WrongPolicyHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
