package org.j8unit.repository.javax.sql.rowset.serial;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sql.rowset.serial.SerialStruct class
 * javax.sql.rowset.serial.SerialStruct}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link SerialStructClassTests}.
 * </p>
 *
 * @see javax.sql.rowset.serial.SerialStruct class javax.sql.rowset.serial.SerialStruct (the hereby targeted
 *      class-under-test class)
 * @see SerialStructClassTests SerialStructClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SerialStructTests<SUT extends javax.sql.rowset.serial.SerialStruct>
extends org.j8unit.repository.java.sql.StructTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.lang.CloneableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialStruct#clone() public java.lang.Object
     * javax.sql.rowset.serial.SerialStruct.clone()}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialStruct#clone() public java.lang.Object
     * javax.sql.rowset.serial.SerialStruct.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialStruct#clone() public java.lang.Object
     *      javax.sql.rowset.serial.SerialStruct.clone() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.sql.rowset.serial.SerialStruct#getAttributes() public java.lang.Object[]
     * javax.sql.rowset.serial.SerialStruct.getAttributes() throws javax.sql.rowset.serial.SerialException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialStruct#getAttributes() public java.lang.Object[]
     * javax.sql.rowset.serial.SerialStruct.getAttributes() throws javax.sql.rowset.serial.SerialException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialStruct#getAttributes() public java.lang.Object[]
     *      javax.sql.rowset.serial.SerialStruct.getAttributes() throws javax.sql.rowset.serial.SerialException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAttributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialStruct#getAttributes(java.util.Map) public
     * java.lang.Object[] javax.sql.rowset.serial.SerialStruct.getAttributes(java.util.Map<java.lang.String,
     * java.lang.Class<?>>) throws javax.sql.rowset.serial.SerialException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialStruct#getAttributes(java.util.Map) public
     * java.lang.Object[] javax.sql.rowset.serial.SerialStruct.getAttributes(java.util.Map) throws
     * javax.sql.rowset.serial.SerialException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialStruct#getAttributes(java.util.Map) public java.lang.Object[]
     *      javax.sql.rowset.serial.SerialStruct.getAttributes(java.util.Map) throws
     *      javax.sql.rowset.serial.SerialException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAttributes_Map()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialStruct#equals(Object) public boolean
     * javax.sql.rowset.serial.SerialStruct.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialStruct#equals(Object) public boolean
     * javax.sql.rowset.serial.SerialStruct.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialStruct#equals(Object) public boolean
     *      javax.sql.rowset.serial.SerialStruct.equals(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link javax.sql.rowset.serial.SerialStruct#hashCode() public int
     * javax.sql.rowset.serial.SerialStruct.hashCode()}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialStruct#hashCode() public int
     * javax.sql.rowset.serial.SerialStruct.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialStruct#hashCode() public int javax.sql.rowset.serial.SerialStruct.hashCode()
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link javax.sql.rowset.serial.SerialStruct#getSQLTypeName() public java.lang.String
     * javax.sql.rowset.serial.SerialStruct.getSQLTypeName() throws javax.sql.rowset.serial.SerialException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialStruct#getSQLTypeName() public java.lang.String
     * javax.sql.rowset.serial.SerialStruct.getSQLTypeName() throws javax.sql.rowset.serial.SerialException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialStruct#getSQLTypeName() public java.lang.String
     *      javax.sql.rowset.serial.SerialStruct.getSQLTypeName() throws javax.sql.rowset.serial.SerialException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getSQLTypeName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
