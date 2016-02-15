package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.event.UndoableEditListener interface
 * javax.swing.event.UndoableEditListener}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link UndoableEditListenerClassTests}.
 * </p>
 *
 * @see javax.swing.event.UndoableEditListener interface javax.swing.event.UndoableEditListener (the hereby targeted
 *      class-under-test class)
 * @see UndoableEditListenerClassTests UndoableEditListenerClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UndoableEditListenerTests<SUT extends javax.swing.event.UndoableEditListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.event.UndoableEditListener#undoableEditHappened(javax.swing.event.UndoableEditEvent) public
     * abstract void javax.swing.event.UndoableEditListener.undoableEditHappened(javax.swing.event.UndoableEditEvent)}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.event.UndoableEditListener#undoableEditHappened(javax.swing.event.UndoableEditEvent) public
     * abstract void javax.swing.event.UndoableEditListener.undoableEditHappened(javax.swing.event.UndoableEditEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.event.UndoableEditListener#undoableEditHappened(javax.swing.event.UndoableEditEvent) public
     *      abstract void
     *      javax.swing.event.UndoableEditListener.undoableEditHappened(javax.swing.event.UndoableEditEvent) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_undoableEditHappened_UndoableEditEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
