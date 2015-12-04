package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.basic.BasicListUI class javax.swing.plaf.basic.BasicListUI}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicListUIClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BasicListUITests<SUT extends javax.swing.plaf.basic.BasicListUI>
extends org.j8unit.repository.javax.swing.plaf.ListUITests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicListUI$FocusHandler class
     * javax.swing.plaf.basic.BasicListUI$FocusHandler}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicListUIClassTests.FocusHandlerClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface FocusHandlerTests<SUT extends javax.swing.plaf.basic.BasicListUI.FocusHandler>
    extends org.j8unit.repository.java.awt.event.FocusListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.basic.BasicListUI.FocusHandler#focusGained(java.awt.event.FocusEvent)
         * public void javax.swing.plaf.basic.BasicListUI$FocusHandler.focusGained(java.awt.event.FocusEvent)}.
         * </p>
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
         * Test method for {@link javax.swing.plaf.basic.BasicListUI.FocusHandler#focusLost(java.awt.event.FocusEvent)
         * public void javax.swing.plaf.basic.BasicListUI$FocusHandler.focusLost(java.awt.event.FocusEvent)}.
         * </p>
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
     * Test class for {@link javax.swing.plaf.basic.BasicListUI$ListDataHandler class
     * javax.swing.plaf.basic.BasicListUI$ListDataHandler}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicListUIClassTests.ListDataHandlerClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ListDataHandlerTests<SUT extends javax.swing.plaf.basic.BasicListUI.ListDataHandler>
    extends org.j8unit.repository.javax.swing.event.ListDataListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicListUI.ListDataHandler#contentsChanged(javax.swing.event.ListDataEvent)
         * public void
         * javax.swing.plaf.basic.BasicListUI$ListDataHandler.contentsChanged(javax.swing.event.ListDataEvent)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_contentsChanged_ListDataEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicListUI.ListDataHandler#intervalAdded(javax.swing.event.ListDataEvent)
         * public void
         * javax.swing.plaf.basic.BasicListUI$ListDataHandler.intervalAdded(javax.swing.event.ListDataEvent)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_intervalAdded_ListDataEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicListUI.ListDataHandler#intervalRemoved(javax.swing.event.ListDataEvent)
         * public void
         * javax.swing.plaf.basic.BasicListUI$ListDataHandler.intervalRemoved(javax.swing.event.ListDataEvent)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_intervalRemoved_ListDataEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicListUI$ListSelectionHandler class
     * javax.swing.plaf.basic.BasicListUI$ListSelectionHandler}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicListUIClassTests.ListSelectionHandlerClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ListSelectionHandlerTests<SUT extends javax.swing.plaf.basic.BasicListUI.ListSelectionHandler>
    extends org.j8unit.repository.javax.swing.event.ListSelectionListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicListUI.ListSelectionHandler#valueChanged(javax.swing.event.ListSelectionEvent)
         * public void
         * javax.swing.plaf.basic.BasicListUI$ListSelectionHandler.valueChanged(javax.swing.event.ListSelectionEvent)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_valueChanged_ListSelectionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicListUI$MouseInputHandler class
     * javax.swing.plaf.basic.BasicListUI$MouseInputHandler}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicListUIClassTests.MouseInputHandlerClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface MouseInputHandlerTests<SUT extends javax.swing.plaf.basic.BasicListUI.MouseInputHandler>
    extends org.j8unit.repository.javax.swing.event.MouseInputListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicListUI.MouseInputHandler#mouseClicked(java.awt.event.MouseEvent) public
         * void javax.swing.plaf.basic.BasicListUI$MouseInputHandler.mouseClicked(java.awt.event.MouseEvent)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_mouseClicked_MouseEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicListUI.MouseInputHandler#mouseDragged(java.awt.event.MouseEvent) public
         * void javax.swing.plaf.basic.BasicListUI$MouseInputHandler.mouseDragged(java.awt.event.MouseEvent)}.
         * </p>
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
         * {@link javax.swing.plaf.basic.BasicListUI.MouseInputHandler#mouseEntered(java.awt.event.MouseEvent) public
         * void javax.swing.plaf.basic.BasicListUI$MouseInputHandler.mouseEntered(java.awt.event.MouseEvent)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_mouseEntered_MouseEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicListUI.MouseInputHandler#mouseExited(java.awt.event.MouseEvent) public
         * void javax.swing.plaf.basic.BasicListUI$MouseInputHandler.mouseExited(java.awt.event.MouseEvent)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_mouseExited_MouseEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicListUI.MouseInputHandler#mouseMoved(java.awt.event.MouseEvent) public void
         * javax.swing.plaf.basic.BasicListUI$MouseInputHandler.mouseMoved(java.awt.event.MouseEvent)}.
         * </p>
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
         * {@link javax.swing.plaf.basic.BasicListUI.MouseInputHandler#mousePressed(java.awt.event.MouseEvent) public
         * void javax.swing.plaf.basic.BasicListUI$MouseInputHandler.mousePressed(java.awt.event.MouseEvent)}.
         * </p>
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
         * {@link javax.swing.plaf.basic.BasicListUI.MouseInputHandler#mouseReleased(java.awt.event.MouseEvent) public
         * void javax.swing.plaf.basic.BasicListUI$MouseInputHandler.mouseReleased(java.awt.event.MouseEvent)}.
         * </p>
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

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicListUI$PropertyChangeHandler class
     * javax.swing.plaf.basic.BasicListUI$PropertyChangeHandler}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicListUIClassTests.PropertyChangeHandlerClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface PropertyChangeHandlerTests<SUT extends javax.swing.plaf.basic.BasicListUI.PropertyChangeHandler>
    extends org.j8unit.repository.java.beans.PropertyChangeListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicListUI.PropertyChangeHandler#propertyChange(java.beans.PropertyChangeEvent)
         * public void
         * javax.swing.plaf.basic.BasicListUI$PropertyChangeHandler.propertyChange(java.beans.PropertyChangeEvent)}.
         * </p>
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
     * Test method for {@link javax.swing.plaf.basic.BasicListUI#getBaseline(javax.swing.JComponent,int,int) public int
     * javax.swing.plaf.basic.BasicListUI.getBaseline(javax.swing.JComponent,int,int)}.
     * </p>
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
     * Test method for {@link javax.swing.plaf.basic.BasicListUI#getBaselineResizeBehavior(javax.swing.JComponent)
     * public java.awt.Component$BaselineResizeBehavior
     * javax.swing.plaf.basic.BasicListUI.getBaselineResizeBehavior(javax.swing.JComponent)}.
     * </p>
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
     * Test method for {@link javax.swing.plaf.basic.BasicListUI#getCellBounds(javax.swing.JList,int,int) public
     * java.awt.Rectangle javax.swing.plaf.basic.BasicListUI.getCellBounds(javax.swing.JList,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getCellBounds_JList_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicListUI#getPreferredSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.basic.BasicListUI.getPreferredSize(javax.swing.JComponent)}.
     * </p>
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
     * Test method for {@link javax.swing.plaf.basic.BasicListUI#indexToLocation(javax.swing.JList,int) public
     * java.awt.Point javax.swing.plaf.basic.BasicListUI.indexToLocation(javax.swing.JList,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_indexToLocation_JList_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicListUI#installUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicListUI.installUI(javax.swing.JComponent)}.
     * </p>
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
     * Test method for {@link javax.swing.plaf.basic.BasicListUI#locationToIndex(javax.swing.JList,java.awt.Point)
     * public int javax.swing.plaf.basic.BasicListUI.locationToIndex(javax.swing.JList,java.awt.Point)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_locationToIndex_JList_Point()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicListUI#paint(java.awt.Graphics,javax.swing.JComponent) public
     * void javax.swing.plaf.basic.BasicListUI.paint(java.awt.Graphics,javax.swing.JComponent)}.
     * </p>
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
     * Test method for {@link javax.swing.plaf.basic.BasicListUI#uninstallUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicListUI.uninstallUI(javax.swing.JComponent)}.
     * </p>
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

}
