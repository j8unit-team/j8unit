package org.j8unit.repository.javax.management.remote.rmi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.remote.rmi.RMIJRMPServerImpl class
 * javax.management.remote.rmi.RMIJRMPServerImpl}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link RMIJRMPServerImplClassTests}.
 * </p>
 *
 * @see javax.management.remote.rmi.RMIJRMPServerImpl class javax.management.remote.rmi.RMIJRMPServerImpl (the hereby
 *      targeted class-under-test class)
 * @see RMIJRMPServerImplClassTests RMIJRMPServerImplClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RMIJRMPServerImplTests<SUT extends javax.management.remote.rmi.RMIJRMPServerImpl>
extends RMIServerImplTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIJRMPServerImpl#toStub() public java.rmi.Remote
     * javax.management.remote.rmi.RMIJRMPServerImpl.toStub() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIJRMPServerImpl#toStub() public java.rmi.Remote
     * javax.management.remote.rmi.RMIJRMPServerImpl.toStub() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.rmi.RMIJRMPServerImpl#toStub() public java.rmi.Remote
     *      javax.management.remote.rmi.RMIJRMPServerImpl.toStub() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toStub()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
