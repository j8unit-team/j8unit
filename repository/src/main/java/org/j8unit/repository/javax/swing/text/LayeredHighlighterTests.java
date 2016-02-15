package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.text.LayeredHighlighter class
 * javax.swing.text.LayeredHighlighter}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link LayeredHighlighterClassTests}.
 * </p>
 *
 * @see javax.swing.text.LayeredHighlighter class javax.swing.text.LayeredHighlighter (the hereby targeted
 *      class-under-test class)
 * @see LayeredHighlighterClassTests LayeredHighlighterClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LayeredHighlighterTests<SUT extends javax.swing.text.LayeredHighlighter>
extends HighlighterTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.text.LayeredHighlighter#paintLayeredHighlights(java.awt.Graphics, int, int, java.awt.Shape, javax.swing.text.JTextComponent, javax.swing.text.View)
     * public abstract void
     * javax.swing.text.LayeredHighlighter.paintLayeredHighlights(java.awt.Graphics,int,int,java.awt.Shape,javax.swing.text.JTextComponent,javax.swing.text.View)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.swing.text.LayeredHighlighter#paintLayeredHighlights(java.awt.Graphics, int, int, java.awt.Shape, javax.swing.text.JTextComponent, javax.swing.text.View)
     * public abstract void
     * javax.swing.text.LayeredHighlighter.paintLayeredHighlights(java.awt.Graphics,int,int,java.awt.Shape,javax.swing.text.JTextComponent,javax.swing.text.View)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.text.LayeredHighlighter#paintLayeredHighlights(java.awt.Graphics, int, int, java.awt.Shape,
     *      javax.swing.text.JTextComponent, javax.swing.text.View) public abstract void
     *      javax.swing.text.LayeredHighlighter.paintLayeredHighlights(java.awt.Graphics,int,int,java.awt.Shape,javax.
     *      swing.text.JTextComponent,javax.swing.text.View) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_paintLayeredHighlights_Graphics_int_int_Shape_JTextComponent_View()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.text.LayeredHighlighter.LayerPainter class
     * javax.swing.text.LayeredHighlighter$LayerPainter}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link LayeredHighlighterClassTests.LayerPainterClassTests}.
     * </p>
     *
     * @see javax.swing.text.LayeredHighlighter.LayerPainter class javax.swing.text.LayeredHighlighter$LayerPainter (the
     *      hereby targeted class-under-test class)
     * @see LayeredHighlighterClassTests.LayerPainterClassTests LayeredHighlighterClassTests.LayerPainterClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface LayerPainterTests<SUT extends javax.swing.text.LayeredHighlighter.LayerPainter>
    extends HighlighterTests.HighlightPainterTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.LayeredHighlighter.LayerPainter#paintLayer(java.awt.Graphics, int, int, java.awt.Shape, javax.swing.text.JTextComponent, javax.swing.text.View)
         * public abstract java.awt.Shape
         * javax.swing.text.LayeredHighlighter$LayerPainter.paintLayer(java.awt.Graphics,int,int,java.awt.Shape,javax.swing.text.JTextComponent,javax.swing.text.View)}
         * .
         *
         * <p>
         * Test method for
         * {@link javax.swing.text.LayeredHighlighter.LayerPainter#paintLayer(java.awt.Graphics, int, int, java.awt.Shape, javax.swing.text.JTextComponent, javax.swing.text.View)
         * public abstract java.awt.Shape
         * javax.swing.text.LayeredHighlighter$LayerPainter.paintLayer(java.awt.Graphics,int,int,java.awt.Shape,javax.swing.text.JTextComponent,javax.swing.text.View)}
         * .
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.text.LayeredHighlighter.LayerPainter#paintLayer(java.awt.Graphics, int, int, java.awt.Shape,
         *      javax.swing.text.JTextComponent, javax.swing.text.View) public abstract java.awt.Shape
         *      javax.swing.text.LayeredHighlighter$LayerPainter.paintLayer(java.awt.Graphics,int,int,java.awt.Shape,
         *      javax.swing.text.JTextComponent,javax.swing.text.View) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_paintLayer_Graphics_int_int_Shape_JTextComponent_View()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
