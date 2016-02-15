package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.metal.MetalComboBoxIcon class
 * javax.swing.plaf.metal.MetalComboBoxIcon}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link MetalComboBoxIconClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.metal.MetalComboBoxIcon class javax.swing.plaf.metal.MetalComboBoxIcon (the hereby targeted
 *      class-under-test class)
 * @see MetalComboBoxIconClassTests MetalComboBoxIconClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MetalComboBoxIconTests<SUT extends javax.swing.plaf.metal.MetalComboBoxIcon>
extends org.j8unit.repository.javax.swing.IconTests<SUT>, org.j8unit.repository.java.io.SerializableTests<SUT>,
org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.metal.MetalComboBoxIcon#paintIcon(java.awt.Component, java.awt.Graphics, int, int) public
     * void javax.swing.plaf.metal.MetalComboBoxIcon.paintIcon(java.awt.Component,java.awt.Graphics,int,int)}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.plaf.metal.MetalComboBoxIcon#paintIcon(java.awt.Component, java.awt.Graphics, int, int) public
     * void javax.swing.plaf.metal.MetalComboBoxIcon.paintIcon(java.awt.Component,java.awt.Graphics,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalComboBoxIcon#paintIcon(java.awt.Component, java.awt.Graphics, int, int) public
     *      void javax.swing.plaf.metal.MetalComboBoxIcon.paintIcon(java.awt.Component,java.awt.Graphics,int,int) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_paintIcon_Component_Graphics_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalComboBoxIcon#getIconHeight() public int
     * javax.swing.plaf.metal.MetalComboBoxIcon.getIconHeight()}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalComboBoxIcon#getIconHeight() public int
     * javax.swing.plaf.metal.MetalComboBoxIcon.getIconHeight()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalComboBoxIcon#getIconHeight() public int
     *      javax.swing.plaf.metal.MetalComboBoxIcon.getIconHeight() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getIconHeight()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalComboBoxIcon#getIconWidth() public int
     * javax.swing.plaf.metal.MetalComboBoxIcon.getIconWidth()}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.metal.MetalComboBoxIcon#getIconWidth() public int
     * javax.swing.plaf.metal.MetalComboBoxIcon.getIconWidth()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.metal.MetalComboBoxIcon#getIconWidth() public int
     *      javax.swing.plaf.metal.MetalComboBoxIcon.getIconWidth() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getIconWidth()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
