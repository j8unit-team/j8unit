package org.j8unit.repository.java.awt.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.event.WindowFocusListener interface java.awt.event.WindowFocusListener}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.event.WindowFocusListenerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WindowFocusListenerTests<SUT extends java.awt.event.WindowFocusListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.event.WindowFocusListener#windowGainedFocus(java.awt.event.WindowEvent) public
     * abstract void java.awt.event.WindowFocusListener.windowGainedFocus(java.awt.event.WindowEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_windowGainedFocus_WindowEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.event.WindowFocusListener#windowLostFocus(java.awt.event.WindowEvent) public
     * abstract void java.awt.event.WindowFocusListener.windowLostFocus(java.awt.event.WindowEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_windowLostFocus_WindowEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
