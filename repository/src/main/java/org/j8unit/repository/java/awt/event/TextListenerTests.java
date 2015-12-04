package org.j8unit.repository.java.awt.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.event.TextListener interface java.awt.event.TextListener}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.event.TextListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TextListenerTests<SUT extends java.awt.event.TextListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.event.TextListener#textValueChanged(java.awt.event.TextEvent) public abstract
     * void java.awt.event.TextListener.textValueChanged(java.awt.event.TextEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_textValueChanged_TextEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
