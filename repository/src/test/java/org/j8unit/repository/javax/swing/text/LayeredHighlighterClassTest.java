package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LayeredHighlighterClassTest
implements org.j8unit.repository.javax.swing.text.LayeredHighlighterClassTests<javax.swing.text.LayeredHighlighter> {

    @RunWith(J8Unit4.class)
    public static class LayerPainterClassTest
    implements org.j8unit.repository.javax.swing.text.LayeredHighlighterClassTests.LayerPainterClassTests<javax.swing.text.LayeredHighlighter.LayerPainter> {

        @Override
        public Class<javax.swing.text.LayeredHighlighter.LayerPainter> createNewSUT() {
            return javax.swing.text.LayeredHighlighter.LayerPainter.class;
        }

    }

    @Override
    public Class<javax.swing.text.LayeredHighlighter> createNewSUT() {
        return javax.swing.text.LayeredHighlighter.class;
    }

}
