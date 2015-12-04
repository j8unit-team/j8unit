package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.sql.rowset.RowSetFactory interface javax.sql.rowset.RowSetFactory}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sql.rowset.RowSetFactoryClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RowSetFactoryTests<SUT extends javax.sql.rowset.RowSetFactory>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.RowSetFactory#createJdbcRowSet() public abstract
     * javax.sql.rowset.JdbcRowSet javax.sql.rowset.RowSetFactory.createJdbcRowSet() throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createJdbcRowSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.RowSetFactory#createJoinRowSet() public abstract
     * javax.sql.rowset.JoinRowSet javax.sql.rowset.RowSetFactory.createJoinRowSet() throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createJoinRowSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.RowSetFactory#createFilteredRowSet() public abstract
     * javax.sql.rowset.FilteredRowSet javax.sql.rowset.RowSetFactory.createFilteredRowSet() throws
     * java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createFilteredRowSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.RowSetFactory#createWebRowSet() public abstract
     * javax.sql.rowset.WebRowSet javax.sql.rowset.RowSetFactory.createWebRowSet() throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createWebRowSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.RowSetFactory#createCachedRowSet() public abstract
     * javax.sql.rowset.CachedRowSet javax.sql.rowset.RowSetFactory.createCachedRowSet() throws java.sql.SQLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createCachedRowSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
