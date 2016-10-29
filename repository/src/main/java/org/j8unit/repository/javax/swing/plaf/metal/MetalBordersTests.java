package org.j8unit.repository.javax.swing.plaf.metal;

import javax.swing.plaf.metal.MetalBorders;
import javax.swing.plaf.metal.MetalBorders.ButtonBorder;
import javax.swing.plaf.metal.MetalBorders.Flush3DBorder;
import javax.swing.plaf.metal.MetalBorders.InternalFrameBorder;
import javax.swing.plaf.metal.MetalBorders.MenuBarBorder;
import javax.swing.plaf.metal.MetalBorders.MenuItemBorder;
import javax.swing.plaf.metal.MetalBorders.OptionDialogBorder;
import javax.swing.plaf.metal.MetalBorders.PaletteBorder;
import javax.swing.plaf.metal.MetalBorders.PopupMenuBorder;
import javax.swing.plaf.metal.MetalBorders.RolloverButtonBorder;
import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;
import javax.swing.plaf.metal.MetalBorders.TableHeaderBorder;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;
import javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder;
import javax.swing.plaf.metal.MetalBorders.ToolBarBorder;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link MetalBorders
 * public class javax.swing.plaf.metal.MetalBorders}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalBordersTests<SUT extends MetalBorders>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders]

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link PaletteBorder public static class javax.swing.plaf.metal.MetalBorders$PaletteBorder}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.PaletteBorderClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PaletteBorderTests<SUT extends PaletteBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$PaletteBorder]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.PaletteBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$PaletteBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.PaletteBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$PaletteBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$PaletteBorder]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link OptionDialogBorder public static class javax.swing.plaf.metal.MetalBorders$OptionDialogBorder}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.OptionDialogBorderClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface OptionDialogBorderTests<SUT extends OptionDialogBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$OptionDialogBorder]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.OptionDialogBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$OptionDialogBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.OptionDialogBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$OptionDialogBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$OptionDialogBorder]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link InternalFrameBorder public static class javax.swing.plaf.metal.MetalBorders$InternalFrameBorder}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.InternalFrameBorderClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface InternalFrameBorderTests<SUT extends InternalFrameBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$InternalFrameBorder]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.InternalFrameBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$InternalFrameBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.InternalFrameBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$InternalFrameBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$InternalFrameBorder]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link ButtonBorder public static class javax.swing.plaf.metal.MetalBorders$ButtonBorder}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.ButtonBorderClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ButtonBorderTests<SUT extends ButtonBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$ButtonBorder]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.ButtonBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$ButtonBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.ButtonBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$ButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$ButtonBorder]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link ToolBarBorder public static class javax.swing.plaf.metal.MetalBorders$ToolBarBorder}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.ToolBarBorderClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ToolBarBorderTests<SUT extends ToolBarBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.SwingConstantsTests<SUT>,
    org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$ToolBarBorder]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.ToolBarBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$ToolBarBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.ToolBarBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$ToolBarBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$ToolBarBorder]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link MenuBarBorder public static class javax.swing.plaf.metal.MetalBorders$MenuBarBorder}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.MenuBarBorderClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MenuBarBorderTests<SUT extends MenuBarBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$MenuBarBorder]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.MenuBarBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$MenuBarBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.MenuBarBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$MenuBarBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$MenuBarBorder]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link ToggleButtonBorder public static class javax.swing.plaf.metal.MetalBorders$ToggleButtonBorder}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.ToggleButtonBorderClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ToggleButtonBorderTests<SUT extends ToggleButtonBorder>
    extends org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.ButtonBorderTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$ToggleButtonBorder]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.ToggleButtonBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$ToggleButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$ToggleButtonBorder]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link TextFieldBorder public static class javax.swing.plaf.metal.MetalBorders$TextFieldBorder}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.TextFieldBorderClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TextFieldBorderTests<SUT extends TextFieldBorder>
    extends org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.Flush3DBorderTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$TextFieldBorder]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.TextFieldBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$TextFieldBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$TextFieldBorder]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link Flush3DBorder public static class javax.swing.plaf.metal.MetalBorders$Flush3DBorder}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.Flush3DBorderClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface Flush3DBorderTests<SUT extends Flush3DBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$Flush3DBorder]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.Flush3DBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$Flush3DBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.Flush3DBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$Flush3DBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$Flush3DBorder]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link MenuItemBorder public static class javax.swing.plaf.metal.MetalBorders$MenuItemBorder}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.MenuItemBorderClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MenuItemBorderTests<SUT extends MenuItemBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$MenuItemBorder]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.MenuItemBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$MenuItemBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.MenuItemBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$MenuItemBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$MenuItemBorder]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link ScrollPaneBorder public static class javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.ScrollPaneBorderClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ScrollPaneBorderTests<SUT extends ScrollPaneBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$ScrollPaneBorder]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link PopupMenuBorder public static class javax.swing.plaf.metal.MetalBorders$PopupMenuBorder}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.PopupMenuBorderClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PopupMenuBorderTests<SUT extends PopupMenuBorder>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$PopupMenuBorder]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.PopupMenuBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$PopupMenuBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.PopupMenuBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$PopupMenuBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$PopupMenuBorder]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link TableHeaderBorder public static class javax.swing.plaf.metal.MetalBorders$TableHeaderBorder}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.TableHeaderBorderClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TableHeaderBorderTests<SUT extends TableHeaderBorder>
    extends org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$TableHeaderBorder]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.TableHeaderBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
         * public java.awt.Insets
         * javax.swing.plaf.metal.MetalBorders$TableHeaderBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.TableHeaderBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$TableHeaderBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$TableHeaderBorder]

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link RolloverButtonBorder public static class javax.swing.plaf.metal.MetalBorders$RolloverButtonBorder}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.swing.plaf.metal.MetalBordersClassTests.RolloverButtonBorderClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface RolloverButtonBorderTests<SUT extends RolloverButtonBorder>
    extends org.j8unit.repository.javax.swing.plaf.metal.MetalBordersTests.ButtonBorderTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$RolloverButtonBorder]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.plaf.metal.MetalBorders.RolloverButtonBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
         * public void
         * javax.swing.plaf.metal.MetalBorders$RolloverButtonBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalBorders$RolloverButtonBorder]

    }

}
