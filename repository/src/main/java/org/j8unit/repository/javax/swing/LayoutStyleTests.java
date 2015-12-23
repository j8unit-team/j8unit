package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.LayoutStyle class javax.swing.LayoutStyle}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.LayoutStyleTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.LayoutStyleClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.LayoutStyle
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LayoutStyleTests<SUT extends javax.swing.LayoutStyle>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.LayoutStyle.ComponentPlacement class
     * javax.swing.LayoutStyle$ComponentPlacement}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.javax.swing.LayoutStyleTests.ComponentPlacementTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.LayoutStyleClassTests.ComponentPlacementClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.LayoutStyle.ComponentPlacement
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ComponentPlacementTests<SUT extends javax.swing.LayoutStyle.ComponentPlacement>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.swing.LayoutStyle.ComponentPlacement> {

    }

    /**
     * <p>
     * Test method for {@link javax.swing.LayoutStyle#getContainerGap(javax.swing.JComponent, int, java.awt.Container)
     * public abstract int javax.swing.LayoutStyle.getContainerGap(javax.swing.JComponent,int,java.awt.Container)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.LayoutStyle#getContainerGap(javax.swing.JComponent, int, java.awt.Container)
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.LayoutStyle#getPreferredGap(javax.swing.JComponent, javax.swing.JComponent,
     *             javax.swing.LayoutStyle.ComponentPlacement, int, java.awt.Container)
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

}
