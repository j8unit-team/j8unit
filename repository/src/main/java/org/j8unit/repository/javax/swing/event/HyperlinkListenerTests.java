package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.event.HyperlinkListener interface
 * javax.swing.event.HyperlinkListener}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link HyperlinkListenerClassTests}.
 * </p>
 *
 * @see javax.swing.event.HyperlinkListener interface javax.swing.event.HyperlinkListener (the hereby targeted
 *      class-under-test class)
 * @see HyperlinkListenerClassTests HyperlinkListenerClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HyperlinkListenerTests<SUT extends javax.swing.event.HyperlinkListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.event.HyperlinkListener#hyperlinkUpdate(javax.swing.event.HyperlinkEvent)
     * public abstract void javax.swing.event.HyperlinkListener.hyperlinkUpdate(javax.swing.event.HyperlinkEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.event.HyperlinkListener#hyperlinkUpdate(javax.swing.event.HyperlinkEvent)
     * public abstract void javax.swing.event.HyperlinkListener.hyperlinkUpdate(javax.swing.event.HyperlinkEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.event.HyperlinkListener#hyperlinkUpdate(javax.swing.event.HyperlinkEvent) public abstract void
     *      javax.swing.event.HyperlinkListener.hyperlinkUpdate(javax.swing.event.HyperlinkEvent) (the hereby targeted
     *      method-under-test)
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
