package org.j8unit.repository.javax.swing.text;

import javax.swing.text.GlyphView;
import javax.swing.text.GlyphView.GlyphPainter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GlyphViewTest
implements org.j8unit.repository.javax.swing.text.GlyphViewTests<GlyphView> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.GlyphView]

    @Override
    public GlyphView createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.GlyphView], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.GlyphView]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.GlyphView]

    @RunWith(J8Unit4.class)
    public static class GlyphPainterTest
    implements org.j8unit.repository.javax.swing.text.GlyphViewTests.GlyphPainterTests<GlyphPainter> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.GlyphView$GlyphPainter]

        @Override
        public GlyphPainter createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.GlyphView.GlyphPainter], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.GlyphView$GlyphPainter]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.GlyphView$GlyphPainter]

    }

}
