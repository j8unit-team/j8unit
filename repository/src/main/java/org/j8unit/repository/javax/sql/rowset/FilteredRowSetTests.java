package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.sql.rowset.FilteredRowSet interface
 * javax.sql.rowset.FilteredRowSet}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.sql.rowset.FilteredRowSetTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.sql.rowset.FilteredRowSetClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.sql.rowset.FilteredRowSet
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FilteredRowSetTests<SUT extends javax.sql.rowset.FilteredRowSet>
extends org.j8unit.repository.javax.sql.rowset.WebRowSetTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.FilteredRowSet#getFilter() public abstract javax.sql.rowset.Predicate
     * javax.sql.rowset.FilteredRowSet.getFilter()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sql.rowset.FilteredRowSet#getFilter()
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sql.rowset.FilteredRowSet#setFilter(javax.sql.rowset.Predicate)
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
