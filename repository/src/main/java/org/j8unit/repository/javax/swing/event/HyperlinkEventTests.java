package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.event.HyperlinkEvent class javax.swing.event.HyperlinkEvent}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.event.HyperlinkEventClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HyperlinkEventTests<SUT extends javax.swing.event.HyperlinkEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.event.HyperlinkEvent$EventType class
     * javax.swing.event.HyperlinkEvent$EventType}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.event.HyperlinkEventClassTests.EventTypeClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface EventTypeTests<SUT extends javax.swing.event.HyperlinkEvent.EventType>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.event.HyperlinkEvent.EventType#toString() public java.lang.String
         * javax.swing.event.HyperlinkEvent$EventType.toString()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_toString()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.HyperlinkEvent#getDescription() public java.lang.String
     * javax.swing.event.HyperlinkEvent.getDescription()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDescription()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.HyperlinkEvent#getEventType() public
     * javax.swing.event.HyperlinkEvent$EventType javax.swing.event.HyperlinkEvent.getEventType()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEventType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.HyperlinkEvent#getInputEvent() public java.awt.event.InputEvent
     * javax.swing.event.HyperlinkEvent.getInputEvent()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInputEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.HyperlinkEvent#getSourceElement() public javax.swing.text.Element
     * javax.swing.event.HyperlinkEvent.getSourceElement()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSourceElement()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.HyperlinkEvent#getURL() public java.net.URL
     * javax.swing.event.HyperlinkEvent.getURL()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getURL()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
