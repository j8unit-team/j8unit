package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.org.omg.CORBA.PolicyTests;
import org.junit.experimental.categories.Category;
import org.omg.PortableServer.LifespanPolicy;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link LifespanPolicy
 * public abstract interface org.omg.PortableServer.LifespanPolicy}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.org.omg.PortableServer.LifespanPolicyClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LifespanPolicyTests<SUT extends LifespanPolicy>
extends LifespanPolicyOperationsTests<SUT>, PolicyTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.LifespanPolicy]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.PortableServer.LifespanPolicy]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.PortableServer.LifespanPolicy]

}
