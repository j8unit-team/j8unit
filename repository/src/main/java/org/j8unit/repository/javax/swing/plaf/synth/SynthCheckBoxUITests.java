package org.j8unit.repository.javax.swing.plaf.synth;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.synth.SynthCheckBoxUI class
 * javax.swing.plaf.synth.SynthCheckBoxUI}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link SynthCheckBoxUIClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.synth.SynthCheckBoxUI class javax.swing.plaf.synth.SynthCheckBoxUI (the hereby targeted
 *      class-under-test class)
 * @see SynthCheckBoxUIClassTests SynthCheckBoxUIClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SynthCheckBoxUITests<SUT extends javax.swing.plaf.synth.SynthCheckBoxUI>
extends SynthRadioButtonUITests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.synth.SynthCheckBoxUI#paintBorder(javax.swing.plaf.synth.SynthContext, java.awt.Graphics, int, int, int, int)
     * public void
     * javax.swing.plaf.synth.SynthCheckBoxUI.paintBorder(javax.swing.plaf.synth.SynthContext,java.awt.Graphics,int,int,int,int)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.swing.plaf.synth.SynthCheckBoxUI#paintBorder(javax.swing.plaf.synth.SynthContext, java.awt.Graphics, int, int, int, int)
     * public void
     * javax.swing.plaf.synth.SynthCheckBoxUI.paintBorder(javax.swing.plaf.synth.SynthContext,java.awt.Graphics,int,int,int,int)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.synth.SynthCheckBoxUI#paintBorder(javax.swing.plaf.synth.SynthContext, java.awt.Graphics,
     *      int, int, int, int) public void
     *      javax.swing.plaf.synth.SynthCheckBoxUI.paintBorder(javax.swing.plaf.synth.SynthContext,java.awt.Graphics,int
     *      ,int,int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_paintBorder_SynthContext_Graphics_int_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
