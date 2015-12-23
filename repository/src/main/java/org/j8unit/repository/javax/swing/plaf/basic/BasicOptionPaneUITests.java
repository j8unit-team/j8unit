package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicOptionPaneUI class
 * javax.swing.plaf.basic.BasicOptionPaneUI}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUITests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUIClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicOptionPaneUITests<SUT extends javax.swing.plaf.basic.BasicOptionPaneUI>
extends org.j8unit.repository.javax.swing.plaf.OptionPaneUITests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener
     * class javax.swing.plaf.basic.BasicOptionPaneUI$ButtonActionListener}, containing all instance relevant test
     * methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface
     * containing the class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUITests.ButtonActionListenerTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUIClassTests.ButtonActionListenerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ButtonActionListenerTests<SUT extends javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener>
    extends org.j8unit.repository.java.awt.event.ActionListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener#actionPerformed(java.awt.event.ActionEvent)
         * public void
         * javax.swing.plaf.basic.BasicOptionPaneUI$ButtonActionListener.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener#actionPerformed(java.awt.event.
         *             ActionEvent)
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

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout class
     * javax.swing.plaf.basic.BasicOptionPaneUI$ButtonAreaLayout}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUITests.ButtonAreaLayoutTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUIClassTests.ButtonAreaLayoutClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ButtonAreaLayoutTests<SUT extends javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout>
    extends org.j8unit.repository.java.awt.LayoutManagerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#addLayoutComponent(java.lang.String, java.awt.Component)
         * public void
         * javax.swing.plaf.basic.BasicOptionPaneUI$ButtonAreaLayout.addLayoutComponent(java.lang.String,java.awt.Component)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#addLayoutComponent(java.lang.String,
         *             java.awt.Component)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_addLayoutComponent_String_Component()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#getCentersChildren() public
         * boolean javax.swing.plaf.basic.BasicOptionPaneUI$ButtonAreaLayout.getCentersChildren()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#getCentersChildren()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getCentersChildren()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#getPadding() public int
         * javax.swing.plaf.basic.BasicOptionPaneUI$ButtonAreaLayout.getPadding()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#getPadding()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getPadding()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#getSyncAllWidths() public
         * boolean javax.swing.plaf.basic.BasicOptionPaneUI$ButtonAreaLayout.getSyncAllWidths()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#getSyncAllWidths()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getSyncAllWidths()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#layoutContainer(java.awt.Container) public
         * void javax.swing.plaf.basic.BasicOptionPaneUI$ButtonAreaLayout.layoutContainer(java.awt.Container)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#layoutContainer(java.awt.Container)
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
         * {@link javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#minimumLayoutSize(java.awt.Container) public
         * java.awt.Dimension
         * javax.swing.plaf.basic.BasicOptionPaneUI$ButtonAreaLayout.minimumLayoutSize(java.awt.Container)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#minimumLayoutSize(java.awt.Container)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_minimumLayoutSize_Container()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#preferredLayoutSize(java.awt.Container)
         * public java.awt.Dimension
         * javax.swing.plaf.basic.BasicOptionPaneUI$ButtonAreaLayout.preferredLayoutSize(java.awt.Container)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#preferredLayoutSize(java.awt.Container)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_preferredLayoutSize_Container()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#removeLayoutComponent(java.awt.Component)
         * public void
         * javax.swing.plaf.basic.BasicOptionPaneUI$ButtonAreaLayout.removeLayoutComponent(java.awt.Component)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#removeLayoutComponent(java.awt.
         *             Component)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_removeLayoutComponent_Component()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#setCentersChildren(boolean)
         * public void javax.swing.plaf.basic.BasicOptionPaneUI$ButtonAreaLayout.setCentersChildren(boolean)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#setCentersChildren(boolean)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_setCentersChildren_boolean()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#setPadding(int) public void
         * javax.swing.plaf.basic.BasicOptionPaneUI$ButtonAreaLayout.setPadding(int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#setPadding(int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_setPadding_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#setSyncAllWidths(boolean)
         * public void javax.swing.plaf.basic.BasicOptionPaneUI$ButtonAreaLayout.setSyncAllWidths(boolean)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout#setSyncAllWidths(boolean)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_setSyncAllWidths_boolean()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicOptionPaneUI.PropertyChangeHandler
     * class javax.swing.plaf.basic.BasicOptionPaneUI$PropertyChangeHandler}, containing all instance relevant test
     * methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface
     * containing the class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUITests.PropertyChangeHandlerTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUIClassTests.PropertyChangeHandlerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.PropertyChangeHandler
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PropertyChangeHandlerTests<SUT extends javax.swing.plaf.basic.BasicOptionPaneUI.PropertyChangeHandler>
    extends org.j8unit.repository.java.beans.PropertyChangeListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicOptionPaneUI.PropertyChangeHandler#propertyChange(java.beans.PropertyChangeEvent)
         * public void
         * javax.swing.plaf.basic.BasicOptionPaneUI$PropertyChangeHandler.propertyChange(java.beans.PropertyChangeEvent)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI.PropertyChangeHandler#propertyChange(java.beans.
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
     * Test method for {@link javax.swing.plaf.basic.BasicOptionPaneUI#containsCustomComponents(javax.swing.JOptionPane)
     * public boolean javax.swing.plaf.basic.BasicOptionPaneUI.containsCustomComponents(javax.swing.JOptionPane)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI#containsCustomComponents(javax.swing.JOptionPane)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_containsCustomComponents_JOptionPane()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicOptionPaneUI#getMinimumOptionPaneSize() public
     * java.awt.Dimension javax.swing.plaf.basic.BasicOptionPaneUI.getMinimumOptionPaneSize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI#getMinimumOptionPaneSize()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMinimumOptionPaneSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicOptionPaneUI#getPreferredSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.basic.BasicOptionPaneUI.getPreferredSize(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI#getPreferredSize(javax.swing.JComponent)
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
     * Test method for {@link javax.swing.plaf.basic.BasicOptionPaneUI#installUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicOptionPaneUI.installUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI#installUI(javax.swing.JComponent)
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
     * Test method for {@link javax.swing.plaf.basic.BasicOptionPaneUI#selectInitialValue(javax.swing.JOptionPane)
     * public void javax.swing.plaf.basic.BasicOptionPaneUI.selectInitialValue(javax.swing.JOptionPane)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI#selectInitialValue(javax.swing.JOptionPane)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_selectInitialValue_JOptionPane()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicOptionPaneUI#uninstallUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicOptionPaneUI.uninstallUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicOptionPaneUI#uninstallUI(javax.swing.JComponent)
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
