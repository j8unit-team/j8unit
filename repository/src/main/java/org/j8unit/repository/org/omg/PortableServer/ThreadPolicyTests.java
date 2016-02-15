package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableServer.ThreadPolicy interface
 * org.omg.PortableServer.ThreadPolicy}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link ThreadPolicyClassTests}.
 * </p>
 *
 * @see org.omg.PortableServer.ThreadPolicy interface org.omg.PortableServer.ThreadPolicy (the hereby targeted
 *      class-under-test class)
 * @see ThreadPolicyClassTests ThreadPolicyClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ThreadPolicyTests<SUT extends org.omg.PortableServer.ThreadPolicy>
extends ThreadPolicyOperationsTests<SUT>, org.j8unit.repository.org.omg.CORBA.PolicyTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT> {

}
