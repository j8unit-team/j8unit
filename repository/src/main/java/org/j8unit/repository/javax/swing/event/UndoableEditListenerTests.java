package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.event.UndoableEditListener interface javax.swing.event.UndoableEditListener},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.event.UndoableEditListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface UndoableEditListenerTests<SUT extends javax.swing.event.UndoableEditListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.event.UndoableEditListener#undoableEditHappened(javax.swing.event.UndoableEditEvent) public
     * abstract void javax.swing.event.UndoableEditListener.undoableEditHappened(javax.swing.event.UndoableEditEvent)}.
     * </p>
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
