package org.j8unit.repository.javax.swing;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.LayoutStyle class javax.swing.LayoutStyle},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.LayoutStyleClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface LayoutStyleTests<SUT extends javax.swing.LayoutStyle>
extends org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.LayoutStyle#getContainerGap(javax.swing.JComponent,int,java.awt.Container) public abstract int javax.swing.LayoutStyle.getContainerGap(javax.swing.JComponent,int,java.awt.Container)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getContainerGap_JComponent_int_Container() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.LayoutStyle#getPreferredGap(javax.swing.JComponent,javax.swing.JComponent,javax.swing.LayoutStyle.ComponentPlacement,int,java.awt.Container) public abstract int javax.swing.LayoutStyle.getPreferredGap(javax.swing.JComponent,javax.swing.JComponent,javax.swing.LayoutStyle$ComponentPlacement,int,java.awt.Container)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPreferredGap_JComponent_JComponent_ComponentPlacement_int_Container() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link javax.swing.LayoutStyle$ComponentPlacement class javax.swing.LayoutStyle$ComponentPlacement},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.LayoutStyleClassTests.ComponentPlacementClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ComponentPlacementTests<SUT extends javax.swing.LayoutStyle.ComponentPlacement>
    extends org.j8unit.repository.java.lang.EnumTests<SUT,javax.swing.LayoutStyle.ComponentPlacement>
    {

    }

}
