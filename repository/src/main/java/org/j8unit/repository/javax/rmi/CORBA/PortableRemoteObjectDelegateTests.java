package org.j8unit.repository.javax.rmi.CORBA;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.rmi.CORBA.PortableRemoteObjectDelegate interface
 * javax.rmi.CORBA.PortableRemoteObjectDelegate}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.rmi.CORBA.PortableRemoteObjectDelegateClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PortableRemoteObjectDelegateTests<SUT extends javax.rmi.CORBA.PortableRemoteObjectDelegate>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.PortableRemoteObjectDelegate#connect(java.rmi.Remote,java.rmi.Remote)
     * public abstract void javax.rmi.CORBA.PortableRemoteObjectDelegate.connect(java.rmi.Remote,java.rmi.Remote) throws
     * java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_connect_Remote_Remote()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.PortableRemoteObjectDelegate#exportObject(java.rmi.Remote) public abstract
     * void javax.rmi.CORBA.PortableRemoteObjectDelegate.exportObject(java.rmi.Remote) throws java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_exportObject_Remote()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.PortableRemoteObjectDelegate#narrow(java.lang.Object,java.lang.Class)
     * public abstract java.lang.Object
     * javax.rmi.CORBA.PortableRemoteObjectDelegate.narrow(java.lang.Object,java.lang.Class) throws
     * java.lang.ClassCastException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_narrow_Object_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.PortableRemoteObjectDelegate#toStub(java.rmi.Remote) public abstract
     * java.rmi.Remote javax.rmi.CORBA.PortableRemoteObjectDelegate.toStub(java.rmi.Remote) throws
     * java.rmi.NoSuchObjectException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toStub_Remote()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.PortableRemoteObjectDelegate#unexportObject(java.rmi.Remote) public
     * abstract void javax.rmi.CORBA.PortableRemoteObjectDelegate.unexportObject(java.rmi.Remote) throws
     * java.rmi.NoSuchObjectException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unexportObject_Remote()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
