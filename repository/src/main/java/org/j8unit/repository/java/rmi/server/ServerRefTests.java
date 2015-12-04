package org.j8unit.repository.java.rmi.server;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.rmi.server.ServerRef interface java.rmi.server.ServerRef},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.rmi.server.ServerRefClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ServerRefTests<SUT extends java.rmi.server.ServerRef>
extends org.j8unit.repository.java.rmi.server.RemoteRefTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.rmi.server.ServerRef#exportObject(java.rmi.Remote,java.lang.Object) public abstract java.rmi.server.RemoteStub java.rmi.server.ServerRef.exportObject(java.rmi.Remote,java.lang.Object) throws java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_exportObject_Remote_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.ServerRef#getClientHost() public abstract java.lang.String java.rmi.server.ServerRef.getClientHost() throws java.rmi.server.ServerNotActiveException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getClientHost() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
