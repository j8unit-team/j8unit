package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.metal.MetalRadioButtonUI class javax.swing.plaf.metal.MetalRadioButtonUI},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.metal.MetalRadioButtonUIClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalRadioButtonUITests<SUT extends javax.swing.plaf.metal.MetalRadioButtonUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicRadioButtonUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalRadioButtonUI#installDefaults(javax.swing.AbstractButton)
     * public void javax.swing.plaf.metal.MetalRadioButtonUI.installDefaults(javax.swing.AbstractButton)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_installDefaults_AbstractButton()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalRadioButtonUI#paint(java.awt.Graphics,javax.swing.JComponent)
     * public synchronized void
     * javax.swing.plaf.metal.MetalRadioButtonUI.paint(java.awt.Graphics,javax.swing.JComponent)}.
     * </p>
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
