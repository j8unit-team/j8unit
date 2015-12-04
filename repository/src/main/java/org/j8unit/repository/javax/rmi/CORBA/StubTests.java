package org.j8unit.repository.javax.rmi.CORBA;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.rmi.CORBA.Stub class javax.rmi.CORBA.Stub},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.rmi.CORBA.StubClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface StubTests<SUT extends javax.rmi.CORBA.Stub>
extends org.j8unit.repository.java.io.SerializableTests<SUT>,
        org.j8unit.repository.org.omg.CORBA_2_3.portable.ObjectImplTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.Stub#hashCode() public int javax.rmi.CORBA.Stub.hashCode()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_hashCode() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.Stub#equals(java.lang.Object) public boolean javax.rmi.CORBA.Stub.equals(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_equals_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.Stub#connect(org.omg.CORBA.ORB) public void javax.rmi.CORBA.Stub.connect(org.omg.CORBA.ORB) throws java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_connect_ORB() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.rmi.CORBA.Stub#toString() public java.lang.String javax.rmi.CORBA.Stub.toString()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_toString() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
