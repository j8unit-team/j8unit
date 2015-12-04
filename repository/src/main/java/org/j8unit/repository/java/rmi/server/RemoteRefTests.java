package org.j8unit.repository.java.rmi.server;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.rmi.server.RemoteRef interface java.rmi.server.RemoteRef}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.rmi.server.RemoteRefClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RemoteRefTests<SUT extends java.rmi.server.RemoteRef>
extends org.j8unit.repository.java.io.ExternalizableTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.server.RemoteRef#remoteEquals(java.rmi.server.RemoteRef) public abstract boolean
     * java.rmi.server.RemoteRef.remoteEquals(java.rmi.server.RemoteRef)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remoteEquals_RemoteRef()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.RemoteRef#remoteHashCode() public abstract int
     * java.rmi.server.RemoteRef.remoteHashCode()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remoteHashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.RemoteRef#done(java.rmi.server.RemoteCall) public abstract void
     * java.rmi.server.RemoteRef.done(java.rmi.server.RemoteCall) throws java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_done_RemoteCall()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.RemoteRef#getRefClass(java.io.ObjectOutput) public abstract
     * java.lang.String java.rmi.server.RemoteRef.getRefClass(java.io.ObjectOutput)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRefClass_ObjectOutput()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.rmi.server.RemoteRef#newCall(java.rmi.server.RemoteObject,java.rmi.server.Operation[],int,long)
     * public abstract java.rmi.server.RemoteCall
     * java.rmi.server.RemoteRef.newCall(java.rmi.server.RemoteObject,java.rmi.server.Operation[],int,long) throws
     * java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newCall_RemoteObject_OperationArray_int_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.RemoteRef#invoke(java.rmi.server.RemoteCall) public abstract void
     * java.rmi.server.RemoteRef.invoke(java.rmi.server.RemoteCall) throws java.lang.Exception}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invoke_RemoteCall()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.rmi.server.RemoteRef#invoke(java.rmi.Remote,java.lang.reflect.Method,java.lang.Object[],long) public
     * abstract java.lang.Object
     * java.rmi.server.RemoteRef.invoke(java.rmi.Remote,java.lang.reflect.Method,java.lang.Object[],long) throws
     * java.lang.Exception}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invoke_Remote_Method_ObjectArray_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.RemoteRef#remoteToString() public abstract java.lang.String
     * java.rmi.server.RemoteRef.remoteToString()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remoteToString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
