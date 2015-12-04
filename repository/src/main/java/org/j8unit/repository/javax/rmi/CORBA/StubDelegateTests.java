package org.j8unit.repository.javax.rmi.CORBA;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.rmi.CORBA.StubDelegate interface javax.rmi.CORBA.StubDelegate}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.rmi.CORBA.StubDelegateClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface StubDelegateTests<SUT extends javax.rmi.CORBA.StubDelegate>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.StubDelegate#readObject(javax.rmi.CORBA.Stub,java.io.ObjectInputStream)
     * public abstract void javax.rmi.CORBA.StubDelegate.readObject(javax.rmi.CORBA.Stub,java.io.ObjectInputStream)
     * throws java.io.IOException,java.lang.ClassNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readObject_Stub_ObjectInputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.StubDelegate#connect(javax.rmi.CORBA.Stub,org.omg.CORBA.ORB) public
     * abstract void javax.rmi.CORBA.StubDelegate.connect(javax.rmi.CORBA.Stub,org.omg.CORBA.ORB) throws
     * java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_connect_Stub_ORB()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.StubDelegate#toString(javax.rmi.CORBA.Stub) public abstract
     * java.lang.String javax.rmi.CORBA.StubDelegate.toString(javax.rmi.CORBA.Stub)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toString_Stub()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.StubDelegate#equals(javax.rmi.CORBA.Stub,java.lang.Object) public abstract
     * boolean javax.rmi.CORBA.StubDelegate.equals(javax.rmi.CORBA.Stub,java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_equals_Stub_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.StubDelegate#hashCode(javax.rmi.CORBA.Stub) public abstract int
     * javax.rmi.CORBA.StubDelegate.hashCode(javax.rmi.CORBA.Stub)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hashCode_Stub()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.StubDelegate#writeObject(javax.rmi.CORBA.Stub,java.io.ObjectOutputStream)
     * public abstract void javax.rmi.CORBA.StubDelegate.writeObject(javax.rmi.CORBA.Stub,java.io.ObjectOutputStream)
     * throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeObject_Stub_ObjectOutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
