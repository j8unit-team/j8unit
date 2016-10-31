package org.j8unit.repository.javax.swing.text;

import javax.swing.text.LayeredHighlighter;
import javax.swing.text.LayeredHighlighter.LayerPainter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LayeredHighlighterTest
implements org.j8unit.repository.javax.swing.text.LayeredHighlighterTests<LayeredHighlighter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.LayeredHighlighter]

    @Override
    public LayeredHighlighter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.LayeredHighlighter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.LayeredHighlighter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.LayeredHighlighter]

    @RunWith(J8Unit4.class)
    public static class LayerPainterTest
    implements org.j8unit.repository.javax.swing.text.LayeredHighlighterTests.LayerPainterTests<LayerPainter> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.LayeredHighlighter$LayerPainter]

        @Override
        public LayerPainter createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.LayeredHighlighter.LayerPainter], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.LayeredHighlighter$LayerPainter]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.LayeredHighlighter$LayerPainter]

    }

}
