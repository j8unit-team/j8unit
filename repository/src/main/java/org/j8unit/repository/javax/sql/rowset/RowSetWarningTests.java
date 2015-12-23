package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.sql.rowset.RowSetWarning class javax.sql.rowset.RowSetWarning},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.sql.rowset.RowSetWarningTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.sql.rowset.RowSetWarningClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.sql.rowset.RowSetWarning
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RowSetWarningTests<SUT extends javax.sql.rowset.RowSetWarning>
extends org.j8unit.repository.java.sql.SQLExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.RowSetWarning#getNextWarning() public javax.sql.rowset.RowSetWarning
     * javax.sql.rowset.RowSetWarning.getNextWarning()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sql.rowset.RowSetWarning#getNextWarning()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNextWarning()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.RowSetWarning#setNextWarning(javax.sql.rowset.RowSetWarning) public void
     * javax.sql.rowset.RowSetWarning.setNextWarning(javax.sql.rowset.RowSetWarning)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sql.rowset.RowSetWarning#setNextWarning(javax.sql.rowset.RowSetWarning)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setNextWarning_RowSetWarning()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
