package org.j8unit.repository.javax.sql;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.sql.RowSetListener interface javax.sql.RowSetListener},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.sql.RowSetListenerTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.sql.RowSetListenerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.sql.RowSetListener
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RowSetListenerTests<SUT extends javax.sql.RowSetListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sql.RowSetListener#cursorMoved(javax.sql.RowSetEvent) public abstract void
     * javax.sql.RowSetListener.cursorMoved(javax.sql.RowSetEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sql.RowSetListener#cursorMoved(javax.sql.RowSetEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_cursorMoved_RowSetEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.RowSetListener#rowChanged(javax.sql.RowSetEvent) public abstract void
     * javax.sql.RowSetListener.rowChanged(javax.sql.RowSetEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sql.RowSetListener#rowChanged(javax.sql.RowSetEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_rowChanged_RowSetEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sql.RowSetListener#rowSetChanged(javax.sql.RowSetEvent) public abstract void
     * javax.sql.RowSetListener.rowSetChanged(javax.sql.RowSetEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.sql.RowSetListener#rowSetChanged(javax.sql.RowSetEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_rowSetChanged_RowSetEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
