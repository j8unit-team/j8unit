package org.j8unit.repository.javax.swing.plaf.synth;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.synth.SynthStyleFactory class
 * javax.swing.plaf.synth.SynthStyleFactory}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link SynthStyleFactoryClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.synth.SynthStyleFactory class javax.swing.plaf.synth.SynthStyleFactory (the hereby targeted
 *      class-under-test class)
 * @see SynthStyleFactoryClassTests SynthStyleFactoryClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SynthStyleFactoryTests<SUT extends javax.swing.plaf.synth.SynthStyleFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.synth.SynthStyleFactory#getStyle(javax.swing.JComponent, javax.swing.plaf.synth.Region)
     * public abstract javax.swing.plaf.synth.SynthStyle
     * javax.swing.plaf.synth.SynthStyleFactory.getStyle(javax.swing.JComponent,javax.swing.plaf.synth.Region)}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.plaf.synth.SynthStyleFactory#getStyle(javax.swing.JComponent, javax.swing.plaf.synth.Region)
     * public abstract javax.swing.plaf.synth.SynthStyle
     * javax.swing.plaf.synth.SynthStyleFactory.getStyle(javax.swing.JComponent,javax.swing.plaf.synth.Region)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.synth.SynthStyleFactory#getStyle(javax.swing.JComponent, javax.swing.plaf.synth.Region)
     *      public abstract javax.swing.plaf.synth.SynthStyle
     *      javax.swing.plaf.synth.SynthStyleFactory.getStyle(javax.swing.JComponent,javax.swing.plaf.synth.Region) (the
     *      hereby targeted method-under-test)
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
