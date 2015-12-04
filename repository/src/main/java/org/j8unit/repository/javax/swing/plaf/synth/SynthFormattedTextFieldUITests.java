package org.j8unit.repository.javax.swing.plaf.synth;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.synth.SynthFormattedTextFieldUI class javax.swing.plaf.synth.SynthFormattedTextFieldUI},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.synth.SynthFormattedTextFieldUIClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SynthFormattedTextFieldUITests<SUT extends javax.swing.plaf.synth.SynthFormattedTextFieldUI>
extends org.j8unit.repository.javax.swing.plaf.synth.SynthTextFieldUITests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.synth.SynthFormattedTextFieldUI#paintBorder(javax.swing.plaf.synth.SynthContext,java.awt.Graphics,int,int,int,int) public void javax.swing.plaf.synth.SynthFormattedTextFieldUI.paintBorder(javax.swing.plaf.synth.SynthContext,java.awt.Graphics,int,int,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_paintBorder_SynthContext_Graphics_int_int_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
