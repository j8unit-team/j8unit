package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.sql.rowset.RowSetWarning class javax.sql.rowset.RowSetWarning}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.sql.rowset.RowSetWarningClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RowSetWarningTests<SUT extends javax.sql.rowset.RowSetWarning>
extends org.j8unit.repository.java.sql.SQLExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.rowset.RowSetWarning#getNextWarning() public javax.sql.rowset.RowSetWarning
     * javax.sql.rowset.RowSetWarning.getNextWarning()}.
     * </p>
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
     * </p>
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
