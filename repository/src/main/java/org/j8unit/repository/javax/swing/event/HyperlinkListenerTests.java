package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.event.HyperlinkListener interface javax.swing.event.HyperlinkListener}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.event.HyperlinkListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface HyperlinkListenerTests<SUT extends javax.swing.event.HyperlinkListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.event.HyperlinkListener#hyperlinkUpdate(javax.swing.event.HyperlinkEvent)
     * public abstract void javax.swing.event.HyperlinkListener.hyperlinkUpdate(javax.swing.event.HyperlinkEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hyperlinkUpdate_HyperlinkEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
