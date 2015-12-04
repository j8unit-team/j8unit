package org.j8unit.repository.javax.swing.border;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.border.EmptyBorder class javax.swing.border.EmptyBorder},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.border.EmptyBorderClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface EmptyBorderTests<SUT extends javax.swing.border.EmptyBorder>
extends org.j8unit.repository.java.io.SerializableTests<SUT>,
        org.j8unit.repository.javax.swing.border.AbstractBorderTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.border.EmptyBorder#isBorderOpaque() public boolean javax.swing.border.EmptyBorder.isBorderOpaque()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isBorderOpaque() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.border.EmptyBorder#paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int) public void javax.swing.border.EmptyBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_paintBorder_Component_Graphics_int_int_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.border.EmptyBorder#getBorderInsets() public java.awt.Insets javax.swing.border.EmptyBorder.getBorderInsets()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBorderInsets() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.border.EmptyBorder#getBorderInsets(java.awt.Component,java.awt.Insets) public java.awt.Insets javax.swing.border.EmptyBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getBorderInsets_Component_Insets() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
