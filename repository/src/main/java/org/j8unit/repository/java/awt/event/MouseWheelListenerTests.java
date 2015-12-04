package org.j8unit.repository.java.awt.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.event.MouseWheelListener interface java.awt.event.MouseWheelListener}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.event.MouseWheelListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MouseWheelListenerTests<SUT extends java.awt.event.MouseWheelListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.event.MouseWheelListener#mouseWheelMoved(java.awt.event.MouseWheelEvent) public
     * abstract void java.awt.event.MouseWheelListener.mouseWheelMoved(java.awt.event.MouseWheelEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_mouseWheelMoved_MouseWheelEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
