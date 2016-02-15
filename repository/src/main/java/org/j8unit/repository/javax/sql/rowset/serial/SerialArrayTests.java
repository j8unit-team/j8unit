package org.j8unit.repository.javax.sql.rowset.serial;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sql.rowset.serial.SerialArray class
 * javax.sql.rowset.serial.SerialArray}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link SerialArrayClassTests}.
 * </p>
 *
 * @see javax.sql.rowset.serial.SerialArray class javax.sql.rowset.serial.SerialArray (the hereby targeted
 *      class-under-test class)
 * @see SerialArrayClassTests SerialArrayClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SerialArrayTests<SUT extends javax.sql.rowset.serial.SerialArray>
extends org.j8unit.repository.java.sql.ArrayTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.lang.CloneableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#equals(Object) public boolean
     * javax.sql.rowset.serial.SerialArray.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#equals(Object) public boolean
     * javax.sql.rowset.serial.SerialArray.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialArray#equals(Object) public boolean
     *      javax.sql.rowset.serial.SerialArray.equals(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link javax.sql.rowset.serial.SerialArray#hashCode() public int
     * javax.sql.rowset.serial.SerialArray.hashCode()}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#hashCode() public int
     * javax.sql.rowset.serial.SerialArray.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialArray#hashCode() public int javax.sql.rowset.serial.SerialArray.hashCode()
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
     * Test method for {@link javax.sql.rowset.serial.SerialArray#getResultSet(long, int) public java.sql.ResultSet
     * javax.sql.rowset.serial.SerialArray.getResultSet(long,int) throws javax.sql.rowset.serial.SerialException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#getResultSet(long, int) public java.sql.ResultSet
     * javax.sql.rowset.serial.SerialArray.getResultSet(long,int) throws javax.sql.rowset.serial.SerialException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialArray#getResultSet(long, int) public java.sql.ResultSet
     *      javax.sql.rowset.serial.SerialArray.getResultSet(long,int) throws javax.sql.rowset.serial.SerialException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getResultSet_long_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#getResultSet() public java.sql.ResultSet
     * javax.sql.rowset.serial.SerialArray.getResultSet() throws javax.sql.rowset.serial.SerialException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#getResultSet() public java.sql.ResultSet
     * javax.sql.rowset.serial.SerialArray.getResultSet() throws javax.sql.rowset.serial.SerialException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialArray#getResultSet() public java.sql.ResultSet
     *      javax.sql.rowset.serial.SerialArray.getResultSet() throws javax.sql.rowset.serial.SerialException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getResultSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#getResultSet(java.util.Map) public java.sql.ResultSet
     * javax.sql.rowset.serial.SerialArray.getResultSet(java.util.Map<java.lang.String, java.lang.Class<?>>) throws
     * javax.sql.rowset.serial.SerialException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#getResultSet(java.util.Map) public java.sql.ResultSet
     * javax.sql.rowset.serial.SerialArray.getResultSet(java.util.Map) throws javax.sql.rowset.serial.SerialException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialArray#getResultSet(java.util.Map) public java.sql.ResultSet
     *      javax.sql.rowset.serial.SerialArray.getResultSet(java.util.Map) throws
     *      javax.sql.rowset.serial.SerialException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getResultSet_Map()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#getResultSet(long, int, java.util.Map) public
     * java.sql.ResultSet javax.sql.rowset.serial.SerialArray.getResultSet(long,int,java.util.Map<java.lang.String,
     * java.lang.Class<?>>) throws javax.sql.rowset.serial.SerialException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#getResultSet(long, int, java.util.Map) public
     * java.sql.ResultSet javax.sql.rowset.serial.SerialArray.getResultSet(long,int,java.util.Map) throws
     * javax.sql.rowset.serial.SerialException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialArray#getResultSet(long, int, java.util.Map) public java.sql.ResultSet
     *      javax.sql.rowset.serial.SerialArray.getResultSet(long,int,java.util.Map) throws
     *      javax.sql.rowset.serial.SerialException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getResultSet_long_int_Map()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#free() public void
     * javax.sql.rowset.serial.SerialArray.free() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#free() public void
     * javax.sql.rowset.serial.SerialArray.free() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialArray#free() public void javax.sql.rowset.serial.SerialArray.free() throws
     *      java.sql.SQLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_free()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#getBaseType() public int
     * javax.sql.rowset.serial.SerialArray.getBaseType() throws javax.sql.rowset.serial.SerialException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#getBaseType() public int
     * javax.sql.rowset.serial.SerialArray.getBaseType() throws javax.sql.rowset.serial.SerialException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialArray#getBaseType() public int
     *      javax.sql.rowset.serial.SerialArray.getBaseType() throws javax.sql.rowset.serial.SerialException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getBaseType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#clone() public java.lang.Object
     * javax.sql.rowset.serial.SerialArray.clone()}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#clone() public java.lang.Object
     * javax.sql.rowset.serial.SerialArray.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialArray#clone() public java.lang.Object
     *      javax.sql.rowset.serial.SerialArray.clone() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.sql.rowset.serial.SerialArray#getBaseTypeName() public java.lang.String
     * javax.sql.rowset.serial.SerialArray.getBaseTypeName() throws javax.sql.rowset.serial.SerialException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#getBaseTypeName() public java.lang.String
     * javax.sql.rowset.serial.SerialArray.getBaseTypeName() throws javax.sql.rowset.serial.SerialException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialArray#getBaseTypeName() public java.lang.String
     *      javax.sql.rowset.serial.SerialArray.getBaseTypeName() throws javax.sql.rowset.serial.SerialException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getBaseTypeName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#getArray(long, int, java.util.Map) public
     * java.lang.Object javax.sql.rowset.serial.SerialArray.getArray(long,int,java.util.Map<java.lang.String,
     * java.lang.Class<?>>) throws javax.sql.rowset.serial.SerialException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#getArray(long, int, java.util.Map) public
     * java.lang.Object javax.sql.rowset.serial.SerialArray.getArray(long,int,java.util.Map) throws
     * javax.sql.rowset.serial.SerialException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialArray#getArray(long, int, java.util.Map) public java.lang.Object
     *      javax.sql.rowset.serial.SerialArray.getArray(long,int,java.util.Map) throws
     *      javax.sql.rowset.serial.SerialException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getArray_long_int_Map()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#getArray(long, int) public java.lang.Object
     * javax.sql.rowset.serial.SerialArray.getArray(long,int) throws javax.sql.rowset.serial.SerialException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#getArray(long, int) public java.lang.Object
     * javax.sql.rowset.serial.SerialArray.getArray(long,int) throws javax.sql.rowset.serial.SerialException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialArray#getArray(long, int) public java.lang.Object
     *      javax.sql.rowset.serial.SerialArray.getArray(long,int) throws javax.sql.rowset.serial.SerialException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getArray_long_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#getArray() public java.lang.Object
     * javax.sql.rowset.serial.SerialArray.getArray() throws javax.sql.rowset.serial.SerialException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#getArray() public java.lang.Object
     * javax.sql.rowset.serial.SerialArray.getArray() throws javax.sql.rowset.serial.SerialException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialArray#getArray() public java.lang.Object
     *      javax.sql.rowset.serial.SerialArray.getArray() throws javax.sql.rowset.serial.SerialException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#getArray(java.util.Map) public java.lang.Object
     * javax.sql.rowset.serial.SerialArray.getArray(java.util.Map<java.lang.String, java.lang.Class<?>>) throws
     * javax.sql.rowset.serial.SerialException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialArray#getArray(java.util.Map) public java.lang.Object
     * javax.sql.rowset.serial.SerialArray.getArray(java.util.Map) throws javax.sql.rowset.serial.SerialException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialArray#getArray(java.util.Map) public java.lang.Object
     *      javax.sql.rowset.serial.SerialArray.getArray(java.util.Map) throws javax.sql.rowset.serial.SerialException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getArray_Map()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
