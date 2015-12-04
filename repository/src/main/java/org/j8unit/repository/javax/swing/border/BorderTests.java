package org.j8unit.repository.javax.swing.border;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.border.Border interface javax.swing.border.Border}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.border.BorderClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BorderTests<SUT extends javax.swing.border.Border>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.border.Border#getBorderInsets(java.awt.Component) public abstract
     * java.awt.Insets javax.swing.border.Border.getBorderInsets(java.awt.Component)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBorderInsets_Component()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.border.Border#isBorderOpaque() public abstract boolean
     * javax.swing.border.Border.isBorderOpaque()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isBorderOpaque()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.border.Border#paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int) public
     * abstract void javax.swing.border.Border.paintBorder(java.awt.Component,java.awt.Graphics,int,int,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_paintBorder_Component_Graphics_int_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
