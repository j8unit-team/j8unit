package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalBorders class
 * javax.swing.plaf.metal.MetalBorders}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link MetalBordersClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.metal.MetalBorders class javax.swing.plaf.metal.MetalBorders (the hereby targeted
 *      class-under-test class)
 * @see MetalBordersClassTests MetalBordersClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalBordersTests<SUT extends javax.swing.plaf.metal.MetalBorders>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalBorders.Flush3DBorder class
     * javax.swing.plaf.metal.MetalBorders$Flush3DBorder}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link MetalBordersClassTests.Flush3DBorderClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalBorders.Flush3DBorder class javax.swing.plaf.metal.MetalBorders$Flush3DBorder
     *      (the hereby targeted class-under-test class)
     * @see MetalBordersClassTests.Flush3DBorderClassTests MetalBordersClassTests.Flush3DBorderClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface Flush3DBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.Flush3DBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.Flush3DBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$Flush3DBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.Flush3DBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$Flush3DBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.Flush3DBorder#paintBorder(java.awt.Component, java.awt.Graphics,
         *      int, int, int, int) public void
         *      javax.swing.plaf.metal.MetalBorders$Flush3DBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,
         *      int,int,int) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_paintBorder_Component_Graphics_int_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.Flush3DBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$Flush3DBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.Flush3DBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$Flush3DBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.Flush3DBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         *      public java.awt.Insets
         *      javax.swing.plaf.metal.MetalBorders$Flush3DBorder.getBorderInsets(java.awt.Component,java.awt.Insets)
         *      (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getBorderInsets_Component_Insets()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalBorders.PopupMenuBorder class
     * javax.swing.plaf.metal.MetalBorders$PopupMenuBorder}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link MetalBordersClassTests.PopupMenuBorderClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalBorders.PopupMenuBorder class
     *      javax.swing.plaf.metal.MetalBorders$PopupMenuBorder (the hereby targeted class-under-test class)
     * @see MetalBordersClassTests.PopupMenuBorderClassTests MetalBordersClassTests.PopupMenuBorderClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PopupMenuBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.PopupMenuBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.PopupMenuBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$PopupMenuBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.PopupMenuBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$PopupMenuBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.PopupMenuBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         *      public java.awt.Insets
         *      javax.swing.plaf.metal.MetalBorders$PopupMenuBorder.getBorderInsets(java.awt.Component,java.awt.Insets)
         *      (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getBorderInsets_Component_Insets()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.PopupMenuBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$PopupMenuBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.PopupMenuBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$PopupMenuBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.PopupMenuBorder#paintBorder(java.awt.Component, java.awt.Graphics,
         *      int, int, int, int) public void
         *      javax.swing.plaf.metal.MetalBorders$PopupMenuBorder.paintBorder(java.awt.Component,java.awt.Graphics,int
         *      ,int,int,int) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_paintBorder_Component_Graphics_int_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder class
     * javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link MetalBordersClassTests.ScrollPaneBorderClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder class
     *      javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder (the hereby targeted class-under-test class)
     * @see MetalBordersClassTests.ScrollPaneBorderClassTests MetalBordersClassTests.ScrollPaneBorderClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ScrollPaneBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder#getBorderInsets(java.awt.Component,
         *      java.awt.Insets) public java.awt.Insets
         *      javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder.getBorderInsets(java.awt.Component,java.awt.Insets)
         *      (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getBorderInsets_Component_Insets()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder#paintBorder(java.awt.Component, java.awt.Graphics,
         *      int, int, int, int) public void
         *      javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder.paintBorder(java.awt.Component,java.awt.Graphics,
         *      int,int,int,int) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_paintBorder_Component_Graphics_int_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalBorders.OptionDialogBorder class
     * javax.swing.plaf.metal.MetalBorders$OptionDialogBorder}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link MetalBordersClassTests.OptionDialogBorderClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalBorders.OptionDialogBorder class
     *      javax.swing.plaf.metal.MetalBorders$OptionDialogBorder (the hereby targeted class-under-test class)
     * @see MetalBordersClassTests.OptionDialogBorderClassTests MetalBordersClassTests.OptionDialogBorderClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface OptionDialogBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.OptionDialogBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.OptionDialogBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$OptionDialogBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.OptionDialogBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$OptionDialogBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.OptionDialogBorder#getBorderInsets(java.awt.Component,
         *      java.awt.Insets) public java.awt.Insets
         *      javax.swing.plaf.metal.MetalBorders$OptionDialogBorder.getBorderInsets(java.awt.Component,java.awt.
         *      Insets) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getBorderInsets_Component_Insets()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.OptionDialogBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$OptionDialogBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.OptionDialogBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$OptionDialogBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.OptionDialogBorder#paintBorder(java.awt.Component,
         *      java.awt.Graphics, int, int, int, int) public void
         *      javax.swing.plaf.metal.MetalBorders$OptionDialogBorder.paintBorder(java.awt.Component,java.awt.Graphics,
         *      int,int,int,int) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_paintBorder_Component_Graphics_int_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalBorders.TextFieldBorder class
     * javax.swing.plaf.metal.MetalBorders$TextFieldBorder}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link MetalBordersClassTests.TextFieldBorderClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalBorders.TextFieldBorder class
     *      javax.swing.plaf.metal.MetalBorders$TextFieldBorder (the hereby targeted class-under-test class)
     * @see MetalBordersClassTests.TextFieldBorderClassTests MetalBordersClassTests.TextFieldBorderClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TextFieldBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.TextFieldBorder>
    extends MetalBordersTests.Flush3DBorderTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.TextFieldBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$TextFieldBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.TextFieldBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$TextFieldBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.TextFieldBorder#paintBorder(java.awt.Component, java.awt.Graphics,
         *      int, int, int, int) public void
         *      javax.swing.plaf.metal.MetalBorders$TextFieldBorder.paintBorder(java.awt.Component,java.awt.Graphics,int
         *      ,int,int,int) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_paintBorder_Component_Graphics_int_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalBorders.MenuBarBorder class
     * javax.swing.plaf.metal.MetalBorders$MenuBarBorder}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link MetalBordersClassTests.MenuBarBorderClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalBorders.MenuBarBorder class javax.swing.plaf.metal.MetalBorders$MenuBarBorder
     *      (the hereby targeted class-under-test class)
     * @see MetalBordersClassTests.MenuBarBorderClassTests MetalBordersClassTests.MenuBarBorderClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MenuBarBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.MenuBarBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.MenuBarBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$MenuBarBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.MenuBarBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$MenuBarBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.MenuBarBorder#paintBorder(java.awt.Component, java.awt.Graphics,
         *      int, int, int, int) public void
         *      javax.swing.plaf.metal.MetalBorders$MenuBarBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,
         *      int,int,int) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_paintBorder_Component_Graphics_int_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.MenuBarBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$MenuBarBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.MenuBarBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$MenuBarBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.MenuBarBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         *      public java.awt.Insets
         *      javax.swing.plaf.metal.MetalBorders$MenuBarBorder.getBorderInsets(java.awt.Component,java.awt.Insets)
         *      (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getBorderInsets_Component_Insets()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder class
     * javax.swing.plaf.metal.MetalBorders$ToggleButtonBorder}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link MetalBordersClassTests.ToggleButtonBorderClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder class
     *      javax.swing.plaf.metal.MetalBorders$ToggleButtonBorder (the hereby targeted class-under-test class)
     * @see MetalBordersClassTests.ToggleButtonBorderClassTests MetalBordersClassTests.ToggleButtonBorderClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ToggleButtonBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder>
    extends MetalBordersTests.ButtonBorderTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$ToggleButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$ToggleButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder#paintBorder(java.awt.Component,
         *      java.awt.Graphics, int, int, int, int) public void
         *      javax.swing.plaf.metal.MetalBorders$ToggleButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,
         *      int,int,int,int) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_paintBorder_Component_Graphics_int_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalBorders.ToolBarBorder class
     * javax.swing.plaf.metal.MetalBorders$ToolBarBorder}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link MetalBordersClassTests.ToolBarBorderClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalBorders.ToolBarBorder class javax.swing.plaf.metal.MetalBorders$ToolBarBorder
     *      (the hereby targeted class-under-test class)
     * @see MetalBordersClassTests.ToolBarBorderClassTests MetalBordersClassTests.ToolBarBorderClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ToolBarBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.ToolBarBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.SwingConstantsTests<SUT>,
    org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.ToolBarBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$ToolBarBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.ToolBarBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$ToolBarBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.ToolBarBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         *      public java.awt.Insets
         *      javax.swing.plaf.metal.MetalBorders$ToolBarBorder.getBorderInsets(java.awt.Component,java.awt.Insets)
         *      (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getBorderInsets_Component_Insets()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.ToolBarBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$ToolBarBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.ToolBarBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$ToolBarBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.ToolBarBorder#paintBorder(java.awt.Component, java.awt.Graphics,
         *      int, int, int, int) public void
         *      javax.swing.plaf.metal.MetalBorders$ToolBarBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,
         *      int,int,int) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_paintBorder_Component_Graphics_int_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalBorders.TableHeaderBorder class
     * javax.swing.plaf.metal.MetalBorders$TableHeaderBorder}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link MetalBordersClassTests.TableHeaderBorderClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalBorders.TableHeaderBorder class
     *      javax.swing.plaf.metal.MetalBorders$TableHeaderBorder (the hereby targeted class-under-test class)
     * @see MetalBordersClassTests.TableHeaderBorderClassTests MetalBordersClassTests.TableHeaderBorderClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TableHeaderBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.TableHeaderBorder>
    extends org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.TableHeaderBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$TableHeaderBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.TableHeaderBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$TableHeaderBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.TableHeaderBorder#getBorderInsets(java.awt.Component,
         *      java.awt.Insets) public java.awt.Insets
         *      javax.swing.plaf.metal.MetalBorders$TableHeaderBorder.getBorderInsets(java.awt.Component,java.awt.
         *      Insets) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getBorderInsets_Component_Insets()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.TableHeaderBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$TableHeaderBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.TableHeaderBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$TableHeaderBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.TableHeaderBorder#paintBorder(java.awt.Component, java.awt.Graphics,
         *      int, int, int, int) public void
         *      javax.swing.plaf.metal.MetalBorders$TableHeaderBorder.paintBorder(java.awt.Component,java.awt.Graphics,
         *      int,int,int,int) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_paintBorder_Component_Graphics_int_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalBorders.ButtonBorder class
     * javax.swing.plaf.metal.MetalBorders$ButtonBorder}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link MetalBordersClassTests.ButtonBorderClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalBorders.ButtonBorder class javax.swing.plaf.metal.MetalBorders$ButtonBorder (the
     *      hereby targeted class-under-test class)
     * @see MetalBordersClassTests.ButtonBorderClassTests MetalBordersClassTests.ButtonBorderClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ButtonBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.ButtonBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.ButtonBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$ButtonBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.ButtonBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$ButtonBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.ButtonBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         *      public java.awt.Insets
         *      javax.swing.plaf.metal.MetalBorders$ButtonBorder.getBorderInsets(java.awt.Component,java.awt.Insets)
         *      (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getBorderInsets_Component_Insets()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.ButtonBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$ButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.ButtonBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$ButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.ButtonBorder#paintBorder(java.awt.Component, java.awt.Graphics, int,
         *      int, int, int) public void
         *      javax.swing.plaf.metal.MetalBorders$ButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,
         *      int,int,int) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_paintBorder_Component_Graphics_int_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalBorders.MenuItemBorder class
     * javax.swing.plaf.metal.MetalBorders$MenuItemBorder}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link MetalBordersClassTests.MenuItemBorderClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalBorders.MenuItemBorder class javax.swing.plaf.metal.MetalBorders$MenuItemBorder
     *      (the hereby targeted class-under-test class)
     * @see MetalBordersClassTests.MenuItemBorderClassTests MetalBordersClassTests.MenuItemBorderClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MenuItemBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.MenuItemBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.MenuItemBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$MenuItemBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.MenuItemBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$MenuItemBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.MenuItemBorder#paintBorder(java.awt.Component, java.awt.Graphics,
         *      int, int, int, int) public void
         *      javax.swing.plaf.metal.MetalBorders$MenuItemBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,
         *      int,int,int) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_paintBorder_Component_Graphics_int_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.MenuItemBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$MenuItemBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.MenuItemBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$MenuItemBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.MenuItemBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         *      public java.awt.Insets
         *      javax.swing.plaf.metal.MetalBorders$MenuItemBorder.getBorderInsets(java.awt.Component,java.awt.Insets)
         *      (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getBorderInsets_Component_Insets()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalBorders.RolloverButtonBorder class
     * javax.swing.plaf.metal.MetalBorders$RolloverButtonBorder}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link MetalBordersClassTests.RolloverButtonBorderClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalBorders.RolloverButtonBorder class
     *      javax.swing.plaf.metal.MetalBorders$RolloverButtonBorder (the hereby targeted class-under-test class)
     * @see MetalBordersClassTests.RolloverButtonBorderClassTests MetalBordersClassTests.RolloverButtonBorderClassTests
     *      (the complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface RolloverButtonBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.RolloverButtonBorder>
    extends MetalBordersTests.ButtonBorderTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.RolloverButtonBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$RolloverButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.RolloverButtonBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$RolloverButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.RolloverButtonBorder#paintBorder(java.awt.Component,
         *      java.awt.Graphics, int, int, int, int) public void
         *      javax.swing.plaf.metal.MetalBorders$RolloverButtonBorder.paintBorder(java.awt.Component,java.awt.
         *      Graphics,int,int,int,int) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_paintBorder_Component_Graphics_int_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalBorders.InternalFrameBorder class
     * javax.swing.plaf.metal.MetalBorders$InternalFrameBorder}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link MetalBordersClassTests.InternalFrameBorderClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalBorders.InternalFrameBorder class
     *      javax.swing.plaf.metal.MetalBorders$InternalFrameBorder (the hereby targeted class-under-test class)
     * @see MetalBordersClassTests.InternalFrameBorderClassTests MetalBordersClassTests.InternalFrameBorderClassTests
     *      (the complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface InternalFrameBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.InternalFrameBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.InternalFrameBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$InternalFrameBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.InternalFrameBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$InternalFrameBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.InternalFrameBorder#paintBorder(java.awt.Component,
         *      java.awt.Graphics, int, int, int, int) public void
         *      javax.swing.plaf.metal.MetalBorders$InternalFrameBorder.paintBorder(java.awt.Component,java.awt.Graphics
         *      ,int,int,int,int) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_paintBorder_Component_Graphics_int_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.InternalFrameBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$InternalFrameBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.InternalFrameBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$InternalFrameBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.InternalFrameBorder#getBorderInsets(java.awt.Component,
         *      java.awt.Insets) public java.awt.Insets
         *      javax.swing.plaf.metal.MetalBorders$InternalFrameBorder.getBorderInsets(java.awt.Component,java.awt.
         *      Insets) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getBorderInsets_Component_Insets()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalBorders.PaletteBorder class
     * javax.swing.plaf.metal.MetalBorders$PaletteBorder}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link MetalBordersClassTests.PaletteBorderClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalBorders.PaletteBorder class javax.swing.plaf.metal.MetalBorders$PaletteBorder
     *      (the hereby targeted class-under-test class)
     * @see MetalBordersClassTests.PaletteBorderClassTests MetalBordersClassTests.PaletteBorderClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PaletteBorderTests<SUT extends javax.swing.plaf.metal.MetalBorders.PaletteBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.PaletteBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$PaletteBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.PaletteBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$PaletteBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.PaletteBorder#paintBorder(java.awt.Component, java.awt.Graphics,
         *      int, int, int, int) public void
         *      javax.swing.plaf.metal.MetalBorders$PaletteBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,
         *      int,int,int) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_paintBorder_Component_Graphics_int_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.PaletteBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$PaletteBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.metal.MetalBorders.PaletteBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$PaletteBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.metal.MetalBorders.PaletteBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         *      public java.awt.Insets
         *      javax.swing.plaf.metal.MetalBorders$PaletteBorder.getBorderInsets(java.awt.Component,java.awt.Insets)
         *      (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getBorderInsets_Component_Insets()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
