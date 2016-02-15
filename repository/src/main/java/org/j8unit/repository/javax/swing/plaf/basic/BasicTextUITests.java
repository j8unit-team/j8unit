package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicTextUI class
 * javax.swing.plaf.basic.BasicTextUI}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link BasicTextUIClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.basic.BasicTextUI class javax.swing.plaf.basic.BasicTextUI (the hereby targeted
 *      class-under-test class)
 * @see BasicTextUIClassTests BasicTextUIClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicTextUITests<SUT extends javax.swing.plaf.basic.BasicTextUI>
extends org.j8unit.repository.javax.swing.text.ViewFactoryTests<SUT>, org.j8unit.repository.javax.swing.plaf.TextUITests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.basic.BasicTextUI#getNextVisualPositionFrom(javax.swing.text.JTextComponent, int, javax.swing.text.Position.Bias, int, javax.swing.text.Position.Bias[])
     * public int
     * javax.swing.plaf.basic.BasicTextUI.getNextVisualPositionFrom(javax.swing.text.JTextComponent,int,javax.swing.text.Position$Bias,int,javax.swing.text.Position$Bias[])
     * throws javax.swing.text.BadLocationException}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.plaf.basic.BasicTextUI#getNextVisualPositionFrom(javax.swing.text.JTextComponent, int, javax.swing.text.Position.Bias, int, javax.swing.text.Position.Bias[])
     * public int
     * javax.swing.plaf.basic.BasicTextUI.getNextVisualPositionFrom(javax.swing.text.JTextComponent,int,javax.swing.text.Position$Bias,int,javax.swing.text.Position$Bias[])
     * throws javax.swing.text.BadLocationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicTextUI#getNextVisualPositionFrom(javax.swing.text.JTextComponent, int,
     *      javax.swing.text.Position.Bias, int, javax.swing.text.Position.Bias[]) public int
     *      javax.swing.plaf.basic.BasicTextUI.getNextVisualPositionFrom(javax.swing.text.JTextComponent,int,javax.swing
     *      .text.Position$Bias,int,javax.swing.text.Position$Bias[]) throws javax.swing.text.BadLocationException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getNextVisualPositionFrom_JTextComponent_int_Bias_int_BiasArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#create(javax.swing.text.Element, int, int) public
     * javax.swing.text.View javax.swing.plaf.basic.BasicTextUI.create(javax.swing.text.Element,int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#create(javax.swing.text.Element, int, int) public
     * javax.swing.text.View javax.swing.plaf.basic.BasicTextUI.create(javax.swing.text.Element,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicTextUI#create(javax.swing.text.Element, int, int) public javax.swing.text.View
     *      javax.swing.plaf.basic.BasicTextUI.create(javax.swing.text.Element,int,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_Element_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#create(javax.swing.text.Element) public
     * javax.swing.text.View javax.swing.plaf.basic.BasicTextUI.create(javax.swing.text.Element)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#create(javax.swing.text.Element) public
     * javax.swing.text.View javax.swing.plaf.basic.BasicTextUI.create(javax.swing.text.Element)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicTextUI#create(javax.swing.text.Element) public javax.swing.text.View
     *      javax.swing.plaf.basic.BasicTextUI.create(javax.swing.text.Element) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_create_Element()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#uninstallUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicTextUI.uninstallUI(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#uninstallUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicTextUI.uninstallUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicTextUI#uninstallUI(javax.swing.JComponent) public void
     *      javax.swing.plaf.basic.BasicTextUI.uninstallUI(javax.swing.JComponent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for
     * {@link javax.swing.plaf.basic.BasicTextUI#getToolTipText(javax.swing.text.JTextComponent, java.awt.Point) public
     * java.lang.String
     * javax.swing.plaf.basic.BasicTextUI.getToolTipText(javax.swing.text.JTextComponent,java.awt.Point)}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.plaf.basic.BasicTextUI#getToolTipText(javax.swing.text.JTextComponent, java.awt.Point) public
     * java.lang.String
     * javax.swing.plaf.basic.BasicTextUI.getToolTipText(javax.swing.text.JTextComponent,java.awt.Point)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicTextUI#getToolTipText(javax.swing.text.JTextComponent, java.awt.Point) public
     *      java.lang.String
     *      javax.swing.plaf.basic.BasicTextUI.getToolTipText(javax.swing.text.JTextComponent,java.awt.Point) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getToolTipText_JTextComponent_Point()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.basic.BasicTextUI#viewToModel(javax.swing.text.JTextComponent, java.awt.Point, javax.swing.text.Position.Bias[])
     * public int
     * javax.swing.plaf.basic.BasicTextUI.viewToModel(javax.swing.text.JTextComponent,java.awt.Point,javax.swing.text.Position$Bias[])}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.swing.plaf.basic.BasicTextUI#viewToModel(javax.swing.text.JTextComponent, java.awt.Point, javax.swing.text.Position.Bias[])
     * public int
     * javax.swing.plaf.basic.BasicTextUI.viewToModel(javax.swing.text.JTextComponent,java.awt.Point,javax.swing.text.Position$Bias[])}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicTextUI#viewToModel(javax.swing.text.JTextComponent, java.awt.Point,
     *      javax.swing.text.Position.Bias[]) public int
     *      javax.swing.plaf.basic.BasicTextUI.viewToModel(javax.swing.text.JTextComponent,java.awt.Point,javax.swing.
     *      text.Position$Bias[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_viewToModel_JTextComponent_Point_BiasArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.basic.BasicTextUI#viewToModel(javax.swing.text.JTextComponent, java.awt.Point) public int
     * javax.swing.plaf.basic.BasicTextUI.viewToModel(javax.swing.text.JTextComponent,java.awt.Point)}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.plaf.basic.BasicTextUI#viewToModel(javax.swing.text.JTextComponent, java.awt.Point) public int
     * javax.swing.plaf.basic.BasicTextUI.viewToModel(javax.swing.text.JTextComponent,java.awt.Point)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicTextUI#viewToModel(javax.swing.text.JTextComponent, java.awt.Point) public int
     *      javax.swing.plaf.basic.BasicTextUI.viewToModel(javax.swing.text.JTextComponent,java.awt.Point) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_viewToModel_JTextComponent_Point()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#getMinimumSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.basic.BasicTextUI.getMinimumSize(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#getMinimumSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.basic.BasicTextUI.getMinimumSize(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicTextUI#getMinimumSize(javax.swing.JComponent) public java.awt.Dimension
     *      javax.swing.plaf.basic.BasicTextUI.getMinimumSize(javax.swing.JComponent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#getPreferredSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.basic.BasicTextUI.getPreferredSize(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#getPreferredSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.basic.BasicTextUI.getPreferredSize(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicTextUI#getPreferredSize(javax.swing.JComponent) public java.awt.Dimension
     *      javax.swing.plaf.basic.BasicTextUI.getPreferredSize(javax.swing.JComponent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#installUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicTextUI.installUI(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#installUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicTextUI.installUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicTextUI#installUI(javax.swing.JComponent) public void
     *      javax.swing.plaf.basic.BasicTextUI.installUI(javax.swing.JComponent) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#getRootView(javax.swing.text.JTextComponent) public
     * javax.swing.text.View javax.swing.plaf.basic.BasicTextUI.getRootView(javax.swing.text.JTextComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#getRootView(javax.swing.text.JTextComponent) public
     * javax.swing.text.View javax.swing.plaf.basic.BasicTextUI.getRootView(javax.swing.text.JTextComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicTextUI#getRootView(javax.swing.text.JTextComponent) public javax.swing.text.View
     *      javax.swing.plaf.basic.BasicTextUI.getRootView(javax.swing.text.JTextComponent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getRootView_JTextComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#update(java.awt.Graphics, javax.swing.JComponent)
     * public void javax.swing.plaf.basic.BasicTextUI.update(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#update(java.awt.Graphics, javax.swing.JComponent)
     * public void javax.swing.plaf.basic.BasicTextUI.update(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicTextUI#update(java.awt.Graphics, javax.swing.JComponent) public void
     *      javax.swing.plaf.basic.BasicTextUI.update(java.awt.Graphics,javax.swing.JComponent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#paint(java.awt.Graphics, javax.swing.JComponent) public
     * final void javax.swing.plaf.basic.BasicTextUI.paint(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#paint(java.awt.Graphics, javax.swing.JComponent) public
     * final void javax.swing.plaf.basic.BasicTextUI.paint(java.awt.Graphics,javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicTextUI#paint(java.awt.Graphics, javax.swing.JComponent) public final void
     *      javax.swing.plaf.basic.BasicTextUI.paint(java.awt.Graphics,javax.swing.JComponent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#modelToView(javax.swing.text.JTextComponent, int)
     * public java.awt.Rectangle javax.swing.plaf.basic.BasicTextUI.modelToView(javax.swing.text.JTextComponent,int)
     * throws javax.swing.text.BadLocationException}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#modelToView(javax.swing.text.JTextComponent, int)
     * public java.awt.Rectangle javax.swing.plaf.basic.BasicTextUI.modelToView(javax.swing.text.JTextComponent,int)
     * throws javax.swing.text.BadLocationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicTextUI#modelToView(javax.swing.text.JTextComponent, int) public
     *      java.awt.Rectangle javax.swing.plaf.basic.BasicTextUI.modelToView(javax.swing.text.JTextComponent,int)
     *      throws javax.swing.text.BadLocationException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_modelToView_JTextComponent_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.basic.BasicTextUI#modelToView(javax.swing.text.JTextComponent, int, javax.swing.text.Position.Bias)
     * public java.awt.Rectangle
     * javax.swing.plaf.basic.BasicTextUI.modelToView(javax.swing.text.JTextComponent,int,javax.swing.text.Position$Bias)
     * throws javax.swing.text.BadLocationException}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.plaf.basic.BasicTextUI#modelToView(javax.swing.text.JTextComponent, int, javax.swing.text.Position.Bias)
     * public java.awt.Rectangle
     * javax.swing.plaf.basic.BasicTextUI.modelToView(javax.swing.text.JTextComponent,int,javax.swing.text.Position$Bias)
     * throws javax.swing.text.BadLocationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicTextUI#modelToView(javax.swing.text.JTextComponent, int,
     *      javax.swing.text.Position.Bias) public java.awt.Rectangle
     *      javax.swing.plaf.basic.BasicTextUI.modelToView(javax.swing.text.JTextComponent,int,javax.swing.text.
     *      Position$Bias) throws javax.swing.text.BadLocationException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_modelToView_JTextComponent_int_Bias()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#getEditorKit(javax.swing.text.JTextComponent) public
     * javax.swing.text.EditorKit javax.swing.plaf.basic.BasicTextUI.getEditorKit(javax.swing.text.JTextComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#getEditorKit(javax.swing.text.JTextComponent) public
     * javax.swing.text.EditorKit javax.swing.plaf.basic.BasicTextUI.getEditorKit(javax.swing.text.JTextComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicTextUI#getEditorKit(javax.swing.text.JTextComponent) public
     *      javax.swing.text.EditorKit javax.swing.plaf.basic.BasicTextUI.getEditorKit(javax.swing.text.JTextComponent)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getEditorKit_JTextComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#damageRange(javax.swing.text.JTextComponent, int, int)
     * public void javax.swing.plaf.basic.BasicTextUI.damageRange(javax.swing.text.JTextComponent,int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#damageRange(javax.swing.text.JTextComponent, int, int)
     * public void javax.swing.plaf.basic.BasicTextUI.damageRange(javax.swing.text.JTextComponent,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicTextUI#damageRange(javax.swing.text.JTextComponent, int, int) public void
     *      javax.swing.plaf.basic.BasicTextUI.damageRange(javax.swing.text.JTextComponent,int,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_damageRange_JTextComponent_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.basic.BasicTextUI#damageRange(javax.swing.text.JTextComponent, int, int, javax.swing.text.Position.Bias, javax.swing.text.Position.Bias)
     * public void
     * javax.swing.plaf.basic.BasicTextUI.damageRange(javax.swing.text.JTextComponent,int,int,javax.swing.text.Position$Bias,javax.swing.text.Position$Bias)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.swing.plaf.basic.BasicTextUI#damageRange(javax.swing.text.JTextComponent, int, int, javax.swing.text.Position.Bias, javax.swing.text.Position.Bias)
     * public void
     * javax.swing.plaf.basic.BasicTextUI.damageRange(javax.swing.text.JTextComponent,int,int,javax.swing.text.Position$Bias,javax.swing.text.Position$Bias)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicTextUI#damageRange(javax.swing.text.JTextComponent, int, int,
     *      javax.swing.text.Position.Bias, javax.swing.text.Position.Bias) public void
     *      javax.swing.plaf.basic.BasicTextUI.damageRange(javax.swing.text.JTextComponent,int,int,javax.swing.text.
     *      Position$Bias,javax.swing.text.Position$Bias) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_damageRange_JTextComponent_int_int_Bias_Bias()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#getMaximumSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.basic.BasicTextUI.getMaximumSize(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicTextUI#getMaximumSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.basic.BasicTextUI.getMaximumSize(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicTextUI#getMaximumSize(javax.swing.JComponent) public java.awt.Dimension
     *      javax.swing.plaf.basic.BasicTextUI.getMaximumSize(javax.swing.JComponent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicTextUI.BasicHighlighter class
     * javax.swing.plaf.basic.BasicTextUI$BasicHighlighter}. The complementary j8unit test interface containing the
     * class relevant aspects is {@link BasicTextUIClassTests.BasicHighlighterClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicTextUI.BasicHighlighter class
     *      javax.swing.plaf.basic.BasicTextUI$BasicHighlighter (the hereby targeted class-under-test class)
     * @see BasicTextUIClassTests.BasicHighlighterClassTests BasicTextUIClassTests.BasicHighlighterClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BasicHighlighterTests<SUT extends javax.swing.plaf.basic.BasicTextUI.BasicHighlighter>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.text.DefaultHighlighterTests<SUT> {

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicTextUI.BasicCaret class
     * javax.swing.plaf.basic.BasicTextUI$BasicCaret}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link BasicTextUIClassTests.BasicCaretClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicTextUI.BasicCaret class javax.swing.plaf.basic.BasicTextUI$BasicCaret (the
     *      hereby targeted class-under-test class)
     * @see BasicTextUIClassTests.BasicCaretClassTests BasicTextUIClassTests.BasicCaretClassTests (the complementary
     *      j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BasicCaretTests<SUT extends javax.swing.plaf.basic.BasicTextUI.BasicCaret>
    extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.text.DefaultCaretTests<SUT> {

    }

}
