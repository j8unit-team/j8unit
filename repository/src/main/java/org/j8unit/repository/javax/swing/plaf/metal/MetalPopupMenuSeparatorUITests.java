package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.metal.MetalPopupMenuSeparatorUI class
 * javax.swing.plaf.metal.MetalPopupMenuSeparatorUI}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.swing.plaf.metal.MetalPopupMenuSeparatorUITests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.metal.MetalPopupMenuSeparatorUIClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.metal.MetalPopupMenuSeparatorUI
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalPopupMenuSeparatorUITests<SUT extends javax.swing.plaf.metal.MetalPopupMenuSeparatorUI>
extends org.j8unit.repository.javax.swing.plaf.metal.MetalSeparatorUITests<SUT> {

    /**
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
     * @j8unit.aim javax.swing.plaf.metal.MetalPopupMenuSeparatorUI#getPreferredSize(javax.swing.JComponent)
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
     * Test method for
     * {@link javax.swing.plaf.metal.MetalPopupMenuSeparatorUI#paint(java.awt.Graphics, javax.swing.JComponent) public
     * void javax.swing.plaf.metal.MetalPopupMenuSeparatorUI.paint(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.metal.MetalPopupMenuSeparatorUI#paint(java.awt.Graphics, javax.swing.JComponent)
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

}
