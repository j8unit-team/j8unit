package org.j8unit.repository.javax.sql.rowset.serial;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sql.rowset.serial.SerialClob class
 * javax.sql.rowset.serial.SerialClob}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link SerialClobClassTests}.
 * </p>
 *
 * @see javax.sql.rowset.serial.SerialClob class javax.sql.rowset.serial.SerialClob (the hereby targeted
 *      class-under-test class)
 * @see SerialClobClassTests SerialClobClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SerialClobTests<SUT extends javax.sql.rowset.serial.SerialClob>
extends org.j8unit.repository.java.sql.ClobTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.lang.CloneableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#getCharacterStream(long, long) public java.io.Reader
     * javax.sql.rowset.serial.SerialClob.getCharacterStream(long,long) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#getCharacterStream(long, long) public java.io.Reader
     * javax.sql.rowset.serial.SerialClob.getCharacterStream(long,long) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialClob#getCharacterStream(long, long) public java.io.Reader
     *      javax.sql.rowset.serial.SerialClob.getCharacterStream(long,long) throws java.sql.SQLException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getCharacterStream_long_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#getCharacterStream() public java.io.Reader
     * javax.sql.rowset.serial.SerialClob.getCharacterStream() throws javax.sql.rowset.serial.SerialException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#getCharacterStream() public java.io.Reader
     * javax.sql.rowset.serial.SerialClob.getCharacterStream() throws javax.sql.rowset.serial.SerialException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialClob#getCharacterStream() public java.io.Reader
     *      javax.sql.rowset.serial.SerialClob.getCharacterStream() throws javax.sql.rowset.serial.SerialException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getCharacterStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#getAsciiStream() public java.io.InputStream
     * javax.sql.rowset.serial.SerialClob.getAsciiStream() throws
     * javax.sql.rowset.serial.SerialException,java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#getAsciiStream() public java.io.InputStream
     * javax.sql.rowset.serial.SerialClob.getAsciiStream() throws
     * javax.sql.rowset.serial.SerialException,java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialClob#getAsciiStream() public java.io.InputStream
     *      javax.sql.rowset.serial.SerialClob.getAsciiStream() throws
     *      javax.sql.rowset.serial.SerialException,java.sql.SQLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAsciiStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#length() public long
     * javax.sql.rowset.serial.SerialClob.length() throws javax.sql.rowset.serial.SerialException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#length() public long
     * javax.sql.rowset.serial.SerialClob.length() throws javax.sql.rowset.serial.SerialException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialClob#length() public long javax.sql.rowset.serial.SerialClob.length() throws
     *      javax.sql.rowset.serial.SerialException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_length()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#getSubString(long, int) public java.lang.String
     * javax.sql.rowset.serial.SerialClob.getSubString(long,int) throws javax.sql.rowset.serial.SerialException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#getSubString(long, int) public java.lang.String
     * javax.sql.rowset.serial.SerialClob.getSubString(long,int) throws javax.sql.rowset.serial.SerialException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialClob#getSubString(long, int) public java.lang.String
     *      javax.sql.rowset.serial.SerialClob.getSubString(long,int) throws javax.sql.rowset.serial.SerialException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getSubString_long_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#truncate(long) public void
     * javax.sql.rowset.serial.SerialClob.truncate(long) throws javax.sql.rowset.serial.SerialException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#truncate(long) public void
     * javax.sql.rowset.serial.SerialClob.truncate(long) throws javax.sql.rowset.serial.SerialException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialClob#truncate(long) public void
     *      javax.sql.rowset.serial.SerialClob.truncate(long) throws javax.sql.rowset.serial.SerialException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_truncate_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#hashCode() public int
     * javax.sql.rowset.serial.SerialClob.hashCode()}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#hashCode() public int
     * javax.sql.rowset.serial.SerialClob.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialClob#hashCode() public int javax.sql.rowset.serial.SerialClob.hashCode() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link javax.sql.rowset.serial.SerialClob#equals(Object) public boolean
     * javax.sql.rowset.serial.SerialClob.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#equals(Object) public boolean
     * javax.sql.rowset.serial.SerialClob.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialClob#equals(Object) public boolean
     *      javax.sql.rowset.serial.SerialClob.equals(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link javax.sql.rowset.serial.SerialClob#setCharacterStream(long) public java.io.Writer
     * javax.sql.rowset.serial.SerialClob.setCharacterStream(long) throws
     * javax.sql.rowset.serial.SerialException,java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#setCharacterStream(long) public java.io.Writer
     * javax.sql.rowset.serial.SerialClob.setCharacterStream(long) throws
     * javax.sql.rowset.serial.SerialException,java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialClob#setCharacterStream(long) public java.io.Writer
     *      javax.sql.rowset.serial.SerialClob.setCharacterStream(long) throws
     *      javax.sql.rowset.serial.SerialException,java.sql.SQLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setCharacterStream_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#setString(long, String) public int
     * javax.sql.rowset.serial.SerialClob.setString(long,java.lang.String) throws
     * javax.sql.rowset.serial.SerialException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#setString(long, String) public int
     * javax.sql.rowset.serial.SerialClob.setString(long,java.lang.String) throws
     * javax.sql.rowset.serial.SerialException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialClob#setString(long, String) public int
     *      javax.sql.rowset.serial.SerialClob.setString(long,java.lang.String) throws
     *      javax.sql.rowset.serial.SerialException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setString_long_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#setString(long, String, int, int) public int
     * javax.sql.rowset.serial.SerialClob.setString(long,java.lang.String,int,int) throws
     * javax.sql.rowset.serial.SerialException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#setString(long, String, int, int) public int
     * javax.sql.rowset.serial.SerialClob.setString(long,java.lang.String,int,int) throws
     * javax.sql.rowset.serial.SerialException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialClob#setString(long, String, int, int) public int
     *      javax.sql.rowset.serial.SerialClob.setString(long,java.lang.String,int,int) throws
     *      javax.sql.rowset.serial.SerialException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setString_long_String_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#setAsciiStream(long) public java.io.OutputStream
     * javax.sql.rowset.serial.SerialClob.setAsciiStream(long) throws
     * javax.sql.rowset.serial.SerialException,java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#setAsciiStream(long) public java.io.OutputStream
     * javax.sql.rowset.serial.SerialClob.setAsciiStream(long) throws
     * javax.sql.rowset.serial.SerialException,java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialClob#setAsciiStream(long) public java.io.OutputStream
     *      javax.sql.rowset.serial.SerialClob.setAsciiStream(long) throws
     *      javax.sql.rowset.serial.SerialException,java.sql.SQLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setAsciiStream_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#free() public void
     * javax.sql.rowset.serial.SerialClob.free() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#free() public void
     * javax.sql.rowset.serial.SerialClob.free() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialClob#free() public void javax.sql.rowset.serial.SerialClob.free() throws
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
     * Test method for {@link javax.sql.rowset.serial.SerialClob#clone() public java.lang.Object
     * javax.sql.rowset.serial.SerialClob.clone()}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#clone() public java.lang.Object
     * javax.sql.rowset.serial.SerialClob.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialClob#clone() public java.lang.Object
     *      javax.sql.rowset.serial.SerialClob.clone() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.sql.rowset.serial.SerialClob#position(java.sql.Clob, long) public long
     * javax.sql.rowset.serial.SerialClob.position(java.sql.Clob,long) throws
     * javax.sql.rowset.serial.SerialException,java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#position(java.sql.Clob, long) public long
     * javax.sql.rowset.serial.SerialClob.position(java.sql.Clob,long) throws
     * javax.sql.rowset.serial.SerialException,java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialClob#position(java.sql.Clob, long) public long
     *      javax.sql.rowset.serial.SerialClob.position(java.sql.Clob,long) throws
     *      javax.sql.rowset.serial.SerialException,java.sql.SQLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_position_Clob_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#position(String, long) public long
     * javax.sql.rowset.serial.SerialClob.position(java.lang.String,long) throws
     * javax.sql.rowset.serial.SerialException,java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialClob#position(String, long) public long
     * javax.sql.rowset.serial.SerialClob.position(java.lang.String,long) throws
     * javax.sql.rowset.serial.SerialException,java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialClob#position(String, long) public long
     *      javax.sql.rowset.serial.SerialClob.position(java.lang.String,long) throws
     *      javax.sql.rowset.serial.SerialException,java.sql.SQLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_position_String_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
