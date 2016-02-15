package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableServer.RequestProcessingPolicy interface
 * org.omg.PortableServer.RequestProcessingPolicy}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link RequestProcessingPolicyClassTests}.
 * </p>
 *
 * @see org.omg.PortableServer.RequestProcessingPolicy interface org.omg.PortableServer.RequestProcessingPolicy (the
 *      hereby targeted class-under-test class)
 * @see RequestProcessingPolicyClassTests RequestProcessingPolicyClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RequestProcessingPolicyTests<SUT extends org.omg.PortableServer.RequestProcessingPolicy>
extends RequestProcessingPolicyOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.PolicyTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
