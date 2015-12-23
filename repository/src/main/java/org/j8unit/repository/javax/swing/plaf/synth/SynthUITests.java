package org.j8unit.repository.javax.swing.plaf.synth;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.synth.SynthUI interface
 * javax.swing.plaf.synth.SynthUI}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.synth.SynthUITests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.synth.SynthUIClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.synth.SynthUI
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SynthUITests<SUT extends javax.swing.plaf.synth.SynthUI>
extends org.j8unit.repository.javax.swing.plaf.synth.SynthConstantsTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.synth.SynthUI#getContext(javax.swing.JComponent) public abstract
     * javax.swing.plaf.synth.SynthContext javax.swing.plaf.synth.SynthUI.getContext(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.synth.SynthUI#getContext(javax.swing.JComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getContext_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.synth.SynthUI#paintBorder(javax.swing.plaf.synth.SynthContext, java.awt.Graphics, int, int, int, int)
     * public abstract void
     * javax.swing.plaf.synth.SynthUI.paintBorder(javax.swing.plaf.synth.SynthContext,java.awt.Graphics,int,int,int,int)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.synth.SynthUI#paintBorder(javax.swing.plaf.synth.SynthContext, java.awt.Graphics,
     *             int, int, int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_paintBorder_SynthContext_Graphics_int_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
