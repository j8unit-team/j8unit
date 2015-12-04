package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.DefaultHighlighter class javax.swing.text.DefaultHighlighter}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.DefaultHighlighterClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DefaultHighlighterTests<SUT extends javax.swing.text.DefaultHighlighter>
extends org.j8unit.repository.javax.swing.text.LayeredHighlighterTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.text.DefaultHighlighter$DefaultHighlightPainter class
     * javax.swing.text.DefaultHighlighter$DefaultHighlightPainter}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.DefaultHighlighterClassTests.DefaultHighlightPainterClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DefaultHighlightPainterTests<SUT extends javax.swing.text.DefaultHighlighter.DefaultHighlightPainter>
    extends org.j8unit.repository.javax.swing.text.LayeredHighlighterTests.LayerPainterTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.swing.text.DefaultHighlighter.DefaultHighlightPainter#getColor() public
         * java.awt.Color javax.swing.text.DefaultHighlighter$DefaultHighlightPainter.getColor()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getColor()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.DefaultHighlighter.DefaultHighlightPainter#paint(java.awt.Graphics,int,int,java.awt.Shape,javax.swing.text.JTextComponent)
         * public void
         * javax.swing.text.DefaultHighlighter$DefaultHighlightPainter.paint(java.awt.Graphics,int,int,java.awt.Shape,javax.swing.text.JTextComponent)}
         * .
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paint_Graphics_int_int_Shape_JTextComponent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.DefaultHighlighter.DefaultHighlightPainter#paintLayer(java.awt.Graphics,int,int,java.awt.Shape,javax.swing.text.JTextComponent,javax.swing.text.View)
         * public java.awt.Shape
         * javax.swing.text.DefaultHighlighter$DefaultHighlightPainter.paintLayer(java.awt.Graphics,int,int,java.awt.Shape,javax.swing.text.JTextComponent,javax.swing.text.View)}
         * .
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_paintLayer_Graphics_int_int_Shape_JTextComponent_View()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.DefaultHighlighter#addHighlight(int,int,javax.swing.text.Highlighter.HighlightPainter)
     * public java.lang.Object
     * javax.swing.text.DefaultHighlighter.addHighlight(int,int,javax.swing.text.Highlighter$HighlightPainter) throws
     * javax.swing.text.BadLocationException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_addHighlight_int_int_HighlightPainter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.DefaultHighlighter#changeHighlight(java.lang.Object,int,int) public void
     * javax.swing.text.DefaultHighlighter.changeHighlight(java.lang.Object,int,int) throws
     * javax.swing.text.BadLocationException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_changeHighlight_Object_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.DefaultHighlighter#deinstall(javax.swing.text.JTextComponent) public void
     * javax.swing.text.DefaultHighlighter.deinstall(javax.swing.text.JTextComponent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_deinstall_JTextComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.DefaultHighlighter#getDrawsLayeredHighlights() public boolean
     * javax.swing.text.DefaultHighlighter.getDrawsLayeredHighlights()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDrawsLayeredHighlights()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.DefaultHighlighter#getHighlights() public
     * javax.swing.text.Highlighter$Highlight[] javax.swing.text.DefaultHighlighter.getHighlights()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getHighlights()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.DefaultHighlighter#install(javax.swing.text.JTextComponent) public void
     * javax.swing.text.DefaultHighlighter.install(javax.swing.text.JTextComponent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_install_JTextComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.DefaultHighlighter#paint(java.awt.Graphics) public void
     * javax.swing.text.DefaultHighlighter.paint(java.awt.Graphics)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_paint_Graphics()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.DefaultHighlighter#paintLayeredHighlights(java.awt.Graphics,int,int,java.awt.Shape,javax.swing.text.JTextComponent,javax.swing.text.View)
     * public void
     * javax.swing.text.DefaultHighlighter.paintLayeredHighlights(java.awt.Graphics,int,int,java.awt.Shape,javax.swing.text.JTextComponent,javax.swing.text.View)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_paintLayeredHighlights_Graphics_int_int_Shape_JTextComponent_View()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.DefaultHighlighter#removeAllHighlights() public void
     * javax.swing.text.DefaultHighlighter.removeAllHighlights()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_removeAllHighlights()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.DefaultHighlighter#removeHighlight(java.lang.Object) public void
     * javax.swing.text.DefaultHighlighter.removeHighlight(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_removeHighlight_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.DefaultHighlighter#setDrawsLayeredHighlights(boolean) public void
     * javax.swing.text.DefaultHighlighter.setDrawsLayeredHighlights(boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setDrawsLayeredHighlights_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
