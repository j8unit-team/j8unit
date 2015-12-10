package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultHighlighterTest
implements org.j8unit.repository.javax.swing.text.DefaultHighlighterTests<javax.swing.text.DefaultHighlighter> {

    @RunWith(J8Unit4.class)
    public static class DefaultHighlightPainterTest
    implements
    org.j8unit.repository.javax.swing.text.DefaultHighlighterTests.DefaultHighlightPainterTests<javax.swing.text.DefaultHighlighter.DefaultHighlightPainter> {

        @Override
        public javax.swing.text.DefaultHighlighter.DefaultHighlightPainter createNewSUT() {
            throw new AssertionError("There is no default constructor for [javax.swing.text.DefaultHighlighter.DefaultHighlightPainter] available.");
        }

    }

    @Override
    public javax.swing.text.DefaultHighlighter createNewSUT() {
        return new javax.swing.text.DefaultHighlighter();
    }

}
