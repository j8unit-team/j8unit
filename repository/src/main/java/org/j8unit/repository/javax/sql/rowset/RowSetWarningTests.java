package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sql.rowset.RowSetWarning class javax.sql.rowset.RowSetWarning}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link RowSetWarningClassTests}.
 * </p>
 *
 * @see javax.sql.rowset.RowSetWarning class javax.sql.rowset.RowSetWarning (the hereby targeted class-under-test class)
 * @see RowSetWarningClassTests RowSetWarningClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
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
     * <p>
     * Test method for {@link javax.sql.rowset.RowSetWarning#getNextWarning() public javax.sql.rowset.RowSetWarning
     * javax.sql.rowset.RowSetWarning.getNextWarning()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.RowSetWarning#getNextWarning() public javax.sql.rowset.RowSetWarning
     *      javax.sql.rowset.RowSetWarning.getNextWarning() (the hereby targeted method-under-test)
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
     * <p>
     * Test method for {@link javax.sql.rowset.RowSetWarning#setNextWarning(javax.sql.rowset.RowSetWarning) public void
     * javax.sql.rowset.RowSetWarning.setNextWarning(javax.sql.rowset.RowSetWarning)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.rowset.RowSetWarning#setNextWarning(javax.sql.rowset.RowSetWarning) public void
     *      javax.sql.rowset.RowSetWarning.setNextWarning(javax.sql.rowset.RowSetWarning) (the hereby targeted
     *      method-under-test)
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
