package org.j8unit.repository.java.awt.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.event.InputMethodListener interface java.awt.event.InputMethodListener}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.event.InputMethodListenerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InputMethodListenerTests<SUT extends java.awt.event.InputMethodListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.event.InputMethodListener#caretPositionChanged(java.awt.event.InputMethodEvent)
     * public abstract void java.awt.event.InputMethodListener.caretPositionChanged(java.awt.event.InputMethodEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_caretPositionChanged_InputMethodEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.event.InputMethodListener#inputMethodTextChanged(java.awt.event.InputMethodEvent)
     * public abstract void java.awt.event.InputMethodListener.inputMethodTextChanged(java.awt.event.InputMethodEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_inputMethodTextChanged_InputMethodEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
