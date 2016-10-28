package org.j8unit.repository.javax.swing.text;

import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.Highlight;
import javax.swing.text.Highlighter.HighlightPainter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HighlighterClassTest
implements org.j8unit.repository.javax.swing.text.HighlighterClassTests<Highlighter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.Highlighter]

    @Override
    public Class<Highlighter> createNewSUT() {
        return Highlighter.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.Highlighter]

    @RunWith(J8Unit4.class)
    public static class HighlightClassTest
    implements org.j8unit.repository.javax.swing.text.HighlighterClassTests.HighlightClassTests<Highlight> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.Highlighter$Highlight]

        @Override
        public Class<Highlight> createNewSUT() {
            return Highlight.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.Highlighter$Highlight]

    }

    @RunWith(J8Unit4.class)
    public static class HighlightPainterClassTest
    implements org.j8unit.repository.javax.swing.text.HighlighterClassTests.HighlightPainterClassTests<HighlightPainter> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.Highlighter$HighlightPainter]

        @Override
        public Class<HighlightPainter> createNewSUT() {
            return HighlightPainter.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.Highlighter$HighlightPainter]

    }

}
