package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.PortableServer.RequestProcessingPolicyValue class
 * org.omg.PortableServer.RequestProcessingPolicyValue}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link RequestProcessingPolicyValueClassTests}.
 * </p>
 *
 * @see org.omg.PortableServer.RequestProcessingPolicyValue class org.omg.PortableServer.RequestProcessingPolicyValue
 *      (the hereby targeted class-under-test class)
 * @see RequestProcessingPolicyValueClassTests RequestProcessingPolicyValueClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RequestProcessingPolicyValueTests<SUT extends org.omg.PortableServer.RequestProcessingPolicyValue>
extends org.j8unit.repository.org.omg.CORBA.portable.IDLEntityTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.PortableServer.RequestProcessingPolicyValue#value() public int
     * org.omg.PortableServer.RequestProcessingPolicyValue.value()}.
     *
     * <p>
     * Test method for {@link org.omg.PortableServer.RequestProcessingPolicyValue#value() public int
     * org.omg.PortableServer.RequestProcessingPolicyValue.value()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.PortableServer.RequestProcessingPolicyValue#value() public int
     *      org.omg.PortableServer.RequestProcessingPolicyValue.value() (the hereby targeted method-under-test)
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
