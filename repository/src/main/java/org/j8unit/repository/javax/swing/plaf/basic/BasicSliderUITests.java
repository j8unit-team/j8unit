package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicSliderUI class
 * javax.swing.plaf.basic.BasicSliderUI}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSliderUITests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicSliderUIClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicSliderUITests<SUT extends javax.swing.plaf.basic.BasicSliderUI>
extends org.j8unit.repository.javax.swing.plaf.SliderUITests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicSliderUI.ActionScroller class
     * javax.swing.plaf.basic.BasicSliderUI$ActionScroller}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSliderUITests.ActionScrollerTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicSliderUIClassTests.ActionScrollerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI.ActionScroller
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ActionScrollerTests<SUT extends javax.swing.plaf.basic.BasicSliderUI.ActionScroller>
    extends org.j8unit.repository.javax.swing.AbstractActionTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicSliderUI.ActionScroller#actionPerformed(java.awt.event.ActionEvent) public
         * void javax.swing.plaf.basic.BasicSliderUI$ActionScroller.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI.ActionScroller#actionPerformed(java.awt.event.ActionEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.basic.BasicSliderUI.ActionScroller#isEnabled() public boolean
         * javax.swing.plaf.basic.BasicSliderUI$ActionScroller.isEnabled()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI.ActionScroller#isEnabled()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_isEnabled()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicSliderUI.ChangeHandler class
     * javax.swing.plaf.basic.BasicSliderUI$ChangeHandler}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSliderUITests.ChangeHandlerTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicSliderUIClassTests.ChangeHandlerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI.ChangeHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ChangeHandlerTests<SUT extends javax.swing.plaf.basic.BasicSliderUI.ChangeHandler>
    extends org.j8unit.repository.javax.swing.event.ChangeListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicSliderUI.ChangeHandler#stateChanged(javax.swing.event.ChangeEvent) public
         * void javax.swing.plaf.basic.BasicSliderUI$ChangeHandler.stateChanged(javax.swing.event.ChangeEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI.ChangeHandler#stateChanged(javax.swing.event.ChangeEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_stateChanged_ChangeEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicSliderUI.ComponentHandler class
     * javax.swing.plaf.basic.BasicSliderUI$ComponentHandler}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSliderUITests.ComponentHandlerTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicSliderUIClassTests.ComponentHandlerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI.ComponentHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ComponentHandlerTests<SUT extends javax.swing.plaf.basic.BasicSliderUI.ComponentHandler>
    extends org.j8unit.repository.java.awt.event.ComponentAdapterTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicSliderUI.ComponentHandler#componentResized(java.awt.event.ComponentEvent)
         * public void
         * javax.swing.plaf.basic.BasicSliderUI$ComponentHandler.componentResized(java.awt.event.ComponentEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI.ComponentHandler#componentResized(java.awt.event.
         *             ComponentEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_componentResized_ComponentEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicSliderUI.FocusHandler class
     * javax.swing.plaf.basic.BasicSliderUI$FocusHandler}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSliderUITests.FocusHandlerTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicSliderUIClassTests.FocusHandlerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI.FocusHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FocusHandlerTests<SUT extends javax.swing.plaf.basic.BasicSliderUI.FocusHandler>
    extends org.j8unit.repository.java.awt.event.FocusListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicSliderUI.FocusHandler#focusGained(java.awt.event.FocusEvent) public void
         * javax.swing.plaf.basic.BasicSliderUI$FocusHandler.focusGained(java.awt.event.FocusEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI.FocusHandler#focusGained(java.awt.event.FocusEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_focusGained_FocusEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.basic.BasicSliderUI.FocusHandler#focusLost(java.awt.event.FocusEvent)
         * public void javax.swing.plaf.basic.BasicSliderUI$FocusHandler.focusLost(java.awt.event.FocusEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI.FocusHandler#focusLost(java.awt.event.FocusEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_focusLost_FocusEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicSliderUI.PropertyChangeHandler class
     * javax.swing.plaf.basic.BasicSliderUI$PropertyChangeHandler}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSliderUITests.PropertyChangeHandlerTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicSliderUIClassTests.PropertyChangeHandlerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI.PropertyChangeHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PropertyChangeHandlerTests<SUT extends javax.swing.plaf.basic.BasicSliderUI.PropertyChangeHandler>
    extends org.j8unit.repository.java.beans.PropertyChangeListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicSliderUI.PropertyChangeHandler#propertyChange(java.beans.PropertyChangeEvent)
         * public void
         * javax.swing.plaf.basic.BasicSliderUI$PropertyChangeHandler.propertyChange(java.beans.PropertyChangeEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI.PropertyChangeHandler#propertyChange(java.beans.
         *             PropertyChangeEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_propertyChange_PropertyChangeEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicSliderUI.ScrollListener class
     * javax.swing.plaf.basic.BasicSliderUI$ScrollListener}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSliderUITests.ScrollListenerTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicSliderUIClassTests.ScrollListenerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI.ScrollListener
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ScrollListenerTests<SUT extends javax.swing.plaf.basic.BasicSliderUI.ScrollListener>
    extends org.j8unit.repository.java.awt.event.ActionListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicSliderUI.ScrollListener#actionPerformed(java.awt.event.ActionEvent) public
         * void javax.swing.plaf.basic.BasicSliderUI$ScrollListener.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI.ScrollListener#actionPerformed(java.awt.event.ActionEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.basic.BasicSliderUI.ScrollListener#setDirection(int) public void
         * javax.swing.plaf.basic.BasicSliderUI$ScrollListener.setDirection(int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI.ScrollListener#setDirection(int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_setDirection_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.basic.BasicSliderUI.ScrollListener#setScrollByBlock(boolean) public
         * void javax.swing.plaf.basic.BasicSliderUI$ScrollListener.setScrollByBlock(boolean)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI.ScrollListener#setScrollByBlock(boolean)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_setScrollByBlock_boolean()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicSliderUI.TrackListener class
     * javax.swing.plaf.basic.BasicSliderUI$TrackListener}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicSliderUITests.TrackListenerTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicSliderUIClassTests.TrackListenerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI.TrackListener
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TrackListenerTests<SUT extends javax.swing.plaf.basic.BasicSliderUI.TrackListener>
    extends org.j8unit.repository.javax.swing.event.MouseInputAdapterTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicSliderUI.TrackListener#mouseDragged(java.awt.event.MouseEvent) public void
         * javax.swing.plaf.basic.BasicSliderUI$TrackListener.mouseDragged(java.awt.event.MouseEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI.TrackListener#mouseDragged(java.awt.event.MouseEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_mouseDragged_MouseEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicSliderUI.TrackListener#mouseMoved(java.awt.event.MouseEvent) public void
         * javax.swing.plaf.basic.BasicSliderUI$TrackListener.mouseMoved(java.awt.event.MouseEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI.TrackListener#mouseMoved(java.awt.event.MouseEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_mouseMoved_MouseEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicSliderUI.TrackListener#mousePressed(java.awt.event.MouseEvent) public void
         * javax.swing.plaf.basic.BasicSliderUI$TrackListener.mousePressed(java.awt.event.MouseEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI.TrackListener#mousePressed(java.awt.event.MouseEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_mousePressed_MouseEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicSliderUI.TrackListener#mouseReleased(java.awt.event.MouseEvent) public
         * void javax.swing.plaf.basic.BasicSliderUI$TrackListener.mouseReleased(java.awt.event.MouseEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI.TrackListener#mouseReleased(java.awt.event.MouseEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_mouseReleased_MouseEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.basic.BasicSliderUI.TrackListener#shouldScroll(int) public boolean
         * javax.swing.plaf.basic.BasicSliderUI$TrackListener.shouldScroll(int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI.TrackListener#shouldScroll(int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_shouldScroll_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicSliderUI#getBaseline(javax.swing.JComponent, int, int) public
     * int javax.swing.plaf.basic.BasicSliderUI.getBaseline(javax.swing.JComponent,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI#getBaseline(javax.swing.JComponent, int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getBaseline_JComponent_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicSliderUI#getBaselineResizeBehavior(javax.swing.JComponent)
     * public java.awt.Component$BaselineResizeBehavior
     * javax.swing.plaf.basic.BasicSliderUI.getBaselineResizeBehavior(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI#getBaselineResizeBehavior(javax.swing.JComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getBaselineResizeBehavior_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicSliderUI#getMaximumSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.basic.BasicSliderUI.getMaximumSize(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI#getMaximumSize(javax.swing.JComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getMaximumSize_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicSliderUI#getMinimumHorizontalSize() public java.awt.Dimension
     * javax.swing.plaf.basic.BasicSliderUI.getMinimumHorizontalSize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI#getMinimumHorizontalSize()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMinimumHorizontalSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicSliderUI#getMinimumSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.basic.BasicSliderUI.getMinimumSize(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI#getMinimumSize(javax.swing.JComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getMinimumSize_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicSliderUI#getMinimumVerticalSize() public java.awt.Dimension
     * javax.swing.plaf.basic.BasicSliderUI.getMinimumVerticalSize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI#getMinimumVerticalSize()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMinimumVerticalSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicSliderUI#getPreferredHorizontalSize() public
     * java.awt.Dimension javax.swing.plaf.basic.BasicSliderUI.getPreferredHorizontalSize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI#getPreferredHorizontalSize()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPreferredHorizontalSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicSliderUI#getPreferredSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.basic.BasicSliderUI.getPreferredSize(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI#getPreferredSize(javax.swing.JComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getPreferredSize_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicSliderUI#getPreferredVerticalSize() public java.awt.Dimension
     * javax.swing.plaf.basic.BasicSliderUI.getPreferredVerticalSize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI#getPreferredVerticalSize()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPreferredVerticalSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicSliderUI#installUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicSliderUI.installUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI#installUI(javax.swing.JComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_installUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicSliderUI#paint(java.awt.Graphics, javax.swing.JComponent)
     * public void javax.swing.plaf.basic.BasicSliderUI.paint(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI#paint(java.awt.Graphics, javax.swing.JComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_paint_Graphics_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicSliderUI#paintFocus(java.awt.Graphics) public void
     * javax.swing.plaf.basic.BasicSliderUI.paintFocus(java.awt.Graphics)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI#paintFocus(java.awt.Graphics)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_paintFocus_Graphics()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicSliderUI#paintLabels(java.awt.Graphics) public void
     * javax.swing.plaf.basic.BasicSliderUI.paintLabels(java.awt.Graphics)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI#paintLabels(java.awt.Graphics)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_paintLabels_Graphics()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicSliderUI#paintThumb(java.awt.Graphics) public void
     * javax.swing.plaf.basic.BasicSliderUI.paintThumb(java.awt.Graphics)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI#paintThumb(java.awt.Graphics)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_paintThumb_Graphics()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicSliderUI#paintTicks(java.awt.Graphics) public void
     * javax.swing.plaf.basic.BasicSliderUI.paintTicks(java.awt.Graphics)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI#paintTicks(java.awt.Graphics)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_paintTicks_Graphics()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicSliderUI#paintTrack(java.awt.Graphics) public void
     * javax.swing.plaf.basic.BasicSliderUI.paintTrack(java.awt.Graphics)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI#paintTrack(java.awt.Graphics)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_paintTrack_Graphics()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicSliderUI#scrollByBlock(int) public void
     * javax.swing.plaf.basic.BasicSliderUI.scrollByBlock(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI#scrollByBlock(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_scrollByBlock_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicSliderUI#scrollByUnit(int) public void
     * javax.swing.plaf.basic.BasicSliderUI.scrollByUnit(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI#scrollByUnit(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_scrollByUnit_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicSliderUI#setThumbLocation(int, int) public void
     * javax.swing.plaf.basic.BasicSliderUI.setThumbLocation(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI#setThumbLocation(int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setThumbLocation_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicSliderUI#uninstallUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicSliderUI.uninstallUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI#uninstallUI(javax.swing.JComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_uninstallUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicSliderUI#valueForXPosition(int) public int
     * javax.swing.plaf.basic.BasicSliderUI.valueForXPosition(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI#valueForXPosition(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_valueForXPosition_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicSliderUI#valueForYPosition(int) public int
     * javax.swing.plaf.basic.BasicSliderUI.valueForYPosition(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicSliderUI#valueForYPosition(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_valueForYPosition_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
