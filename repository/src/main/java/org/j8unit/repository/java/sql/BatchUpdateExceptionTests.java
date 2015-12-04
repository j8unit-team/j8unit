package org.j8unit.repository.java.sql;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.sql.BatchUpdateException class java.sql.BatchUpdateException}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.sql.BatchUpdateExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BatchUpdateExceptionTests<SUT extends java.sql.BatchUpdateException>
extends org.j8unit.repository.java.sql.SQLExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.sql.BatchUpdateException#getLargeUpdateCounts() public long[]
     * java.sql.BatchUpdateException.getLargeUpdateCounts()}.
     * </p>
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
     * </p>
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
