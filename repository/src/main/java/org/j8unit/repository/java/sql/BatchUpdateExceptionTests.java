package org.j8unit.repository.java.sql;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.sql.BatchUpdateException class java.sql.BatchUpdateException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.sql.BatchUpdateExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.sql.BatchUpdateExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.sql.BatchUpdateException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BatchUpdateExceptionTests<SUT extends java.sql.BatchUpdateException>
extends org.j8unit.repository.java.sql.SQLExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.sql.BatchUpdateException#getLargeUpdateCounts() public long[]
     * java.sql.BatchUpdateException.getLargeUpdateCounts()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.sql.BatchUpdateException#getLargeUpdateCounts()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLargeUpdateCounts()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.sql.BatchUpdateException#getUpdateCounts() public int[]
     * java.sql.BatchUpdateException.getUpdateCounts()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.sql.BatchUpdateException#getUpdateCounts()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUpdateCounts()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
