package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableServer.LifespanPolicy interface
 * org.omg.PortableServer.LifespanPolicy}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link LifespanPolicyClassTests}.
 * </p>
 *
 * @see org.omg.PortableServer.LifespanPolicy interface org.omg.PortableServer.LifespanPolicy (the hereby targeted
 *      class-under-test class)
 * @see LifespanPolicyClassTests LifespanPolicyClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LifespanPolicyTests<SUT extends org.omg.PortableServer.LifespanPolicy>
extends LifespanPolicyOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.PolicyTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
