package org.j8unit.repository.javax.swing.text;

import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.Highlight;
import javax.swing.text.Highlighter.HighlightPainter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Highlighter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.HighlighterTests}).
 */
@RunWith(J8Unit4.class)
public class HighlighterTest
implements HighlighterTests<Highlighter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.Highlighter]

    @Override
    public Highlighter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.Highlighter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.Highlighter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.Highlighter]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link HighlightPainter} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.HighlighterTests.HighlightPainterTests}).
     */
    @RunWith(J8Unit4.class)
    public static class HighlightPainterTest
    implements HighlightPainterTests<HighlightPainter> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.Highlighter$HighlightPainter]

        @Override
        public HighlightPainter createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.Highlighter.HighlightPainter], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.Highlighter$HighlightPainter]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.Highlighter$HighlightPainter]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Highlight} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.HighlighterTests.HighlightTests}).
     */
    @RunWith(J8Unit4.class)
    public static class HighlightTest
    implements HighlightTests<Highlight> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.Highlighter$Highlight]

        @Override
        public Highlight createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.Highlighter.Highlight], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.Highlighter$Highlight]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.Highlighter$Highlight]

    }

}
