package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sql.rowset.FilteredRowSet interface javax.sql.rowset.FilteredRowSet}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link FilteredRowSetClassTests}.
 * </p>
 *
 * @see javax.sql.rowset.FilteredRowSet interface javax.sql.rowset.FilteredRowSet (the hereby targeted class-under-test
 *      class)
 * @see FilteredRowSetClassTests FilteredRowSetClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FilteredRowSetTests<SUT extends javax.sql.rowset.FilteredRowSet>
extends WebRowSetTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.FilteredRowSet#getFilter() public abstract javax.sql.rowset.Predicate
     * javax.sql.rowset.FilteredRowSet.getFilter()}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.FilteredRowSet#getFilter() public abstract javax.sql.rowset.Predicate
     * javax.sql.rowset.FilteredRowSet.getFilter()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.FilteredRowSet#getFilter() public abstract javax.sql.rowset.Predicate
     *      javax.sql.rowset.FilteredRowSet.getFilter() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFilter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.FilteredRowSet#setFilter(javax.sql.rowset.Predicate) public abstract void
     * javax.sql.rowset.FilteredRowSet.setFilter(javax.sql.rowset.Predicate) throws java.sql.SQLException}.
     *
     * <p>
     * Test method for {@link javax.sql.rowset.FilteredRowSet#setFilter(javax.sql.rowset.Predicate) public abstract void
     * javax.sql.rowset.FilteredRowSet.setFilter(javax.sql.rowset.Predicate) throws java.sql.SQLException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.FilteredRowSet#setFilter(javax.sql.rowset.Predicate) public abstract void
     *      javax.sql.rowset.FilteredRowSet.setFilter(javax.sql.rowset.Predicate) throws java.sql.SQLException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setFilter_Predicate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
