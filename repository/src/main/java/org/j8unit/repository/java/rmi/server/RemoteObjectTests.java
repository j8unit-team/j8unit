package org.j8unit.repository.java.rmi.server;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.server.RemoteObject class java.rmi.server.RemoteObject}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link RemoteObjectClassTests}.
 * </p>
 *
 * @see java.rmi.server.RemoteObject class java.rmi.server.RemoteObject (the hereby targeted class-under-test class)
 * @see RemoteObjectClassTests RemoteObjectClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RemoteObjectTests<SUT extends java.rmi.server.RemoteObject>
extends org.j8unit.repository.java.rmi.RemoteTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.server.RemoteObject#toString() public java.lang.String
     * java.rmi.server.RemoteObject.toString()}.
     *
     * <p>
     * Test method for {@link java.rmi.server.RemoteObject#toString() public java.lang.String
     * java.rmi.server.RemoteObject.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.RemoteObject#toString() public java.lang.String java.rmi.server.RemoteObject.toString() (the
     *      hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link java.rmi.server.RemoteObject#getRef() public java.rmi.server.RemoteRef
     * java.rmi.server.RemoteObject.getRef()}.
     *
     * <p>
     * Test method for {@link java.rmi.server.RemoteObject#getRef() public java.rmi.server.RemoteRef
     * java.rmi.server.RemoteObject.getRef()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.RemoteObject#getRef() public java.rmi.server.RemoteRef java.rmi.server.RemoteObject.getRef()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRef()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.RemoteObject#hashCode() public int
     * java.rmi.server.RemoteObject.hashCode()}.
     *
     * <p>
     * Test method for {@link java.rmi.server.RemoteObject#hashCode() public int
     * java.rmi.server.RemoteObject.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.RemoteObject#hashCode() public int java.rmi.server.RemoteObject.hashCode() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.rmi.server.RemoteObject#equals(Object) public boolean
     * java.rmi.server.RemoteObject.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.rmi.server.RemoteObject#equals(Object) public boolean
     * java.rmi.server.RemoteObject.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.RemoteObject#equals(Object) public boolean
     *      java.rmi.server.RemoteObject.equals(java.lang.Object) (the hereby targeted method-under-test)
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

}
