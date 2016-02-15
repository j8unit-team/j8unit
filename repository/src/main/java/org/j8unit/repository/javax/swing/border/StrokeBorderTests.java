package org.j8unit.repository.javax.swing.border;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.border.StrokeBorder class javax.swing.border.StrokeBorder}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link StrokeBorderClassTests}.
 * </p>
 *
 * @see javax.swing.border.StrokeBorder class javax.swing.border.StrokeBorder (the hereby targeted class-under-test
 *      class)
 * @see StrokeBorderClassTests StrokeBorderClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StrokeBorderTests<SUT extends javax.swing.border.StrokeBorder>
extends AbstractBorderTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.border.StrokeBorder#getPaint() public java.awt.Paint
     * javax.swing.border.StrokeBorder.getPaint()}.
     *
     * <p>
     * Test method for {@link javax.swing.border.StrokeBorder#getPaint() public java.awt.Paint
     * javax.swing.border.StrokeBorder.getPaint()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.border.StrokeBorder#getPaint() public java.awt.Paint javax.swing.border.StrokeBorder.getPaint()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPaint()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.border.StrokeBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
     * public void javax.swing.border.StrokeBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.border.StrokeBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
     * public void javax.swing.border.StrokeBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.border.StrokeBorder#paintBorder(java.awt.Component, java.awt.Graphics, int, int, int, int)
     *      public void
     *      javax.swing.border.StrokeBorder.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_paintBorder_Component_Graphics_int_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.border.StrokeBorder#getStroke() public java.awt.BasicStroke
     * javax.swing.border.StrokeBorder.getStroke()}.
     *
     * <p>
     * Test method for {@link javax.swing.border.StrokeBorder#getStroke() public java.awt.BasicStroke
     * javax.swing.border.StrokeBorder.getStroke()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.border.StrokeBorder#getStroke() public java.awt.BasicStroke
     *      javax.swing.border.StrokeBorder.getStroke() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStroke()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.border.StrokeBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
     * public java.awt.Insets javax.swing.border.StrokeBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
     *
     * <p>
     * Test method for {@link javax.swing.border.StrokeBorder#getBorderInsets(java.awt.Component, java.awt.Insets)
     * public java.awt.Insets javax.swing.border.StrokeBorder.getBorderInsets(java.awt.Component,java.awt.Insets)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.border.StrokeBorder#getBorderInsets(java.awt.Component, java.awt.Insets) public java.awt.Insets
     *      javax.swing.border.StrokeBorder.getBorderInsets(java.awt.Component,java.awt.Insets) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getBorderInsets_Component_Insets()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
