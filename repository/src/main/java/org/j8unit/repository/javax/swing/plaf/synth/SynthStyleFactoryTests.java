package org.j8unit.repository.javax.swing.plaf.synth;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.synth.SynthStyleFactory class javax.swing.plaf.synth.SynthStyleFactory},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.synth.SynthStyleFactoryClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SynthStyleFactoryTests<SUT extends javax.swing.plaf.synth.SynthStyleFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.synth.SynthStyleFactory#getStyle(javax.swing.JComponent,javax.swing.plaf.synth.Region)
     * public abstract javax.swing.plaf.synth.SynthStyle
     * javax.swing.plaf.synth.SynthStyleFactory.getStyle(javax.swing.JComponent,javax.swing.plaf.synth.Region)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStyle_JComponent_Region()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
