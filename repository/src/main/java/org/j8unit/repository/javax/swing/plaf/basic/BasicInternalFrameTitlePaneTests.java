package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicInternalFrameTitlePane class
 * javax.swing.plaf.basic.BasicInternalFrameTitlePane}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link BasicInternalFrameTitlePaneClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane class javax.swing.plaf.basic.BasicInternalFrameTitlePane (the
 *      hereby targeted class-under-test class)
 * @see BasicInternalFrameTitlePaneClassTests BasicInternalFrameTitlePaneClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicInternalFrameTitlePaneTests<SUT extends javax.swing.plaf.basic.BasicInternalFrameTitlePane>
extends org.j8unit.repository.javax.swing.JComponentTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane#paintComponent(java.awt.Graphics)
     * public void javax.swing.plaf.basic.BasicInternalFrameTitlePane.paintComponent(java.awt.Graphics)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane#paintComponent(java.awt.Graphics)
     * public void javax.swing.plaf.basic.BasicInternalFrameTitlePane.paintComponent(java.awt.Graphics)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane#paintComponent(java.awt.Graphics) public void
     *      javax.swing.plaf.basic.BasicInternalFrameTitlePane.paintComponent(java.awt.Graphics) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_paintComponent_Graphics()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of
     * {@linkplain javax.swing.plaf.basic.BasicInternalFrameTitlePane.PropertyChangeHandler class
     * javax.swing.plaf.basic.BasicInternalFrameTitlePane$PropertyChangeHandler}. The complementary j8unit test
     * interface containing the class relevant aspects is
     * {@link BasicInternalFrameTitlePaneClassTests.PropertyChangeHandlerClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.PropertyChangeHandler class
     *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$PropertyChangeHandler (the hereby targeted
     *      class-under-test class)
     * @see BasicInternalFrameTitlePaneClassTests.PropertyChangeHandlerClassTests
     *      BasicInternalFrameTitlePaneClassTests.PropertyChangeHandlerClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PropertyChangeHandlerTests<SUT extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.PropertyChangeHandler>
    extends org.j8unit.repository.java.beans.PropertyChangeListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.PropertyChangeHandler#propertyChange(java.beans.PropertyChangeEvent)
         * public void
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$PropertyChangeHandler.propertyChange(java.beans.PropertyChangeEvent)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.PropertyChangeHandler#propertyChange(java.beans.PropertyChangeEvent)
         * public void
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$PropertyChangeHandler.propertyChange(java.beans.PropertyChangeEvent)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.PropertyChangeHandler#propertyChange(java.beans.PropertyChangeEvent)
         *      public void
         *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$PropertyChangeHandler.propertyChange(java.beans.
         *      PropertyChangeEvent) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_propertyChange_PropertyChangeEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicInternalFrameTitlePane.SizeAction class
     * javax.swing.plaf.basic.BasicInternalFrameTitlePane$SizeAction}. The complementary j8unit test interface
     * containing the class relevant aspects is {@link BasicInternalFrameTitlePaneClassTests.SizeActionClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.SizeAction class
     *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$SizeAction (the hereby targeted class-under-test class)
     * @see BasicInternalFrameTitlePaneClassTests.SizeActionClassTests
     *      BasicInternalFrameTitlePaneClassTests.SizeActionClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SizeActionTests<SUT extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.SizeAction>
    extends org.j8unit.repository.javax.swing.AbstractActionTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.SizeAction#actionPerformed(java.awt.event.ActionEvent)
         * public void
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$SizeAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.SizeAction#actionPerformed(java.awt.event.ActionEvent)
         * public void
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$SizeAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.SizeAction#actionPerformed(java.awt.event.ActionEvent)
         *      public void
         *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$SizeAction.actionPerformed(java.awt.event.
         *      ActionEvent) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout
     * class javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout}. The complementary j8unit test
     * interface containing the class relevant aspects is
     * {@link BasicInternalFrameTitlePaneClassTests.TitlePaneLayoutClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout class
     *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout (the hereby targeted class-under-test
     *      class)
     * @see BasicInternalFrameTitlePaneClassTests.TitlePaneLayoutClassTests
     *      BasicInternalFrameTitlePaneClassTests.TitlePaneLayoutClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TitlePaneLayoutTests<SUT extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout>
    extends org.j8unit.repository.java.awt.LayoutManagerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout#addLayoutComponent(String, java.awt.Component)
         * public void
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout.addLayoutComponent(java.lang.String,java.awt.Component)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout#addLayoutComponent(String, java.awt.Component)
         * public void
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout.addLayoutComponent(java.lang.String,java.awt.Component)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout#addLayoutComponent(String,
         *      java.awt.Component) public void
         *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout.addLayoutComponent(java.lang.String,
         *      java.awt.Component) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_addLayoutComponent_String_Component()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout#layoutContainer(java.awt.Container)
         * public void
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout.layoutContainer(java.awt.Container)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout#layoutContainer(java.awt.Container)
         * public void
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout.layoutContainer(java.awt.Container)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout#layoutContainer(java.awt.Container)
         *      public void
         *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout.layoutContainer(java.awt.Container)
         *      (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_layoutContainer_Container()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout#minimumLayoutSize(java.awt.Container)
         * public java.awt.Dimension
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout.minimumLayoutSize(java.awt.Container)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout#minimumLayoutSize(java.awt.Container)
         * public java.awt.Dimension
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout.minimumLayoutSize(java.awt.Container)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout#minimumLayoutSize(java.awt.Container)
         *      public java.awt.Dimension
         *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout.minimumLayoutSize(java.awt.Container)
         *      (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_minimumLayoutSize_Container()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout#removeLayoutComponent(java.awt.Component)
         * public void
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout.removeLayoutComponent(java.awt.Component)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout#removeLayoutComponent(java.awt.Component)
         * public void
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout.removeLayoutComponent(java.awt.Component)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout#removeLayoutComponent(java.awt.Component)
         *      public void
         *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout.removeLayoutComponent(java.awt.
         *      Component) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_removeLayoutComponent_Component()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout#preferredLayoutSize(java.awt.Container)
         * public java.awt.Dimension
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout.preferredLayoutSize(java.awt.Container)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout#preferredLayoutSize(java.awt.Container)
         * public java.awt.Dimension
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout.preferredLayoutSize(java.awt.Container)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout#preferredLayoutSize(java.awt.Container)
         *      public java.awt.Dimension
         *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$TitlePaneLayout.preferredLayoutSize(java.awt.
         *      Container) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_preferredLayoutSize_Container()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction class
     * javax.swing.plaf.basic.BasicInternalFrameTitlePane$RestoreAction}. The complementary j8unit test interface
     * containing the class relevant aspects is {@link BasicInternalFrameTitlePaneClassTests.RestoreActionClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction class
     *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$RestoreAction (the hereby targeted class-under-test
     *      class)
     * @see BasicInternalFrameTitlePaneClassTests.RestoreActionClassTests
     *      BasicInternalFrameTitlePaneClassTests.RestoreActionClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface RestoreActionTests<SUT extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction>
    extends org.j8unit.repository.javax.swing.AbstractActionTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction#actionPerformed(java.awt.event.ActionEvent)
         * public void
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$RestoreAction.actionPerformed(java.awt.event.ActionEvent)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction#actionPerformed(java.awt.event.ActionEvent)
         * public void
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$RestoreAction.actionPerformed(java.awt.event.ActionEvent)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction#actionPerformed(java.awt.event.ActionEvent)
         *      public void
         *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$RestoreAction.actionPerformed(java.awt.event.
         *      ActionEvent) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar class
     * javax.swing.plaf.basic.BasicInternalFrameTitlePane$SystemMenuBar}. The complementary j8unit test interface
     * containing the class relevant aspects is {@link BasicInternalFrameTitlePaneClassTests.SystemMenuBarClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar class
     *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$SystemMenuBar (the hereby targeted class-under-test
     *      class)
     * @see BasicInternalFrameTitlePaneClassTests.SystemMenuBarClassTests
     *      BasicInternalFrameTitlePaneClassTests.SystemMenuBarClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SystemMenuBarTests<SUT extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar>
    extends org.j8unit.repository.javax.swing.JMenuBarTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar#paint(java.awt.Graphics) public void
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$SystemMenuBar.paint(java.awt.Graphics)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar#paint(java.awt.Graphics) public void
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$SystemMenuBar.paint(java.awt.Graphics)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar#paint(java.awt.Graphics) public void
         *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$SystemMenuBar.paint(java.awt.Graphics) (the hereby
         *      targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_paint_Graphics()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar#isFocusTraversable()
         * public boolean javax.swing.plaf.basic.BasicInternalFrameTitlePane$SystemMenuBar.isFocusTraversable()}.
         *
         * <p>
         * Test method for {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar#isFocusTraversable()
         * public boolean javax.swing.plaf.basic.BasicInternalFrameTitlePane$SystemMenuBar.isFocusTraversable()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar#isFocusTraversable() public boolean
         *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$SystemMenuBar.isFocusTraversable() (the hereby
         *      targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_isFocusTraversable()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar#isOpaque() public
         * boolean javax.swing.plaf.basic.BasicInternalFrameTitlePane$SystemMenuBar.isOpaque()}.
         *
         * <p>
         * Test method for {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar#isOpaque() public
         * boolean javax.swing.plaf.basic.BasicInternalFrameTitlePane$SystemMenuBar.isOpaque()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar#isOpaque() public boolean
         *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$SystemMenuBar.isOpaque() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_isOpaque()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar#requestFocus() public
         * void javax.swing.plaf.basic.BasicInternalFrameTitlePane$SystemMenuBar.requestFocus()}.
         *
         * <p>
         * Test method for {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar#requestFocus() public
         * void javax.swing.plaf.basic.BasicInternalFrameTitlePane$SystemMenuBar.requestFocus()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar#requestFocus() public void
         *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$SystemMenuBar.requestFocus() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_requestFocus()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction
     * class javax.swing.plaf.basic.BasicInternalFrameTitlePane$MaximizeAction}. The complementary j8unit test interface
     * containing the class relevant aspects is {@link BasicInternalFrameTitlePaneClassTests.MaximizeActionClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction class
     *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$MaximizeAction (the hereby targeted class-under-test
     *      class)
     * @see BasicInternalFrameTitlePaneClassTests.MaximizeActionClassTests
     *      BasicInternalFrameTitlePaneClassTests.MaximizeActionClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MaximizeActionTests<SUT extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction>
    extends org.j8unit.repository.javax.swing.AbstractActionTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction#actionPerformed(java.awt.event.ActionEvent)
         * public void
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$MaximizeAction.actionPerformed(java.awt.event.ActionEvent)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction#actionPerformed(java.awt.event.ActionEvent)
         * public void
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$MaximizeAction.actionPerformed(java.awt.event.ActionEvent)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction#actionPerformed(java.awt.event.ActionEvent)
         *      public void
         *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$MaximizeAction.actionPerformed(java.awt.event.
         *      ActionEvent) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction class
     * javax.swing.plaf.basic.BasicInternalFrameTitlePane$IconifyAction}. The complementary j8unit test interface
     * containing the class relevant aspects is {@link BasicInternalFrameTitlePaneClassTests.IconifyActionClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction class
     *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$IconifyAction (the hereby targeted class-under-test
     *      class)
     * @see BasicInternalFrameTitlePaneClassTests.IconifyActionClassTests
     *      BasicInternalFrameTitlePaneClassTests.IconifyActionClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface IconifyActionTests<SUT extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction>
    extends org.j8unit.repository.javax.swing.AbstractActionTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction#actionPerformed(java.awt.event.ActionEvent)
         * public void
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$IconifyAction.actionPerformed(java.awt.event.ActionEvent)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction#actionPerformed(java.awt.event.ActionEvent)
         * public void
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$IconifyAction.actionPerformed(java.awt.event.ActionEvent)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction#actionPerformed(java.awt.event.ActionEvent)
         *      public void
         *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$IconifyAction.actionPerformed(java.awt.event.
         *      ActionEvent) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction class
     * javax.swing.plaf.basic.BasicInternalFrameTitlePane$MoveAction}. The complementary j8unit test interface
     * containing the class relevant aspects is {@link BasicInternalFrameTitlePaneClassTests.MoveActionClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction class
     *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$MoveAction (the hereby targeted class-under-test class)
     * @see BasicInternalFrameTitlePaneClassTests.MoveActionClassTests
     *      BasicInternalFrameTitlePaneClassTests.MoveActionClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MoveActionTests<SUT extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction>
    extends org.j8unit.repository.javax.swing.AbstractActionTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction#actionPerformed(java.awt.event.ActionEvent)
         * public void
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$MoveAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction#actionPerformed(java.awt.event.ActionEvent)
         * public void
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$MoveAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction#actionPerformed(java.awt.event.ActionEvent)
         *      public void
         *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$MoveAction.actionPerformed(java.awt.event.
         *      ActionEvent) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction class
     * javax.swing.plaf.basic.BasicInternalFrameTitlePane$CloseAction}. The complementary j8unit test interface
     * containing the class relevant aspects is {@link BasicInternalFrameTitlePaneClassTests.CloseActionClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction class
     *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$CloseAction (the hereby targeted class-under-test class)
     * @see BasicInternalFrameTitlePaneClassTests.CloseActionClassTests
     *      BasicInternalFrameTitlePaneClassTests.CloseActionClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CloseActionTests<SUT extends javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction>
    extends org.j8unit.repository.javax.swing.AbstractActionTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction#actionPerformed(java.awt.event.ActionEvent)
         * public void
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$CloseAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction#actionPerformed(java.awt.event.ActionEvent)
         * public void
         * javax.swing.plaf.basic.BasicInternalFrameTitlePane$CloseAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction#actionPerformed(java.awt.event.ActionEvent)
         *      public void
         *      javax.swing.plaf.basic.BasicInternalFrameTitlePane$CloseAction.actionPerformed(java.awt.event.
         *      ActionEvent) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
