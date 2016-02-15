package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.event.InternalFrameEvent class
 * javax.swing.event.InternalFrameEvent}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link InternalFrameEventClassTests}.
 * </p>
 *
 * @see javax.swing.event.InternalFrameEvent class javax.swing.event.InternalFrameEvent (the hereby targeted
 *      class-under-test class)
 * @see InternalFrameEventClassTests InternalFrameEventClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InternalFrameEventTests<SUT extends javax.swing.event.InternalFrameEvent>
extends org.j8unit.repository.java.awt.AWTEventTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.event.InternalFrameEvent#paramString() public java.lang.String
     * javax.swing.event.InternalFrameEvent.paramString()}.
     *
     * <p>
     * Test method for {@link javax.swing.event.InternalFrameEvent#paramString() public java.lang.String
     * javax.swing.event.InternalFrameEvent.paramString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.event.InternalFrameEvent#paramString() public java.lang.String
     *      javax.swing.event.InternalFrameEvent.paramString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_paramString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.event.InternalFrameEvent#getInternalFrame() public javax.swing.JInternalFrame
     * javax.swing.event.InternalFrameEvent.getInternalFrame()}.
     *
     * <p>
     * Test method for {@link javax.swing.event.InternalFrameEvent#getInternalFrame() public javax.swing.JInternalFrame
     * javax.swing.event.InternalFrameEvent.getInternalFrame()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.event.InternalFrameEvent#getInternalFrame() public javax.swing.JInternalFrame
     *      javax.swing.event.InternalFrameEvent.getInternalFrame() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInternalFrame()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
