package org.j8unit.repository.javax.swing.plaf.metal;

import javax.swing.plaf.metal.MetalTabbedPaneUI;
import javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link MetalTabbedPaneUI public class javax.swing.plaf.metal.MetalTabbedPaneUI}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalTabbedPaneUIClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalTabbedPaneUITests<SUT extends MetalTabbedPaneUI>
extends BasicTabbedPaneUITests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalTabbedPaneUI]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.metal.MetalTabbedPaneUI#update(java.awt.Graphics, javax.swing.JComponent) public void
     * javax.swing.plaf.metal.MetalTabbedPaneUI.update(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_update_Graphics_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.plaf.metal.MetalTabbedPaneUI#paint(java.awt.Graphics, javax.swing.JComponent) public void
     * javax.swing.plaf.metal.MetalTabbedPaneUI.paint(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_paint_Graphics_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalTabbedPaneUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalTabbedPaneUI]

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link TabbedPaneLayout public class javax.swing.plaf.metal.MetalTabbedPaneUI$TabbedPaneLayout}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalTabbedPaneUIClassTests.TabbedPaneLayoutClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TabbedPaneLayoutTests<SUT extends TabbedPaneLayout>
    extends org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.TabbedPaneLayoutTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalTabbedPaneUI$TabbedPaneLayout]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalTabbedPaneUI$TabbedPaneLayout]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalTabbedPaneUI$TabbedPaneLayout]

    }

}
