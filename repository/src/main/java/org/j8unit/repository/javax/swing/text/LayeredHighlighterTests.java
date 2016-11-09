package org.j8unit.repository.javax.swing.text;

import javax.swing.text.LayeredHighlighter;
import javax.swing.text.LayeredHighlighter.LayerPainter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.ObjectTests;
import org.j8unit.repository.javax.swing.text.LayeredHighlighterClassTests.LayerPainterClassTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link LayeredHighlighter public abstract class javax.swing.text.LayeredHighlighter}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link LayeredHighlighterClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LayeredHighlighterTests<SUT extends LayeredHighlighter>
extends HighlighterTests<SUT>, ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.LayeredHighlighter]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.LayeredHighlighter#paintLayeredHighlights(java.awt.Graphics, int, int, java.awt.Shape, javax.swing.text.JTextComponent, javax.swing.text.View)
     * public abstract void
     * javax.swing.text.LayeredHighlighter.paintLayeredHighlights(java.awt.Graphics,int,int,java.awt.Shape,javax.swing.text.JTextComponent,javax.swing.text.View)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.LayeredHighlighter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.LayeredHighlighter]
    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link LayerPainter public abstract static class javax.swing.text.LayeredHighlighter$LayerPainter}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link LayerPainterClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface LayerPainterTests<SUT extends LayerPainter>
    extends HighlightPainterTests<SUT>, ObjectTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.LayeredHighlighter$LayerPainter]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.LayeredHighlighter.LayerPainter#paintLayer(java.awt.Graphics, int, int, java.awt.Shape, javax.swing.text.JTextComponent, javax.swing.text.View)
         * public abstract java.awt.Shape
         * javax.swing.text.LayeredHighlighter$LayerPainter.paintLayer(java.awt.Graphics,int,int,java.awt.Shape,javax.swing.text.JTextComponent,javax.swing.text.View)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.LayeredHighlighter$LayerPainter]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.LayeredHighlighter$LayerPainter]
    }

}
