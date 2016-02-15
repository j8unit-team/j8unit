package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableServer.ThreadPolicyOperations interface
 * org.omg.PortableServer.ThreadPolicyOperations}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ThreadPolicyOperationsClassTests}.
 * </p>
 *
 * @see org.omg.PortableServer.ThreadPolicyOperations interface org.omg.PortableServer.ThreadPolicyOperations (the
 *      hereby targeted class-under-test class)
 * @see ThreadPolicyOperationsClassTests ThreadPolicyOperationsClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ThreadPolicyOperationsTests<SUT extends org.omg.PortableServer.ThreadPolicyOperations>
extends org.j8unit.repository.org.omg.CORBA.PolicyOperationsTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.ThreadPolicyOperations#value() public abstract
     * org.omg.PortableServer.ThreadPolicyValue org.omg.PortableServer.ThreadPolicyOperations.value()}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.ThreadPolicyOperations#value() public abstract
     * org.omg.PortableServer.ThreadPolicyValue org.omg.PortableServer.ThreadPolicyOperations.value()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.ThreadPolicyOperations#value() public abstract
     *      org.omg.PortableServer.ThreadPolicyValue org.omg.PortableServer.ThreadPolicyOperations.value() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_value()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
