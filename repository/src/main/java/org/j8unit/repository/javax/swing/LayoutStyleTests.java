package org.j8unit.repository.javax.swing;

import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.EnumTests;
import org.j8unit.repository.java.lang.ObjectTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link LayoutStyle
 * public abstract class javax.swing.LayoutStyle}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.swing.LayoutStyleClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LayoutStyleTests<SUT extends LayoutStyle>
extends ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.LayoutStyle]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.LayoutStyle#getContainerGap(javax.swing.JComponent, int, java.awt.Container) public abstract
     * int javax.swing.LayoutStyle.getContainerGap(javax.swing.JComponent,int,java.awt.Container)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.LayoutStyle#getPreferredGap(javax.swing.JComponent, javax.swing.JComponent, javax.swing.LayoutStyle.ComponentPlacement, int, java.awt.Container)
     * public abstract int
     * javax.swing.LayoutStyle.getPreferredGap(javax.swing.JComponent,javax.swing.JComponent,javax.swing.LayoutStyle$ComponentPlacement,int,java.awt.Container)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.LayoutStyle]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.LayoutStyle]

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link ComponentPlacement public static final enum javax.swing.LayoutStyle$ComponentPlacement}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.swing.LayoutStyleClassTests.ComponentPlacementClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ComponentPlacementTests<SUT extends ComponentPlacement>
    extends EnumTests<SUT, ComponentPlacement> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.LayoutStyle$ComponentPlacement]

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.LayoutStyle$ComponentPlacement]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.LayoutStyle$ComponentPlacement]

    }

}
