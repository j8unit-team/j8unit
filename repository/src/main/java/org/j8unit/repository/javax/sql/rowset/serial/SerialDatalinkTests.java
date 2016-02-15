package org.j8unit.repository.javax.sql.rowset.serial;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sql.rowset.serial.SerialDatalink class
 * javax.sql.rowset.serial.SerialDatalink}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link SerialDatalinkClassTests}.
 * </p>
 *
 * @see javax.sql.rowset.serial.SerialDatalink class javax.sql.rowset.serial.SerialDatalink (the hereby targeted
 *      class-under-test class)
 * @see SerialDatalinkClassTests SerialDatalinkClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SerialDatalinkTests<SUT extends javax.sql.rowset.serial.SerialDatalink>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.CloneableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialDatalink#equals(Object) public boolean
     * javax.sql.rowset.serial.SerialDatalink.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialDatalink#equals(Object) public boolean
     * javax.sql.rowset.serial.SerialDatalink.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialDatalink#equals(Object) public boolean
     *      javax.sql.rowset.serial.SerialDatalink.equals(java.lang.Object) (the hereby targeted method-under-test)
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
     * Test method for {@link javax.sql.rowset.serial.SerialDatalink#hashCode() public int
     * javax.sql.rowset.serial.SerialDatalink.hashCode()}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialDatalink#hashCode() public int
     * javax.sql.rowset.serial.SerialDatalink.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialDatalink#hashCode() public int
     *      javax.sql.rowset.serial.SerialDatalink.hashCode() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.sql.rowset.serial.SerialDatalink#getDatalink() public java.net.URL
     * javax.sql.rowset.serial.SerialDatalink.getDatalink() throws javax.sql.rowset.serial.SerialException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialDatalink#getDatalink() public java.net.URL
     * javax.sql.rowset.serial.SerialDatalink.getDatalink() throws javax.sql.rowset.serial.SerialException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialDatalink#getDatalink() public java.net.URL
     *      javax.sql.rowset.serial.SerialDatalink.getDatalink() throws javax.sql.rowset.serial.SerialException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDatalink()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialDatalink#clone() public java.lang.Object
     * javax.sql.rowset.serial.SerialDatalink.clone()}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.serial.SerialDatalink#clone() public java.lang.Object
     * javax.sql.rowset.serial.SerialDatalink.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.serial.SerialDatalink#clone() public java.lang.Object
     *      javax.sql.rowset.serial.SerialDatalink.clone() (the hereby targeted method-under-test)
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

}
