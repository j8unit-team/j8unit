package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GlyphViewClassTest
implements org.j8unit.repository.javax.swing.text.GlyphViewClassTests<javax.swing.text.GlyphView> {

    @RunWith(J8Unit4.class)
    public static class GlyphPainterClassTest
    implements org.j8unit.repository.javax.swing.text.GlyphViewClassTests.GlyphPainterClassTests<javax.swing.text.GlyphView.GlyphPainter> {

        @Override
        public Class<javax.swing.text.GlyphView.GlyphPainter> createNewSUT() {
            return javax.swing.text.GlyphView.GlyphPainter.class;
        }

    }

    @Override
    public Class<javax.swing.text.GlyphView> createNewSUT() {
        return javax.swing.text.GlyphView.class;
    }

}
