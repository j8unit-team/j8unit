package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultHighlighterClassTest
implements org.j8unit.repository.javax.swing.text.DefaultHighlighterClassTests<javax.swing.text.DefaultHighlighter> {

    @RunWith(J8Unit4.class)
    public static class DefaultHighlightPainterClassTest
    implements
    org.j8unit.repository.javax.swing.text.DefaultHighlighterClassTests.DefaultHighlightPainterClassTests<javax.swing.text.DefaultHighlighter.DefaultHighlightPainter> {

        @Override
        public Class<javax.swing.text.DefaultHighlighter.DefaultHighlightPainter> createNewSUT() {
            return javax.swing.text.DefaultHighlighter.DefaultHighlightPainter.class;
        }

    }

    @Override
    public Class<javax.swing.text.DefaultHighlighter> createNewSUT() {
        return javax.swing.text.DefaultHighlighter.class;
    }

}
