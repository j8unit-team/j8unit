package org.j8unit.repository.org.omg.stub.javax.management.remote.rmi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.stub.javax.management.remote.rmi._RMIServer_Stub class
 * org.omg.stub.javax.management.remote.rmi._RMIServer_Stub}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.stub.javax.management.remote.rmi._RMIServer_StubClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface _RMIServer_StubTests<SUT extends org.omg.stub.javax.management.remote.rmi._RMIServer_Stub>
extends org.j8unit.repository.javax.management.remote.rmi.RMIServerTests<SUT>, org.j8unit.repository.javax.rmi.CORBA.StubTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.stub.javax.management.remote.rmi._RMIServer_Stub#_ids() public java.lang.String[]
     * org.omg.stub.javax.management.remote.rmi._RMIServer_Stub._ids()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test__ids()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.stub.javax.management.remote.rmi._RMIServer_Stub#getVersion() public
     * java.lang.String org.omg.stub.javax.management.remote.rmi._RMIServer_Stub.getVersion() throws
     * java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getVersion()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.stub.javax.management.remote.rmi._RMIServer_Stub#newClient(java.lang.Object)
     * public javax.management.remote.rmi.RMIConnection
     * org.omg.stub.javax.management.remote.rmi._RMIServer_Stub.newClient(java.lang.Object) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_newClient_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
