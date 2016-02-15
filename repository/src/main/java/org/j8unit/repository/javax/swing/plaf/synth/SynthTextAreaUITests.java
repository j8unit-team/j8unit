package org.j8unit.repository.javax.swing.plaf.synth;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.synth.SynthTextAreaUI class
 * javax.swing.plaf.synth.SynthTextAreaUI}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link SynthTextAreaUIClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.synth.SynthTextAreaUI class javax.swing.plaf.synth.SynthTextAreaUI (the hereby targeted
 *      class-under-test class)
 * @see SynthTextAreaUIClassTests SynthTextAreaUIClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SynthTextAreaUITests<SUT extends javax.swing.plaf.synth.SynthTextAreaUI>
extends SynthUITests<SUT>, org.j8unit.repository.javax.swing.plaf.basic.BasicTextAreaUITests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.synth.SynthTextAreaUI#paintBorder(javax.swing.plaf.synth.SynthContext, java.awt.Graphics, int, int, int, int)
     * public void
     * javax.swing.plaf.synth.SynthTextAreaUI.paintBorder(javax.swing.plaf.synth.SynthContext,java.awt.Graphics,int,int,int,int)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.swing.plaf.synth.SynthTextAreaUI#paintBorder(javax.swing.plaf.synth.SynthContext, java.awt.Graphics, int, int, int, int)
     * public void
     * javax.swing.plaf.synth.SynthTextAreaUI.paintBorder(javax.swing.plaf.synth.SynthContext,java.awt.Graphics,int,int,int,int)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.synth.SynthTextAreaUI#paintBorder(javax.swing.plaf.synth.SynthContext, java.awt.Graphics,
     *      int, int, int, int) public void
     *      javax.swing.plaf.synth.SynthTextAreaUI.paintBorder(javax.swing.plaf.synth.SynthContext,java.awt.Graphics,int
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

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.synth.SynthTextAreaUI#getContext(javax.swing.JComponent) public
     * javax.swing.plaf.synth.SynthContext javax.swing.plaf.synth.SynthTextAreaUI.getContext(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.synth.SynthTextAreaUI#getContext(javax.swing.JComponent) public
     * javax.swing.plaf.synth.SynthContext javax.swing.plaf.synth.SynthTextAreaUI.getContext(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.synth.SynthTextAreaUI#getContext(javax.swing.JComponent) public
     *      javax.swing.plaf.synth.SynthContext
     *      javax.swing.plaf.synth.SynthTextAreaUI.getContext(javax.swing.JComponent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link javax.swing.plaf.synth.SynthTextAreaUI#update(java.awt.Graphics, javax.swing.JComponent)
     * public void javax.swing.plaf.synth.SynthTextAreaUI.update(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.synth.SynthTextAreaUI#update(java.awt.Graphics, javax.swing.JComponent)
     * public void javax.swing.plaf.synth.SynthTextAreaUI.update(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.synth.SynthTextAreaUI#update(java.awt.Graphics, javax.swing.JComponent) public void
     *      javax.swing.plaf.synth.SynthTextAreaUI.update(java.awt.Graphics,javax.swing.JComponent) (the hereby targeted
     *      method-under-test)
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

}
