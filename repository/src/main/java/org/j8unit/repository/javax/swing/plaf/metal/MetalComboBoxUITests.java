package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.metal.MetalComboBoxUI class javax.swing.plaf.metal.MetalComboBoxUI},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxUIClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalComboBoxUITests<SUT extends javax.swing.plaf.metal.MetalComboBoxUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalComboBoxUI$MetalComboBoxLayoutManager class
     * javax.swing.plaf.metal.MetalComboBoxUI$MetalComboBoxLayoutManager}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxUIClassTests.MetalComboBoxLayoutManagerClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MetalComboBoxLayoutManagerTests<SUT extends javax.swing.plaf.metal.MetalComboBoxUI.MetalComboBoxLayoutManager>
    extends org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests.ComboBoxLayoutManagerTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalComboBoxUI.MetalComboBoxLayoutManager#layoutContainer(java.awt.Container)
         * public void
         * javax.swing.plaf.metal.MetalComboBoxUI$MetalComboBoxLayoutManager.layoutContainer(java.awt.Container)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_layoutContainer_Container()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalComboBoxUI.MetalComboBoxLayoutManager#superLayout(java.awt.Container)
         * public void
         * javax.swing.plaf.metal.MetalComboBoxUI$MetalComboBoxLayoutManager.superLayout(java.awt.Container)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_superLayout_Container()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalComboBoxUI$MetalComboPopup class
     * javax.swing.plaf.metal.MetalComboBoxUI$MetalComboPopup}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxUIClassTests.MetalComboPopupClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MetalComboPopupTests<SUT extends javax.swing.plaf.metal.MetalComboBoxUI.MetalComboPopup>
    extends org.j8unit.repository.javax.swing.plaf.basic.BasicComboPopupTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalComboBoxUI.MetalComboPopup#delegateFocus(java.awt.event.MouseEvent) public
         * void javax.swing.plaf.metal.MetalComboBoxUI$MetalComboPopup.delegateFocus(java.awt.event.MouseEvent)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_delegateFocus_MouseEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.metal.MetalComboBoxUI$MetalPropertyChangeListener class
     * javax.swing.plaf.metal.MetalComboBoxUI$MetalPropertyChangeListener}, containing all instance relevant test
     * methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.metal.MetalComboBoxUIClassTests.MetalPropertyChangeListenerClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MetalPropertyChangeListenerTests<SUT extends javax.swing.plaf.metal.MetalComboBoxUI.MetalPropertyChangeListener>
    extends org.j8unit.repository.javax.swing.plaf.basic.BasicComboBoxUITests.PropertyChangeHandlerTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalComboBoxUI.MetalPropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
         * public void
         * javax.swing.plaf.metal.MetalComboBoxUI$MetalPropertyChangeListener.propertyChange(java.beans.PropertyChangeEvent)}
         * .
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
     * Test method for {@link javax.swing.plaf.metal.MetalComboBoxUI#configureEditor() public void
     * javax.swing.plaf.metal.MetalComboBoxUI.configureEditor()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_configureEditor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalComboBoxUI#createPropertyChangeListener() public
     * java.beans.PropertyChangeListener javax.swing.plaf.metal.MetalComboBoxUI.createPropertyChangeListener()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createPropertyChangeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalComboBoxUI#getBaseline(javax.swing.JComponent,int,int) public
     * int javax.swing.plaf.metal.MetalComboBoxUI.getBaseline(javax.swing.JComponent,int,int)}.
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
     * Test method for {@link javax.swing.plaf.metal.MetalComboBoxUI#getMinimumSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.metal.MetalComboBoxUI.getMinimumSize(javax.swing.JComponent)}.
     * </p>
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
     * Test method for
     * {@link javax.swing.plaf.metal.MetalComboBoxUI#layoutComboBox(java.awt.Container,javax.swing.plaf.metal.MetalComboBoxUI.MetalComboBoxLayoutManager)
     * public void
     * javax.swing.plaf.metal.MetalComboBoxUI.layoutComboBox(java.awt.Container,javax.swing.plaf.metal.MetalComboBoxUI$MetalComboBoxLayoutManager)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_layoutComboBox_Container_MetalComboBoxLayoutManager()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalComboBoxUI#paint(java.awt.Graphics,javax.swing.JComponent)
     * public void javax.swing.plaf.metal.MetalComboBoxUI.paint(java.awt.Graphics,javax.swing.JComponent)}.
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
     * Test method for
     * {@link javax.swing.plaf.metal.MetalComboBoxUI#paintCurrentValue(java.awt.Graphics,java.awt.Rectangle,boolean)
     * public void
     * javax.swing.plaf.metal.MetalComboBoxUI.paintCurrentValue(java.awt.Graphics,java.awt.Rectangle,boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_paintCurrentValue_Graphics_Rectangle_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.metal.MetalComboBoxUI#paintCurrentValueBackground(java.awt.Graphics,java.awt.Rectangle,boolean)
     * public void
     * javax.swing.plaf.metal.MetalComboBoxUI.paintCurrentValueBackground(java.awt.Graphics,java.awt.Rectangle,boolean)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_paintCurrentValueBackground_Graphics_Rectangle_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalComboBoxUI#unconfigureEditor() public void
     * javax.swing.plaf.metal.MetalComboBoxUI.unconfigureEditor()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unconfigureEditor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
