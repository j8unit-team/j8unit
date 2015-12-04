package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.metal.MetalProgressBarUI class javax.swing.plaf.metal.MetalProgressBarUI},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.metal.MetalProgressBarUIClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalProgressBarUITests<SUT extends javax.swing.plaf.metal.MetalProgressBarUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicProgressBarUITests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.metal.MetalProgressBarUI#paintDeterminate(java.awt.Graphics,javax.swing.JComponent)
     * public void javax.swing.plaf.metal.MetalProgressBarUI.paintDeterminate(java.awt.Graphics,javax.swing.JComponent)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_paintDeterminate_Graphics_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.metal.MetalProgressBarUI#paintIndeterminate(java.awt.Graphics,javax.swing.JComponent)
     * public void
     * javax.swing.plaf.metal.MetalProgressBarUI.paintIndeterminate(java.awt.Graphics,javax.swing.JComponent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_paintIndeterminate_Graphics_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
