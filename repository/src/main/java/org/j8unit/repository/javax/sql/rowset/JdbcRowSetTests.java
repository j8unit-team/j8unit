package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sql.rowset.JdbcRowSet interface javax.sql.rowset.JdbcRowSet}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link JdbcRowSetClassTests}.
 * </p>
 *
 * @see javax.sql.rowset.JdbcRowSet interface javax.sql.rowset.JdbcRowSet (the hereby targeted class-under-test class)
 * @see JdbcRowSetClassTests JdbcRowSetClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JdbcRowSetTests<SUT extends javax.sql.rowset.JdbcRowSet>
extends org.j8unit.repository.javax.sql.RowSetTests<SUT>, JoinableTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.JdbcRowSet#commit() public abstract void
     * javax.sql.rowset.JdbcRowSet.commit() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.JdbcRowSet#commit() public abstract void
     * javax.sql.rowset.JdbcRowSet.commit() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.JdbcRowSet#commit() public abstract void javax.sql.rowset.JdbcRowSet.commit() throws
     *      java.sql.SQLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_commit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.JdbcRowSet#getRowSetWarnings() public abstract
     * javax.sql.rowset.RowSetWarning javax.sql.rowset.JdbcRowSet.getRowSetWarnings() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.JdbcRowSet#getRowSetWarnings() public abstract
     * javax.sql.rowset.RowSetWarning javax.sql.rowset.JdbcRowSet.getRowSetWarnings() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.JdbcRowSet#getRowSetWarnings() public abstract javax.sql.rowset.RowSetWarning
     *      javax.sql.rowset.JdbcRowSet.getRowSetWarnings() throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRowSetWarnings()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.JdbcRowSet#rollback() public abstract void
     * javax.sql.rowset.JdbcRowSet.rollback() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.JdbcRowSet#rollback() public abstract void
     * javax.sql.rowset.JdbcRowSet.rollback() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.JdbcRowSet#rollback() public abstract void javax.sql.rowset.JdbcRowSet.rollback() throws
     *      java.sql.SQLException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_rollback()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.JdbcRowSet#rollback(java.sql.Savepoint) public abstract void
     * javax.sql.rowset.JdbcRowSet.rollback(java.sql.Savepoint) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.JdbcRowSet#rollback(java.sql.Savepoint) public abstract void
     * javax.sql.rowset.JdbcRowSet.rollback(java.sql.Savepoint) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.JdbcRowSet#rollback(java.sql.Savepoint) public abstract void
     *      javax.sql.rowset.JdbcRowSet.rollback(java.sql.Savepoint) throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_rollback_Savepoint()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.JdbcRowSet#setShowDeleted(boolean) public abstract void
     * javax.sql.rowset.JdbcRowSet.setShowDeleted(boolean) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.JdbcRowSet#setShowDeleted(boolean) public abstract void
     * javax.sql.rowset.JdbcRowSet.setShowDeleted(boolean) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.JdbcRowSet#setShowDeleted(boolean) public abstract void
     *      javax.sql.rowset.JdbcRowSet.setShowDeleted(boolean) throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setShowDeleted_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.JdbcRowSet#getShowDeleted() public abstract boolean
     * javax.sql.rowset.JdbcRowSet.getShowDeleted() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.JdbcRowSet#getShowDeleted() public abstract boolean
     * javax.sql.rowset.JdbcRowSet.getShowDeleted() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.JdbcRowSet#getShowDeleted() public abstract boolean
     *      javax.sql.rowset.JdbcRowSet.getShowDeleted() throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getShowDeleted()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.JdbcRowSet#getAutoCommit() public abstract boolean
     * javax.sql.rowset.JdbcRowSet.getAutoCommit() throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.JdbcRowSet#getAutoCommit() public abstract boolean
     * javax.sql.rowset.JdbcRowSet.getAutoCommit() throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.JdbcRowSet#getAutoCommit() public abstract boolean
     *      javax.sql.rowset.JdbcRowSet.getAutoCommit() throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAutoCommit()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.JdbcRowSet#setAutoCommit(boolean) public abstract void
     * javax.sql.rowset.JdbcRowSet.setAutoCommit(boolean) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.JdbcRowSet#setAutoCommit(boolean) public abstract void
     * javax.sql.rowset.JdbcRowSet.setAutoCommit(boolean) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.JdbcRowSet#setAutoCommit(boolean) public abstract void
     *      javax.sql.rowset.JdbcRowSet.setAutoCommit(boolean) throws java.sql.SQLException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setAutoCommit_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
