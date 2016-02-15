package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.ComponentUI class javax.swing.plaf.ComponentUI}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ComponentUIClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.ComponentUI class javax.swing.plaf.ComponentUI (the hereby targeted class-under-test class)
 * @see ComponentUIClassTests ComponentUIClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ComponentUITests<SUT extends javax.swing.plaf.ComponentUI>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#contains(javax.swing.JComponent, int, int) public boolean
     * javax.swing.plaf.ComponentUI.contains(javax.swing.JComponent,int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#contains(javax.swing.JComponent, int, int) public boolean
     * javax.swing.plaf.ComponentUI.contains(javax.swing.JComponent,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.ComponentUI#contains(javax.swing.JComponent, int, int) public boolean
     *      javax.swing.plaf.ComponentUI.contains(javax.swing.JComponent,int,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_contains_JComponent_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#getBaseline(javax.swing.JComponent, int, int) public int
     * javax.swing.plaf.ComponentUI.getBaseline(javax.swing.JComponent,int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#getBaseline(javax.swing.JComponent, int, int) public int
     * javax.swing.plaf.ComponentUI.getBaseline(javax.swing.JComponent,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.ComponentUI#getBaseline(javax.swing.JComponent, int, int) public int
     *      javax.swing.plaf.ComponentUI.getBaseline(javax.swing.JComponent,int,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBaseline_JComponent_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#getMinimumSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.ComponentUI.getMinimumSize(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#getMinimumSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.ComponentUI.getMinimumSize(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.ComponentUI#getMinimumSize(javax.swing.JComponent) public java.awt.Dimension
     *      javax.swing.plaf.ComponentUI.getMinimumSize(javax.swing.JComponent) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMinimumSize_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#getBaselineResizeBehavior(javax.swing.JComponent) public
     * java.awt.Component$BaselineResizeBehavior
     * javax.swing.plaf.ComponentUI.getBaselineResizeBehavior(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#getBaselineResizeBehavior(javax.swing.JComponent) public
     * java.awt.Component$BaselineResizeBehavior
     * javax.swing.plaf.ComponentUI.getBaselineResizeBehavior(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.ComponentUI#getBaselineResizeBehavior(javax.swing.JComponent) public
     *      java.awt.Component$BaselineResizeBehavior
     *      javax.swing.plaf.ComponentUI.getBaselineResizeBehavior(javax.swing.JComponent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBaselineResizeBehavior_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#getAccessibleChild(javax.swing.JComponent, int) public
     * javax.accessibility.Accessible javax.swing.plaf.ComponentUI.getAccessibleChild(javax.swing.JComponent,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#getAccessibleChild(javax.swing.JComponent, int) public
     * javax.accessibility.Accessible javax.swing.plaf.ComponentUI.getAccessibleChild(javax.swing.JComponent,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.ComponentUI#getAccessibleChild(javax.swing.JComponent, int) public
     *      javax.accessibility.Accessible javax.swing.plaf.ComponentUI.getAccessibleChild(javax.swing.JComponent,int)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAccessibleChild_JComponent_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#getPreferredSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.ComponentUI.getPreferredSize(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#getPreferredSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.ComponentUI.getPreferredSize(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.ComponentUI#getPreferredSize(javax.swing.JComponent) public java.awt.Dimension
     *      javax.swing.plaf.ComponentUI.getPreferredSize(javax.swing.JComponent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPreferredSize_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#installUI(javax.swing.JComponent) public void
     * javax.swing.plaf.ComponentUI.installUI(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#installUI(javax.swing.JComponent) public void
     * javax.swing.plaf.ComponentUI.installUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.ComponentUI#installUI(javax.swing.JComponent) public void
     *      javax.swing.plaf.ComponentUI.installUI(javax.swing.JComponent) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_installUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#getMaximumSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.ComponentUI.getMaximumSize(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#getMaximumSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.ComponentUI.getMaximumSize(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.ComponentUI#getMaximumSize(javax.swing.JComponent) public java.awt.Dimension
     *      javax.swing.plaf.ComponentUI.getMaximumSize(javax.swing.JComponent) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMaximumSize_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#update(java.awt.Graphics, javax.swing.JComponent) public void
     * javax.swing.plaf.ComponentUI.update(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#update(java.awt.Graphics, javax.swing.JComponent) public void
     * javax.swing.plaf.ComponentUI.update(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.ComponentUI#update(java.awt.Graphics, javax.swing.JComponent) public void
     *      javax.swing.plaf.ComponentUI.update(java.awt.Graphics,javax.swing.JComponent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_update_Graphics_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#uninstallUI(javax.swing.JComponent) public void
     * javax.swing.plaf.ComponentUI.uninstallUI(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#uninstallUI(javax.swing.JComponent) public void
     * javax.swing.plaf.ComponentUI.uninstallUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.ComponentUI#uninstallUI(javax.swing.JComponent) public void
     *      javax.swing.plaf.ComponentUI.uninstallUI(javax.swing.JComponent) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_uninstallUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#paint(java.awt.Graphics, javax.swing.JComponent) public void
     * javax.swing.plaf.ComponentUI.paint(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#paint(java.awt.Graphics, javax.swing.JComponent) public void
     * javax.swing.plaf.ComponentUI.paint(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.ComponentUI#paint(java.awt.Graphics, javax.swing.JComponent) public void
     *      javax.swing.plaf.ComponentUI.paint(java.awt.Graphics,javax.swing.JComponent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_paint_Graphics_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#getAccessibleChildrenCount(javax.swing.JComponent) public int
     * javax.swing.plaf.ComponentUI.getAccessibleChildrenCount(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.ComponentUI#getAccessibleChildrenCount(javax.swing.JComponent) public int
     * javax.swing.plaf.ComponentUI.getAccessibleChildrenCount(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.ComponentUI#getAccessibleChildrenCount(javax.swing.JComponent) public int
     *      javax.swing.plaf.ComponentUI.getAccessibleChildrenCount(javax.swing.JComponent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAccessibleChildrenCount_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
