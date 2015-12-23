package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicBorders class
 * javax.swing.plaf.basic.BasicBorders}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicBordersClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.basic.BasicBorders
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicBordersTests<SUT extends javax.swing.plaf.basic.BasicBorders>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicBorders.ButtonBorder class
     * javax.swing.plaf.basic.BasicBorders$ButtonBorder}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.ButtonBorderTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicBordersClassTests.ButtonBorderClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicBorders.ButtonBorder
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
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicBorders.ButtonBorder#getBorderInsets(java.awt.Component,
         *             java.awt.Insets)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
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
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicBorders.ButtonBorder#paintBorder(java.awt.Component,
         *             java.awt.Graphics, int, int, int, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paintBorder_Component_Graphics_int_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicBorders.FieldBorder class
     * javax.swing.plaf.basic.BasicBorders$FieldBorder}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.FieldBorderTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicBordersClassTests.FieldBorderClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicBorders.FieldBorder
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
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicBorders.FieldBorder#getBorderInsets(java.awt.Component,
         *             java.awt.Insets)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
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
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicBorders.FieldBorder#paintBorder(java.awt.Component,
         *             java.awt.Graphics, int, int, int, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paintBorder_Component_Graphics_int_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicBorders.MarginBorder class
     * javax.swing.plaf.basic.BasicBorders$MarginBorder}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.MarginBorderTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicBordersClassTests.MarginBorderClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicBorders.MarginBorder
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
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicBorders.MarginBorder#getBorderInsets(java.awt.Component,
         *             java.awt.Insets)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getBorderInsets_Component_Insets()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicBorders.MenuBarBorder class
     * javax.swing.plaf.basic.BasicBorders$MenuBarBorder}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.MenuBarBorderTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicBordersClassTests.MenuBarBorderClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicBorders.MenuBarBorder
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
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicBorders.MenuBarBorder#getBorderInsets(java.awt.Component,
         *             java.awt.Insets)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
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
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicBorders.MenuBarBorder#paintBorder(java.awt.Component,
         *             java.awt.Graphics, int, int, int, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paintBorder_Component_Graphics_int_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicBorders.RadioButtonBorder class
     * javax.swing.plaf.basic.BasicBorders$RadioButtonBorder}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.RadioButtonBorderTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicBordersClassTests.RadioButtonBorderClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicBorders.RadioButtonBorder
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface RadioButtonBorderTests<SUT extends javax.swing.plaf.basic.BasicBorders.RadioButtonBorder>
    extends org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.ButtonBorderTests<SUT> {

        /**
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
         * @j8unit.aim javax.swing.plaf.basic.BasicBorders.RadioButtonBorder#getBorderInsets(java.awt.Component,
         *             java.awt.Insets)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getBorderInsets_Component_Insets()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
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
         * @j8unit.aim javax.swing.plaf.basic.BasicBorders.RadioButtonBorder#paintBorder(java.awt.Component,
         *             java.awt.Graphics, int, int, int, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paintBorder_Component_Graphics_int_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder class
     * javax.swing.plaf.basic.BasicBorders$RolloverButtonBorder}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.RolloverButtonBorderTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicBordersClassTests.RolloverButtonBorderClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface RolloverButtonBorderTests<SUT extends javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder>
    extends org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.ButtonBorderTests<SUT> {

        /**
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
         * @j8unit.aim javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder#paintBorder(java.awt.Component,
         *             java.awt.Graphics, int, int, int, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paintBorder_Component_Graphics_int_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicBorders.SplitPaneBorder class
     * javax.swing.plaf.basic.BasicBorders$SplitPaneBorder}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.SplitPaneBorderTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicBordersClassTests.SplitPaneBorderClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicBorders.SplitPaneBorder
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SplitPaneBorderTests<SUT extends javax.swing.plaf.basic.BasicBorders.SplitPaneBorder>
    extends org.j8unit.repository.javax.swing.border.BorderTests<SUT>, org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>,
    org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
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
         * @j8unit.aim javax.swing.plaf.basic.BasicBorders.SplitPaneBorder#getBorderInsets(java.awt.Component)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getBorderInsets_Component()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.swing.plaf.basic.BasicBorders.SplitPaneBorder#isBorderOpaque() public boolean
         * javax.swing.plaf.basic.BasicBorders$SplitPaneBorder.isBorderOpaque()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicBorders.SplitPaneBorder#isBorderOpaque()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
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
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicBorders.SplitPaneBorder#paintBorder(java.awt.Component,
         *             java.awt.Graphics, int, int, int, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paintBorder_Component_Graphics_int_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder class
     * javax.swing.plaf.basic.BasicBorders$ToggleButtonBorder}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.ToggleButtonBorderTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicBordersClassTests.ToggleButtonBorderClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ToggleButtonBorderTests<SUT extends javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder>
    extends org.j8unit.repository.javax.swing.plaf.basic.BasicBordersTests.ButtonBorderTests<SUT> {

        /**
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
         * @j8unit.aim javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder#getBorderInsets(java.awt.Component,
         *             java.awt.Insets)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_getBorderInsets_Component_Insets()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
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
         * @j8unit.aim javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder#paintBorder(java.awt.Component,
         *             java.awt.Graphics, int, int, int, int)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paintBorder_Component_Graphics_int_int_int_int()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
