package org.j8unit.repository.javax.swing.text;

import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.Highlight;
import javax.swing.text.Highlighter.HighlightPainter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HighlighterTest
implements org.j8unit.repository.javax.swing.text.HighlighterTests<Highlighter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.Highlighter]

    @Override
    public Highlighter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.Highlighter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.Highlighter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.Highlighter]

    @RunWith(J8Unit4.class)
    public static class HighlightTest
    implements org.j8unit.repository.javax.swing.text.HighlighterTests.HighlightTests<Highlight> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.Highlighter$Highlight]

        @Override
        public Highlight createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.Highlighter.Highlight], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.Highlighter$Highlight]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.Highlighter$Highlight]

    }

    @RunWith(J8Unit4.class)
    public static class HighlightPainterTest
    implements org.j8unit.repository.javax.swing.text.HighlighterTests.HighlightPainterTests<HighlightPainter> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.Highlighter$HighlightPainter]

        @Override
        public HighlightPainter createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.Highlighter.HighlightPainter], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.Highlighter$HighlightPainter]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.Highlighter$HighlightPainter]

    }

}
