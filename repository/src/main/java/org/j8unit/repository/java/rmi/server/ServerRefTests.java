package org.j8unit.repository.java.rmi.server;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.rmi.server.ServerRef interface java.rmi.server.ServerRef},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.rmi.server.ServerRefTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.rmi.server.ServerRefClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.rmi.server.ServerRef
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ServerRefTests<SUT extends java.rmi.server.ServerRef>
extends org.j8unit.repository.java.rmi.server.RemoteRefTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.server.ServerRef#exportObject(java.rmi.Remote, java.lang.Object) public abstract
     * java.rmi.server.RemoteStub java.rmi.server.ServerRef.exportObject(java.rmi.Remote,java.lang.Object) throws
     * java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.rmi.server.ServerRef#exportObject(java.rmi.Remote, java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_exportObject_Remote_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.ServerRef#getClientHost() public abstract java.lang.String
     * java.rmi.server.ServerRef.getClientHost() throws java.rmi.server.ServerNotActiveException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.rmi.server.ServerRef#getClientHost()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getClientHost()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
