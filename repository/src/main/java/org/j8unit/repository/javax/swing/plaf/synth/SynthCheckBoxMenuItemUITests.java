package org.j8unit.repository.javax.swing.plaf.synth;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.synth.SynthCheckBoxMenuItemUI class
 * javax.swing.plaf.synth.SynthCheckBoxMenuItemUI}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.synth.SynthCheckBoxMenuItemUIClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SynthCheckBoxMenuItemUITests<SUT extends javax.swing.plaf.synth.SynthCheckBoxMenuItemUI>
extends org.j8unit.repository.javax.swing.plaf.synth.SynthMenuItemUITests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.synth.SynthCheckBoxMenuItemUI#paintBorder(javax.swing.plaf.synth.SynthContext,java.awt.Graphics,int,int,int,int)
     * public void
     * javax.swing.plaf.synth.SynthCheckBoxMenuItemUI.paintBorder(javax.swing.plaf.synth.SynthContext,java.awt.Graphics,int,int,int,int)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_paintBorder_SynthContext_Graphics_int_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
