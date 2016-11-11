package org.j8unit.repository.org.omg.stub.javax.management.remote.rmi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.javax.management.remote.rmi.RMIServerTests;
import org.j8unit.repository.javax.rmi.CORBA.StubTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.omg.stub.javax.management.remote.rmi._RMIServer_Stub;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link _RMIServer_Stub
 * public class org.omg.stub.javax.management.remote.rmi._RMIServer_Stub}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.org.omg.stub.javax.management.remote.rmi._RMIServer_StubClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface _RMIServer_StubTests<SUT extends _RMIServer_Stub>
extends RMIServerTests<SUT>, StubTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.stub.javax.management.remote.rmi._RMIServer_Stub]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.stub.javax.management.remote.rmi._RMIServer_Stub#_ids() public java.lang.String[]
     * org.omg.stub.javax.management.remote.rmi._RMIServer_Stub._ids()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test__ids()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.stub.javax.management.remote.rmi._RMIServer_Stub#newClient(Object) public
     * javax.management.remote.rmi.RMIConnection
     * org.omg.stub.javax.management.remote.rmi._RMIServer_Stub.newClient(java.lang.Object) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.stub.javax.management.remote.rmi._RMIServer_Stub#getVersion() public java.lang.String
     * org.omg.stub.javax.management.remote.rmi._RMIServer_Stub.getVersion() throws java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.stub.javax.management.remote.rmi._RMIServer_Stub]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.stub.javax.management.remote.rmi._RMIServer_Stub]

}
