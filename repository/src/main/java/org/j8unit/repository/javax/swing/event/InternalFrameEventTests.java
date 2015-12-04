package org.j8unit.repository.javax.swing.event;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.event.InternalFrameEvent class javax.swing.event.InternalFrameEvent}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.event.InternalFrameEventClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface InternalFrameEventTests<SUT extends javax.swing.event.InternalFrameEvent>
extends org.j8unit.repository.java.awt.AWTEventTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.event.InternalFrameEvent#paramString() public java.lang.String
     * javax.swing.event.InternalFrameEvent.paramString()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
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
     * </p>
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
