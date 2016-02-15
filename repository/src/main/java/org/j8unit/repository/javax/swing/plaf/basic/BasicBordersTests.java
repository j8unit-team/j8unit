package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicBorders class
 * javax.swing.plaf.basic.BasicBorders}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link BasicBordersClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.basic.BasicBorders class javax.swing.plaf.basic.BasicBorders (the hereby targeted
 *      class-under-test class)
 * @see BasicBordersClassTests BasicBordersClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicBordersTests<SUT extends javax.swing.plaf.basic.BasicBorders>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder class
     * javax.swing.plaf.basic.BasicBorders$ToggleButtonBorder}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link BasicBordersClassTests.ToggleButtonBorderClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder class
     *      javax.swing.plaf.basic.BasicBorders$ToggleButtonBorder (the hereby targeted class-under-test class)
     * @see BasicBordersClassTests.ToggleButtonBorderClassTests BasicBordersClassTests.ToggleButtonBorderClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ToggleButtonBorderTests<SUT extends javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder>
    extends BasicBordersTests.ButtonBorderTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.basic.BasicBorders$ToggleButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.basic.BasicBorders$ToggleButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder#paintBorder(java.awt.Component,
         *      java.awt.Graphics, int, int, int, int) public void
         *      javax.swing.plaf.basic.BasicBorders$ToggleButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,
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

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.basic.BasicBorders$ToggleButtonBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.basic.BasicBorders$ToggleButtonBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder#getBorderInsets(java.awt.Component,
         *      java.awt.Insets) public java.awt.Insets
         *      javax.swing.plaf.basic.BasicBorders$ToggleButtonBorder.getBorderInsets(java.awt.Component,java.awt.
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
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicBorders.SplitPaneBorder class
     * javax.swing.plaf.basic.BasicBorders$SplitPaneBorder}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link BasicBordersClassTests.SplitPaneBorderClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicBorders.SplitPaneBorder class
     *      javax.swing.plaf.basic.BasicBorders$SplitPaneBorder (the hereby targeted class-under-test class)
     * @see BasicBordersClassTests.SplitPaneBorderClassTests BasicBordersClassTests.SplitPaneBorderClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SplitPaneBorderTests<SUT extends javax.swing.plaf.basic.BasicBorders.SplitPaneBorder>
    extends org.j8unit.repository.javax.swing.border.BorderTests<SUT>, org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>,
    org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.basic.BasicBorders.SplitPaneBorder#isBorderOpaque() public boolean
         * javax.swing.plaf.basic.BasicBorders$SplitPaneBorder.isBorderOpaque()}.
         *
         * <p>
         * Test method for {@link javax.swing.plaf.basic.BasicBorders.SplitPaneBorder#isBorderOpaque() public boolean
         * javax.swing.plaf.basic.BasicBorders$SplitPaneBorder.isBorderOpaque()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicBorders.SplitPaneBorder#isBorderOpaque() public boolean
         *      javax.swing.plaf.basic.BasicBorders$SplitPaneBorder.isBorderOpaque() (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_isBorderOpaque()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.SplitPaneBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.basic.BasicBorders$SplitPaneBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.SplitPaneBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.basic.BasicBorders$SplitPaneBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicBorders.SplitPaneBorder#paintBorder(java.awt.Component, java.awt.Graphics,
         *      int, int, int, int) public void
         *      javax.swing.plaf.basic.BasicBorders$SplitPaneBorder.paintBorder(java.awt.Component,java.awt.Graphics,int
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

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.SplitPaneBorder#getBorderInsets(java.awt.Component) public
         * java.awt.Insets javax.swing.plaf.basic.BasicBorders$SplitPaneBorder.getBorderInsets(java.awt.Component)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.SplitPaneBorder#getBorderInsets(java.awt.Component) public
         * java.awt.Insets javax.swing.plaf.basic.BasicBorders$SplitPaneBorder.getBorderInsets(java.awt.Component)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicBorders.SplitPaneBorder#getBorderInsets(java.awt.Component) public
         *      java.awt.Insets javax.swing.plaf.basic.BasicBorders$SplitPaneBorder.getBorderInsets(java.awt.Component)
         *      (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_getBorderInsets_Component()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicBorders.MarginBorder class
     * javax.swing.plaf.basic.BasicBorders$MarginBorder}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link BasicBordersClassTests.MarginBorderClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicBorders.MarginBorder class javax.swing.plaf.basic.BasicBorders$MarginBorder (the
     *      hereby targeted class-under-test class)
     * @see BasicBordersClassTests.MarginBorderClassTests BasicBordersClassTests.MarginBorderClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MarginBorderTests<SUT extends javax.swing.plaf.basic.BasicBorders.MarginBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.MarginBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.basic.BasicBorders$MarginBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.MarginBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.basic.BasicBorders$MarginBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicBorders.MarginBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         *      public java.awt.Insets
         *      javax.swing.plaf.basic.BasicBorders$MarginBorder.getBorderInsets(java.awt.Component,java.awt.Insets)
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
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder class
     * javax.swing.plaf.basic.BasicBorders$RolloverButtonBorder}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link BasicBordersClassTests.RolloverButtonBorderClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder class
     *      javax.swing.plaf.basic.BasicBorders$RolloverButtonBorder (the hereby targeted class-under-test class)
     * @see BasicBordersClassTests.RolloverButtonBorderClassTests BasicBordersClassTests.RolloverButtonBorderClassTests
     *      (the complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface RolloverButtonBorderTests<SUT extends javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder>
    extends BasicBordersTests.ButtonBorderTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.basic.BasicBorders$RolloverButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.basic.BasicBorders$RolloverButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder#paintBorder(java.awt.Component,
         *      java.awt.Graphics, int, int, int, int) public void
         *      javax.swing.plaf.basic.BasicBorders$RolloverButtonBorder.paintBorder(java.awt.Component,java.awt.
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
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicBorders.ButtonBorder class
     * javax.swing.plaf.basic.BasicBorders$ButtonBorder}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link BasicBordersClassTests.ButtonBorderClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicBorders.ButtonBorder class javax.swing.plaf.basic.BasicBorders$ButtonBorder (the
     *      hereby targeted class-under-test class)
     * @see BasicBordersClassTests.ButtonBorderClassTests BasicBordersClassTests.ButtonBorderClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ButtonBorderTests<SUT extends javax.swing.plaf.basic.BasicBorders.ButtonBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.ButtonBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.basic.BasicBorders$ButtonBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.ButtonBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.basic.BasicBorders$ButtonBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicBorders.ButtonBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         *      public java.awt.Insets
         *      javax.swing.plaf.basic.BasicBorders$ButtonBorder.getBorderInsets(java.awt.Component,java.awt.Insets)
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
         * {@link javax.swing.plaf.basic.BasicBorders.ButtonBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.basic.BasicBorders$ButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.ButtonBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.basic.BasicBorders$ButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicBorders.ButtonBorder#paintBorder(java.awt.Component, java.awt.Graphics, int,
         *      int, int, int) public void
         *      javax.swing.plaf.basic.BasicBorders$ButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,
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
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicBorders.FieldBorder class
     * javax.swing.plaf.basic.BasicBorders$FieldBorder}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link BasicBordersClassTests.FieldBorderClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicBorders.FieldBorder class javax.swing.plaf.basic.BasicBorders$FieldBorder (the
     *      hereby targeted class-under-test class)
     * @see BasicBordersClassTests.FieldBorderClassTests BasicBordersClassTests.FieldBorderClassTests (the complementary
     *      j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FieldBorderTests<SUT extends javax.swing.plaf.basic.BasicBorders.FieldBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.FieldBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.basic.BasicBorders$FieldBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.FieldBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.basic.BasicBorders$FieldBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicBorders.FieldBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         *      public java.awt.Insets
         *      javax.swing.plaf.basic.BasicBorders$FieldBorder.getBorderInsets(java.awt.Component,java.awt.Insets) (the
         *      hereby targeted method-under-test)
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
         * {@link javax.swing.plaf.basic.BasicBorders.FieldBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.basic.BasicBorders$FieldBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.FieldBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.basic.BasicBorders$FieldBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicBorders.FieldBorder#paintBorder(java.awt.Component, java.awt.Graphics, int,
         *      int, int, int) public void
         *      javax.swing.plaf.basic.BasicBorders$FieldBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int
         *      ,int,int) (the hereby targeted method-under-test)
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
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicBorders.RadioButtonBorder class
     * javax.swing.plaf.basic.BasicBorders$RadioButtonBorder}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link BasicBordersClassTests.RadioButtonBorderClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicBorders.RadioButtonBorder class
     *      javax.swing.plaf.basic.BasicBorders$RadioButtonBorder (the hereby targeted class-under-test class)
     * @see BasicBordersClassTests.RadioButtonBorderClassTests BasicBordersClassTests.RadioButtonBorderClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface RadioButtonBorderTests<SUT extends javax.swing.plaf.basic.BasicBorders.RadioButtonBorder>
    extends BasicBordersTests.ButtonBorderTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.RadioButtonBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.basic.BasicBorders$RadioButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.RadioButtonBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.basic.BasicBorders$RadioButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicBorders.RadioButtonBorder#paintBorder(java.awt.Component, java.awt.Graphics,
         *      int, int, int, int) public void
         *      javax.swing.plaf.basic.BasicBorders$RadioButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,
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

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.RadioButtonBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.basic.BasicBorders$RadioButtonBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.RadioButtonBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.basic.BasicBorders$RadioButtonBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicBorders.RadioButtonBorder#getBorderInsets(java.awt.Component,
         *      java.awt.Insets) public java.awt.Insets
         *      javax.swing.plaf.basic.BasicBorders$RadioButtonBorder.getBorderInsets(java.awt.Component,java.awt.
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
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicBorders.MenuBarBorder class
     * javax.swing.plaf.basic.BasicBorders$MenuBarBorder}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link BasicBordersClassTests.MenuBarBorderClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicBorders.MenuBarBorder class javax.swing.plaf.basic.BasicBorders$MenuBarBorder
     *      (the hereby targeted class-under-test class)
     * @see BasicBordersClassTests.MenuBarBorderClassTests BasicBordersClassTests.MenuBarBorderClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MenuBarBorderTests<SUT extends javax.swing.plaf.basic.BasicBorders.MenuBarBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.MenuBarBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.basic.BasicBorders$MenuBarBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.MenuBarBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.basic.BasicBorders$MenuBarBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicBorders.MenuBarBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         *      public java.awt.Insets
         *      javax.swing.plaf.basic.BasicBorders$MenuBarBorder.getBorderInsets(java.awt.Component,java.awt.Insets)
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
         * {@link javax.swing.plaf.basic.BasicBorders.MenuBarBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.basic.BasicBorders$MenuBarBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicBorders.MenuBarBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.basic.BasicBorders$MenuBarBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicBorders.MenuBarBorder#paintBorder(java.awt.Component, java.awt.Graphics,
         *      int, int, int, int) public void
         *      javax.swing.plaf.basic.BasicBorders$MenuBarBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,
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

}
