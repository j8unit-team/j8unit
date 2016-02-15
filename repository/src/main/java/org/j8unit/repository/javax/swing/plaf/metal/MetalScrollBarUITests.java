package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalScrollBarUI class
 * javax.swing.plaf.metal.MetalScrollBarUI}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link MetalScrollBarUIClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.metal.MetalScrollBarUI class javax.swing.plaf.metal.MetalScrollBarUI (the hereby targeted
 *      class-under-test class)
 * @see MetalScrollBarUIClassTests MetalScrollBarUIClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalScrollBarUITests<SUT extends javax.swing.plaf.metal.MetalScrollBarUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicScrollBarUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalScrollBarUI#getPreferredSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.metal.MetalScrollBarUI.getPreferredSize(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalScrollBarUI#getPreferredSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.metal.MetalScrollBarUI.getPreferredSize(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalScrollBarUI#getPreferredSize(javax.swing.JComponent) public java.awt.Dimension
     *      javax.swing.plaf.metal.MetalScrollBarUI.getPreferredSize(javax.swing.JComponent) (the hereby targeted
     *      method-under-test)
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

}
