package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableServer.LifespanPolicyOperations interface
 * org.omg.PortableServer.LifespanPolicyOperations}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link LifespanPolicyOperationsClassTests}.
 * </p>
 *
 * @see org.omg.PortableServer.LifespanPolicyOperations interface org.omg.PortableServer.LifespanPolicyOperations (the
 *      hereby targeted class-under-test class)
 * @see LifespanPolicyOperationsClassTests LifespanPolicyOperationsClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LifespanPolicyOperationsTests<SUT extends org.omg.PortableServer.LifespanPolicyOperations>
extends org.j8unit.repository.org.omg.CORBA.PolicyOperationsTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.LifespanPolicyOperations#value() public abstract
     * org.omg.PortableServer.LifespanPolicyValue org.omg.PortableServer.LifespanPolicyOperations.value()}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.LifespanPolicyOperations#value() public abstract
     * org.omg.PortableServer.LifespanPolicyValue org.omg.PortableServer.LifespanPolicyOperations.value()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.LifespanPolicyOperations#value() public abstract
     *      org.omg.PortableServer.LifespanPolicyValue org.omg.PortableServer.LifespanPolicyOperations.value() (the
     *      hereby targeted method-under-test)
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
