package org.j8unit.repository.javax.rmi.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.rmi.CORBA.Stub class javax.rmi.CORBA.Stub}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link StubClassTests}.
 * </p>
 *
 * @see javax.rmi.CORBA.Stub class javax.rmi.CORBA.Stub (the hereby targeted class-under-test class)
 * @see StubClassTests StubClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StubTests<SUT extends javax.rmi.CORBA.Stub>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.org.omg.CORBA_2_3.portable.ObjectImplTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.Stub#hashCode() public int javax.rmi.CORBA.Stub.hashCode()}.
     *
     * <p>
     * Test method for {@link javax.rmi.CORBA.Stub#hashCode() public int javax.rmi.CORBA.Stub.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.rmi.CORBA.Stub#hashCode() public int javax.rmi.CORBA.Stub.hashCode() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.Stub#equals(Object) public boolean
     * javax.rmi.CORBA.Stub.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.rmi.CORBA.Stub#equals(Object) public boolean
     * javax.rmi.CORBA.Stub.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.rmi.CORBA.Stub#equals(Object) public boolean javax.rmi.CORBA.Stub.equals(java.lang.Object) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.Stub#connect(org.omg.CORBA.ORB) public void
     * javax.rmi.CORBA.Stub.connect(org.omg.CORBA.ORB) throws java.rmi.RemoteException}.
     *
     * <p>
     * Test method for {@link javax.rmi.CORBA.Stub#connect(org.omg.CORBA.ORB) public void
     * javax.rmi.CORBA.Stub.connect(org.omg.CORBA.ORB) throws java.rmi.RemoteException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.rmi.CORBA.Stub#connect(org.omg.CORBA.ORB) public void javax.rmi.CORBA.Stub.connect(org.omg.CORBA.ORB)
     *      throws java.rmi.RemoteException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_connect_ORB()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.Stub#toString() public java.lang.String javax.rmi.CORBA.Stub.toString()}.
     *
     * <p>
     * Test method for {@link javax.rmi.CORBA.Stub#toString() public java.lang.String javax.rmi.CORBA.Stub.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.rmi.CORBA.Stub#toString() public java.lang.String javax.rmi.CORBA.Stub.toString() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
