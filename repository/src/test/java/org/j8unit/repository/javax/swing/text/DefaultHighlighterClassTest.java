package org.j8unit.repository.javax.swing.text;

import javax.swing.text.DefaultHighlighter;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DefaultHighlighter} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.text.DefaultHighlighterClassTests}).
 */

@RunWith(J8Unit4.class)
public class DefaultHighlighterClassTest
implements DefaultHighlighterClassTests<DefaultHighlighter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.DefaultHighlighter]

    @Override
    public Class<DefaultHighlighter> createNewSUT() {
        return DefaultHighlighter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.DefaultHighlighter#DefaultHighlighter() public javax.swing.text.DefaultHighlighter()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_DefaultHighlighter()
    throws Exception {
        // create new instance
        final DefaultHighlighter sut = new DefaultHighlighter();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.DefaultHighlighter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.DefaultHighlighter]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link DefaultHighlightPainter} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.DefaultHighlighterClassTests.DefaultHighlightPainterClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class DefaultHighlightPainterClassTest
    implements DefaultHighlightPainterClassTests<DefaultHighlightPainter> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.DefaultHighlighter$DefaultHighlightPainter]

        @Override
        public Class<DefaultHighlightPainter> createNewSUT() {
            return DefaultHighlightPainter.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.DefaultHighlighter.DefaultHighlightPainter#DefaultHighlightPainter(java.awt.Color)
         * public javax.swing.text.DefaultHighlighter$DefaultHighlightPainter(java.awt.Color)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_DefaultHighlightPainter_Color()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final DefaultHighlightPainter sut = null; // = new DefaultHighlightPainter(java.awt.Color);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.DefaultHighlighter$DefaultHighlightPainter]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.DefaultHighlighter$DefaultHighlightPainter]

    }

}
