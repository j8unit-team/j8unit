package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HighlighterClassTest
implements org.j8unit.repository.javax.swing.text.HighlighterClassTests<javax.swing.text.Highlighter> {

    @Override
    public Class<javax.swing.text.Highlighter> createNewSUT() {
        return javax.swing.text.Highlighter.class;
    }

    @RunWith(J8Unit4.class)
    public static class HighlightPainterClassTest
    implements org.j8unit.repository.javax.swing.text.HighlighterClassTests.HighlightPainterClassTests<javax.swing.text.Highlighter.HighlightPainter> {

        @Override
        public Class<javax.swing.text.Highlighter.HighlightPainter> createNewSUT() {
            return javax.swing.text.Highlighter.HighlightPainter.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class HighlightClassTest
    implements org.j8unit.repository.javax.swing.text.HighlighterClassTests.HighlightClassTests<javax.swing.text.Highlighter.Highlight> {

        @Override
        public Class<javax.swing.text.Highlighter.Highlight> createNewSUT() {
            return javax.swing.text.Highlighter.Highlight.class;
        }

    }

}
