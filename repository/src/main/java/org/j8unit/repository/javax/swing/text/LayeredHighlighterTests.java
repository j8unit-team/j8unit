package org.j8unit.repository.javax.swing.text;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.text.LayeredHighlighter class javax.swing.text.LayeredHighlighter},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.LayeredHighlighterClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface LayeredHighlighterTests<SUT extends javax.swing.text.LayeredHighlighter>
extends org.j8unit.repository.javax.swing.text.HighlighterTests<SUT>,
        org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.text.LayeredHighlighter#paintLayeredHighlights(java.awt.Graphics,int,int,java.awt.Shape,javax.swing.text.JTextComponent,javax.swing.text.View) public abstract void javax.swing.text.LayeredHighlighter.paintLayeredHighlights(java.awt.Graphics,int,int,java.awt.Shape,javax.swing.text.JTextComponent,javax.swing.text.View)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_paintLayeredHighlights_Graphics_int_int_Shape_JTextComponent_View() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link javax.swing.text.LayeredHighlighter$LayerPainter class javax.swing.text.LayeredHighlighter$LayerPainter},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.LayeredHighlighterClassTests.LayerPainterClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface LayerPainterTests<SUT extends javax.swing.text.LayeredHighlighter.LayerPainter>
    extends org.j8unit.repository.javax.swing.text.HighlighterTests.HighlightPainterTests<SUT>,
            org.j8unit.repository.java.lang.ObjectTests<SUT>
    {

        /**
         * <p>
         * Test method for {@link javax.swing.text.LayeredHighlighter.LayerPainter#paintLayer(java.awt.Graphics,int,int,java.awt.Shape,javax.swing.text.JTextComponent,javax.swing.text.View) public abstract java.awt.Shape javax.swing.text.LayeredHighlighter$LayerPainter.paintLayer(java.awt.Graphics,int,int,java.awt.Shape,javax.swing.text.JTextComponent,javax.swing.text.View)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_paintLayer_Graphics_int_int_Shape_JTextComponent_View() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
