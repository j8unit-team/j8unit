package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.text.html.ListView class javax.swing.text.html.ListView}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ListViewClassTests}.
 * </p>
 *
 * @see javax.swing.text.html.ListView class javax.swing.text.html.ListView (the hereby targeted class-under-test class)
 * @see ListViewClassTests ListViewClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ListViewTests<SUT extends javax.swing.text.html.ListView>
extends BlockViewTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.ListView#getAlignment(int) public float
     * javax.swing.text.html.ListView.getAlignment(int)}.
     *
     * <p>
     * Test method for {@link javax.swing.text.html.ListView#getAlignment(int) public float
     * javax.swing.text.html.ListView.getAlignment(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.text.html.ListView#getAlignment(int) public float
     *      javax.swing.text.html.ListView.getAlignment(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAlignment_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.ListView#paint(java.awt.Graphics, java.awt.Shape) public void
     * javax.swing.text.html.ListView.paint(java.awt.Graphics,java.awt.Shape)}.
     *
     * <p>
     * Test method for {@link javax.swing.text.html.ListView#paint(java.awt.Graphics, java.awt.Shape) public void
     * javax.swing.text.html.ListView.paint(java.awt.Graphics,java.awt.Shape)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.text.html.ListView#paint(java.awt.Graphics, java.awt.Shape) public void
     *      javax.swing.text.html.ListView.paint(java.awt.Graphics,java.awt.Shape) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_paint_Graphics_Shape()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
