package org.j8unit.repository.javax.management.remote.rmi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.remote.rmi.RMIServerImpl_Stub class
 * javax.management.remote.rmi.RMIServerImpl_Stub}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link RMIServerImpl_StubClassTests}.
 * </p>
 *
 * @see javax.management.remote.rmi.RMIServerImpl_Stub class javax.management.remote.rmi.RMIServerImpl_Stub (the hereby
 *      targeted class-under-test class)
 * @see RMIServerImpl_StubClassTests RMIServerImpl_StubClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RMIServerImpl_StubTests<SUT extends javax.management.remote.rmi.RMIServerImpl_Stub>
extends RMIServerTests<SUT>, org.j8unit.repository.java.rmi.server.RemoteStubTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIServerImpl_Stub#getVersion() public java.lang.String
     * javax.management.remote.rmi.RMIServerImpl_Stub.getVersion() throws java.rmi.RemoteException}.
     *
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIServerImpl_Stub#getVersion() public java.lang.String
     * javax.management.remote.rmi.RMIServerImpl_Stub.getVersion() throws java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.rmi.RMIServerImpl_Stub#getVersion() public java.lang.String
     *      javax.management.remote.rmi.RMIServerImpl_Stub.getVersion() throws java.rmi.RemoteException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getVersion()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIServerImpl_Stub#newClient(Object) public
     * javax.management.remote.rmi.RMIConnection
     * javax.management.remote.rmi.RMIServerImpl_Stub.newClient(java.lang.Object) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.management.remote.rmi.RMIServerImpl_Stub#newClient(Object) public
     * javax.management.remote.rmi.RMIConnection
     * javax.management.remote.rmi.RMIServerImpl_Stub.newClient(java.lang.Object) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.rmi.RMIServerImpl_Stub#newClient(Object) public
     *      javax.management.remote.rmi.RMIConnection
     *      javax.management.remote.rmi.RMIServerImpl_Stub.newClient(java.lang.Object) throws java.io.IOException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_newClient_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
