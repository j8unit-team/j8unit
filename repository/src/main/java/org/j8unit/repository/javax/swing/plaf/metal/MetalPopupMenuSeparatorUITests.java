package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalPopupMenuSeparatorUI class
 * javax.swing.plaf.metal.MetalPopupMenuSeparatorUI}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link MetalPopupMenuSeparatorUIClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.metal.MetalPopupMenuSeparatorUI class javax.swing.plaf.metal.MetalPopupMenuSeparatorUI (the
 *      hereby targeted class-under-test class)
 * @see MetalPopupMenuSeparatorUIClassTests MetalPopupMenuSeparatorUIClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalPopupMenuSeparatorUITests<SUT extends javax.swing.plaf.metal.MetalPopupMenuSeparatorUI>
extends MetalSeparatorUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalPopupMenuSeparatorUI#getPreferredSize(javax.swing.JComponent)
     * public java.awt.Dimension
     * javax.swing.plaf.metal.MetalPopupMenuSeparatorUI.getPreferredSize(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalPopupMenuSeparatorUI#getPreferredSize(javax.swing.JComponent)
     * public java.awt.Dimension
     * javax.swing.plaf.metal.MetalPopupMenuSeparatorUI.getPreferredSize(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalPopupMenuSeparatorUI#getPreferredSize(javax.swing.JComponent) public
     *      java.awt.Dimension javax.swing.plaf.metal.MetalPopupMenuSeparatorUI.getPreferredSize(javax.swing.JComponent)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getPreferredSize_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.metal.MetalPopupMenuSeparatorUI#paint(java.awt.Graphics, javax.swing.JComponent) public
     * void javax.swing.plaf.metal.MetalPopupMenuSeparatorUI.paint(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.plaf.metal.MetalPopupMenuSeparatorUI#paint(java.awt.Graphics, javax.swing.JComponent) public
     * void javax.swing.plaf.metal.MetalPopupMenuSeparatorUI.paint(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalPopupMenuSeparatorUI#paint(java.awt.Graphics, javax.swing.JComponent) public
     *      void javax.swing.plaf.metal.MetalPopupMenuSeparatorUI.paint(java.awt.Graphics,javax.swing.JComponent) (the
     *      hereby targeted method-under-test)
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

}
