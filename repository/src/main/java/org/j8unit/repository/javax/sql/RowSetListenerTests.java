package org.j8unit.repository.javax.sql;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sql.RowSetListener interface javax.sql.RowSetListener}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link RowSetListenerClassTests}.
 * </p>
 *
 * @see javax.sql.RowSetListener interface javax.sql.RowSetListener (the hereby targeted class-under-test class)
 * @see RowSetListenerClassTests RowSetListenerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
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
     * <p>
     * Test method for {@link javax.sql.RowSetListener#cursorMoved(javax.sql.RowSetEvent) public abstract void
     * javax.sql.RowSetListener.cursorMoved(javax.sql.RowSetEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.RowSetListener#cursorMoved(javax.sql.RowSetEvent) public abstract void
     *      javax.sql.RowSetListener.cursorMoved(javax.sql.RowSetEvent) (the hereby targeted method-under-test)
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
     * Test method for {@link javax.sql.RowSetListener#rowSetChanged(javax.sql.RowSetEvent) public abstract void
     * javax.sql.RowSetListener.rowSetChanged(javax.sql.RowSetEvent)}.
     *
     * <p>
     * Test method for {@link javax.sql.RowSetListener#rowSetChanged(javax.sql.RowSetEvent) public abstract void
     * javax.sql.RowSetListener.rowSetChanged(javax.sql.RowSetEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.RowSetListener#rowSetChanged(javax.sql.RowSetEvent) public abstract void
     *      javax.sql.RowSetListener.rowSetChanged(javax.sql.RowSetEvent) (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link javax.sql.RowSetListener#rowChanged(javax.sql.RowSetEvent) public abstract void
     * javax.sql.RowSetListener.rowChanged(javax.sql.RowSetEvent)}.
     *
     * <p>
     * Test method for {@link javax.sql.RowSetListener#rowChanged(javax.sql.RowSetEvent) public abstract void
     * javax.sql.RowSetListener.rowChanged(javax.sql.RowSetEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sql.RowSetListener#rowChanged(javax.sql.RowSetEvent) public abstract void
     *      javax.sql.RowSetListener.rowChanged(javax.sql.RowSetEvent) (the hereby targeted method-under-test)
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

}
