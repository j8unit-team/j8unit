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
 * Test class for {@link javax.swing.plaf.synth.SynthStyleFactory class javax.swing.plaf.synth.SynthStyleFactory},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.synth.SynthStyleFactoryClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SynthStyleFactoryTests<SUT extends javax.swing.plaf.synth.SynthStyleFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.synth.SynthStyleFactory#getStyle(javax.swing.JComponent,javax.swing.plaf.synth.Region) public abstract javax.swing.plaf.synth.SynthStyle javax.swing.plaf.synth.SynthStyleFactory.getStyle(javax.swing.JComponent,javax.swing.plaf.synth.Region)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStyle_JComponent_Region() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
