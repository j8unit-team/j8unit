package org.j8unit.repository.java.rmi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.MarshalledObject class java.rmi.MarshalledObject}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link MarshalledObjectClassTests}.
 * </p>
 *
 * @see java.rmi.MarshalledObject class java.rmi.MarshalledObject (the hereby targeted class-under-test class)
 * @see MarshalledObjectClassTests MarshalledObjectClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MarshalledObjectTests<SUT extends java.rmi.MarshalledObject<T>, T>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.MarshalledObject#get() public T java.rmi.MarshalledObject.get() throws
     * java.io.IOException,java.lang.ClassNotFoundException}.
     *
     * <p>
     * Test method for {@link java.rmi.MarshalledObject#get() public java.lang.Object java.rmi.MarshalledObject.get()
     * throws java.io.IOException,java.lang.ClassNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.MarshalledObject#get() public java.lang.Object java.rmi.MarshalledObject.get() throws
     *      java.io.IOException,java.lang.ClassNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_get()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.MarshalledObject#equals(Object) public boolean
     * java.rmi.MarshalledObject.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link java.rmi.MarshalledObject#equals(Object) public boolean
     * java.rmi.MarshalledObject.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.MarshalledObject#equals(Object) public boolean java.rmi.MarshalledObject.equals(java.lang.Object)
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link java.rmi.MarshalledObject#hashCode() public int java.rmi.MarshalledObject.hashCode()}.
     *
     * <p>
     * Test method for {@link java.rmi.MarshalledObject#hashCode() public int java.rmi.MarshalledObject.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.MarshalledObject#hashCode() public int java.rmi.MarshalledObject.hashCode() (the hereby targeted
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

}
