package org.j8unit.repository.java.awt.dnd;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.dnd.DragSourceMotionListener interface
 * java.awt.dnd.DragSourceMotionListener}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link DragSourceMotionListenerClassTests}.
 * </p>
 *
 * @see java.awt.dnd.DragSourceMotionListener interface java.awt.dnd.DragSourceMotionListener (the hereby targeted
 *      class-under-test class)
 * @see DragSourceMotionListenerClassTests DragSourceMotionListenerClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DragSourceMotionListenerTests<SUT extends java.awt.dnd.DragSourceMotionListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceMotionListener#dragMouseMoved(java.awt.dnd.DragSourceDragEvent)
     * public abstract void java.awt.dnd.DragSourceMotionListener.dragMouseMoved(java.awt.dnd.DragSourceDragEvent)}.
     *
     * <p>
     * Test method for {@link java.awt.dnd.DragSourceMotionListener#dragMouseMoved(java.awt.dnd.DragSourceDragEvent)
     * public abstract void java.awt.dnd.DragSourceMotionListener.dragMouseMoved(java.awt.dnd.DragSourceDragEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.dnd.DragSourceMotionListener#dragMouseMoved(java.awt.dnd.DragSourceDragEvent) public abstract void
     *      java.awt.dnd.DragSourceMotionListener.dragMouseMoved(java.awt.dnd.DragSourceDragEvent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dragMouseMoved_DragSourceDragEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
