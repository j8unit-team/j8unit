package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.LayoutStyle class javax.swing.LayoutStyle}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link LayoutStyleClassTests}.
 * </p>
 *
 * @see javax.swing.LayoutStyle class javax.swing.LayoutStyle (the hereby targeted class-under-test class)
 * @see LayoutStyleClassTests LayoutStyleClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LayoutStyleTests<SUT extends javax.swing.LayoutStyle>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.LayoutStyle#getContainerGap(javax.swing.JComponent, int, java.awt.Container)
     * public abstract int javax.swing.LayoutStyle.getContainerGap(javax.swing.JComponent,int,java.awt.Container)}.
     *
     * <p>
     * Test method for {@link javax.swing.LayoutStyle#getContainerGap(javax.swing.JComponent, int, java.awt.Container)
     * public abstract int javax.swing.LayoutStyle.getContainerGap(javax.swing.JComponent,int,java.awt.Container)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.LayoutStyle#getContainerGap(javax.swing.JComponent, int, java.awt.Container) public abstract int
     *      javax.swing.LayoutStyle.getContainerGap(javax.swing.JComponent,int,java.awt.Container) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getContainerGap_JComponent_int_Container()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.LayoutStyle#getPreferredGap(javax.swing.JComponent, javax.swing.JComponent, javax.swing.LayoutStyle.ComponentPlacement, int, java.awt.Container)
     * public abstract int
     * javax.swing.LayoutStyle.getPreferredGap(javax.swing.JComponent,javax.swing.JComponent,javax.swing.LayoutStyle$ComponentPlacement,int,java.awt.Container)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.swing.LayoutStyle#getPreferredGap(javax.swing.JComponent, javax.swing.JComponent, javax.swing.LayoutStyle.ComponentPlacement, int, java.awt.Container)
     * public abstract int
     * javax.swing.LayoutStyle.getPreferredGap(javax.swing.JComponent,javax.swing.JComponent,javax.swing.LayoutStyle$ComponentPlacement,int,java.awt.Container)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.LayoutStyle#getPreferredGap(javax.swing.JComponent, javax.swing.JComponent,
     *      javax.swing.LayoutStyle.ComponentPlacement, int, java.awt.Container) public abstract int
     *      javax.swing.LayoutStyle.getPreferredGap(javax.swing.JComponent,javax.swing.JComponent,javax.swing.
     *      LayoutStyle$ComponentPlacement,int,java.awt.Container) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPreferredGap_JComponent_JComponent_ComponentPlacement_int_Container()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.LayoutStyle.ComponentPlacement class
     * javax.swing.LayoutStyle$ComponentPlacement}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link LayoutStyleClassTests.ComponentPlacementClassTests}.
     * </p>
     *
     * @see javax.swing.LayoutStyle.ComponentPlacement class javax.swing.LayoutStyle$ComponentPlacement (the hereby
     *      targeted class-under-test class)
     * @see LayoutStyleClassTests.ComponentPlacementClassTests LayoutStyleClassTests.ComponentPlacementClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ComponentPlacementTests<SUT extends javax.swing.LayoutStyle.ComponentPlacement>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.swing.LayoutStyle.ComponentPlacement> {

    }

}
