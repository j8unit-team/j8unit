package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sql.rowset.WebRowSet interface javax.sql.rowset.WebRowSet}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link WebRowSetClassTests}.
 * </p>
 *
 * @see javax.sql.rowset.WebRowSet interface javax.sql.rowset.WebRowSet (the hereby targeted class-under-test class)
 * @see WebRowSetClassTests WebRowSetClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WebRowSetTests<SUT extends javax.sql.rowset.WebRowSet>
extends CachedRowSetTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.WebRowSet#writeXml(java.io.Writer) public abstract void
     * javax.sql.rowset.WebRowSet.writeXml(java.io.Writer) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.WebRowSet#writeXml(java.io.Writer) public abstract void
     * javax.sql.rowset.WebRowSet.writeXml(java.io.Writer) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.WebRowSet#writeXml(java.io.Writer) public abstract void
     *      javax.sql.rowset.WebRowSet.writeXml(java.io.Writer) throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeXml_Writer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.WebRowSet#writeXml(java.io.OutputStream) public abstract void
     * javax.sql.rowset.WebRowSet.writeXml(java.io.OutputStream) throws java.sql.SQLException,java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.WebRowSet#writeXml(java.io.OutputStream) public abstract void
     * javax.sql.rowset.WebRowSet.writeXml(java.io.OutputStream) throws java.sql.SQLException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.WebRowSet#writeXml(java.io.OutputStream) public abstract void
     *      javax.sql.rowset.WebRowSet.writeXml(java.io.OutputStream) throws java.sql.SQLException,java.io.IOException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeXml_OutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.WebRowSet#writeXml(java.sql.ResultSet, java.io.OutputStream) public
     * abstract void javax.sql.rowset.WebRowSet.writeXml(java.sql.ResultSet,java.io.OutputStream) throws
     * java.sql.SQLException,java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.WebRowSet#writeXml(java.sql.ResultSet, java.io.OutputStream) public
     * abstract void javax.sql.rowset.WebRowSet.writeXml(java.sql.ResultSet,java.io.OutputStream) throws
     * java.sql.SQLException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.WebRowSet#writeXml(java.sql.ResultSet, java.io.OutputStream) public abstract void
     *      javax.sql.rowset.WebRowSet.writeXml(java.sql.ResultSet,java.io.OutputStream) throws
     *      java.sql.SQLException,java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeXml_ResultSet_OutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.WebRowSet#writeXml(java.sql.ResultSet, java.io.Writer) public abstract
     * void javax.sql.rowset.WebRowSet.writeXml(java.sql.ResultSet,java.io.Writer) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.WebRowSet#writeXml(java.sql.ResultSet, java.io.Writer) public abstract
     * void javax.sql.rowset.WebRowSet.writeXml(java.sql.ResultSet,java.io.Writer) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.WebRowSet#writeXml(java.sql.ResultSet, java.io.Writer) public abstract void
     *      javax.sql.rowset.WebRowSet.writeXml(java.sql.ResultSet,java.io.Writer) throws java.sql.SQLException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeXml_ResultSet_Writer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.WebRowSet#readXml(java.io.Reader) public abstract void
     * javax.sql.rowset.WebRowSet.readXml(java.io.Reader) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.WebRowSet#readXml(java.io.Reader) public abstract void
     * javax.sql.rowset.WebRowSet.readXml(java.io.Reader) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.WebRowSet#readXml(java.io.Reader) public abstract void
     *      javax.sql.rowset.WebRowSet.readXml(java.io.Reader) throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readXml_Reader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.WebRowSet#readXml(java.io.InputStream) public abstract void
     * javax.sql.rowset.WebRowSet.readXml(java.io.InputStream) throws java.sql.SQLException,java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.WebRowSet#readXml(java.io.InputStream) public abstract void
     * javax.sql.rowset.WebRowSet.readXml(java.io.InputStream) throws java.sql.SQLException,java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.WebRowSet#readXml(java.io.InputStream) public abstract void
     *      javax.sql.rowset.WebRowSet.readXml(java.io.InputStream) throws java.sql.SQLException,java.io.IOException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readXml_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
