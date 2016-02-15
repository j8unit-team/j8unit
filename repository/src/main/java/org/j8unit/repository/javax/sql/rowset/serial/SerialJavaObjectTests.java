package org.j8unit.repository.javax.sql.rowset.serial;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sql.rowset.serial.SerialJavaObject class
 * javax.sql.rowset.serial.SerialJavaObject}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link SerialJavaObjectClassTests}.
 * </p>
 *
 * @see javax.sql.rowset.serial.SerialJavaObject class javax.sql.rowset.serial.SerialJavaObject (the hereby targeted
 *      class-under-test class)
 * @see SerialJavaObjectClassTests SerialJavaObjectClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SerialJavaObjectTests<SUT extends javax.sql.rowset.serial.SerialJavaObject>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.CloneableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialJavaObject#clone() public java.lang.Object
     * javax.sql.rowset.serial.SerialJavaObject.clone()}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialJavaObject#clone() public java.lang.Object
     * javax.sql.rowset.serial.SerialJavaObject.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialJavaObject#clone() public java.lang.Object
     *      javax.sql.rowset.serial.SerialJavaObject.clone() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_clone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialJavaObject#equals(Object) public boolean
     * javax.sql.rowset.serial.SerialJavaObject.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialJavaObject#equals(Object) public boolean
     * javax.sql.rowset.serial.SerialJavaObject.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialJavaObject#equals(Object) public boolean
     *      javax.sql.rowset.serial.SerialJavaObject.equals(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link javax.sql.rowset.serial.SerialJavaObject#hashCode() public int
     * javax.sql.rowset.serial.SerialJavaObject.hashCode()}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialJavaObject#hashCode() public int
     * javax.sql.rowset.serial.SerialJavaObject.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialJavaObject#hashCode() public int
     *      javax.sql.rowset.serial.SerialJavaObject.hashCode() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.sql.rowset.serial.SerialJavaObject#getFields() public java.lang.reflect.Field[]
     * javax.sql.rowset.serial.SerialJavaObject.getFields() throws javax.sql.rowset.serial.SerialException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialJavaObject#getFields() public java.lang.reflect.Field[]
     * javax.sql.rowset.serial.SerialJavaObject.getFields() throws javax.sql.rowset.serial.SerialException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialJavaObject#getFields() public java.lang.reflect.Field[]
     *      javax.sql.rowset.serial.SerialJavaObject.getFields() throws javax.sql.rowset.serial.SerialException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFields()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialJavaObject#getObject() public java.lang.Object
     * javax.sql.rowset.serial.SerialJavaObject.getObject() throws javax.sql.rowset.serial.SerialException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialJavaObject#getObject() public java.lang.Object
     * javax.sql.rowset.serial.SerialJavaObject.getObject() throws javax.sql.rowset.serial.SerialException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialJavaObject#getObject() public java.lang.Object
     *      javax.sql.rowset.serial.SerialJavaObject.getObject() throws javax.sql.rowset.serial.SerialException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getObject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
