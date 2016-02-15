package org.j8unit.repository.java.sql;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.sql.BatchUpdateException class java.sql.BatchUpdateException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link BatchUpdateExceptionClassTests}.
 * </p>
 *
 * @see java.sql.BatchUpdateException class java.sql.BatchUpdateException (the hereby targeted class-under-test class)
 * @see BatchUpdateExceptionClassTests BatchUpdateExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BatchUpdateExceptionTests<SUT extends java.sql.BatchUpdateException>
extends SQLExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.sql.BatchUpdateException#getLargeUpdateCounts() public long[]
     * java.sql.BatchUpdateException.getLargeUpdateCounts()}.
     *
     * <p>
     * Test method for {@link java.sql.BatchUpdateException#getLargeUpdateCounts() public long[]
     * java.sql.BatchUpdateException.getLargeUpdateCounts()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.BatchUpdateException#getLargeUpdateCounts() public long[]
     *      java.sql.BatchUpdateException.getLargeUpdateCounts() (the hereby targeted method-under-test)
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
     * <p>
     * Test method for {@link java.sql.BatchUpdateException#getUpdateCounts() public int[]
     * java.sql.BatchUpdateException.getUpdateCounts()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.sql.BatchUpdateException#getUpdateCounts() public int[] java.sql.BatchUpdateException.getUpdateCounts()
     *      (the hereby targeted method-under-test)
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
