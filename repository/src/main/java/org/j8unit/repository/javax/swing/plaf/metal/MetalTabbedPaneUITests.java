package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalTabbedPaneUI class
 * javax.swing.plaf.metal.MetalTabbedPaneUI}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link MetalTabbedPaneUIClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.metal.MetalTabbedPaneUI class javax.swing.plaf.metal.MetalTabbedPaneUI (the hereby targeted
 *      class-under-test class)
 * @see MetalTabbedPaneUIClassTests MetalTabbedPaneUIClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalTabbedPaneUITests<SUT extends javax.swing.plaf.metal.MetalTabbedPaneUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalTabbedPaneUI#update(java.awt.Graphics, javax.swing.JComponent)
     * public void javax.swing.plaf.metal.MetalTabbedPaneUI.update(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalTabbedPaneUI#update(java.awt.Graphics, javax.swing.JComponent)
     * public void javax.swing.plaf.metal.MetalTabbedPaneUI.update(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalTabbedPaneUI#update(java.awt.Graphics, javax.swing.JComponent) public void
     *      javax.swing.plaf.metal.MetalTabbedPaneUI.update(java.awt.Graphics,javax.swing.JComponent) (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link javax.swing.plaf.metal.MetalTabbedPaneUI#paint(java.awt.Graphics, javax.swing.JComponent)
     * public void javax.swing.plaf.metal.MetalTabbedPaneUI.paint(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalTabbedPaneUI#paint(java.awt.Graphics, javax.swing.JComponent)
     * public void javax.swing.plaf.metal.MetalTabbedPaneUI.paint(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalTabbedPaneUI#paint(java.awt.Graphics, javax.swing.JComponent) public void
     *      javax.swing.plaf.metal.MetalTabbedPaneUI.paint(java.awt.Graphics,javax.swing.JComponent) (the hereby
     *      targeted method-under-test)
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

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout class
     * javax.swing.plaf.metal.MetalTabbedPaneUI$TabbedPaneLayout}. The complementary j8unit test interface containing
     * the class relevant aspects is {@link MetalTabbedPaneUIClassTests.TabbedPaneLayoutClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout class
     *      javax.swing.plaf.metal.MetalTabbedPaneUI$TabbedPaneLayout (the hereby targeted class-under-test class)
     * @see MetalTabbedPaneUIClassTests.TabbedPaneLayoutClassTests
     *      MetalTabbedPaneUIClassTests.TabbedPaneLayoutClassTests (the complementary j8unit test interface containing
     *      the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TabbedPaneLayoutTests<SUT extends javax.swing.plaf.metal.MetalTabbedPaneUI.TabbedPaneLayout>
    extends org.j8unit.repository.javax.swing.plaf.basic.BasicTabbedPaneUITests.TabbedPaneLayoutTests<SUT> {

    }

}
