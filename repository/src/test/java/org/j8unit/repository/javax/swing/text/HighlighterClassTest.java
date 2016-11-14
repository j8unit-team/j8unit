package org.j8unit.repository.javax.swing.text;

import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.Highlight;
import javax.swing.text.Highlighter.HighlightPainter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Highlighter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.HighlighterClassTests}).
 */

@RunWith(J8Unit4.class)
public class HighlighterClassTest
implements HighlighterClassTests<Highlighter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.Highlighter]

    @Override
    public Class<Highlighter> createNewSUT() {
        return Highlighter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.Highlighter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.Highlighter]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link HighlightPainter} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.HighlighterClassTests.HighlightPainterClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class HighlightPainterClassTest
    implements HighlightPainterClassTests<HighlightPainter> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.Highlighter$HighlightPainter]

        @Override
        public Class<HighlightPainter> createNewSUT() {
            return HighlightPainter.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.Highlighter$HighlightPainter]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.Highlighter$HighlightPainter]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Highlight} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.HighlighterClassTests.HighlightClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class HighlightClassTest
    implements HighlightClassTests<Highlight> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.Highlighter$Highlight]

        @Override
        public Class<Highlight> createNewSUT() {
            return Highlight.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.Highlighter$Highlight]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.Highlighter$Highlight]

    }

}
