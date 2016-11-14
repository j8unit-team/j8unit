package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.fail;
import javax.swing.text.GlyphView;
import javax.swing.text.GlyphView.GlyphPainter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link GlyphView} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.text.GlyphViewClassTests}).
 */

@RunWith(J8Unit4.class)
public class GlyphViewClassTest
implements GlyphViewClassTests<GlyphView> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.GlyphView]

    @Override
    public Class<GlyphView> createNewSUT() {
        return GlyphView.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.GlyphView#GlyphView(javax.swing.text.Element) public
     * javax.swing.text.GlyphView(javax.swing.text.Element)}.
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
    public void create_GlyphView_Element()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final GlyphView sut = null; // = new GlyphView(javax.swing.text.Element);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.GlyphView]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.GlyphView]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link GlyphPainter} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.GlyphViewClassTests.GlyphPainterClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class GlyphPainterClassTest
    implements GlyphPainterClassTests<GlyphPainter> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.GlyphView$GlyphPainter]

        @Override
        public Class<GlyphPainter> createNewSUT() {
            return GlyphPainter.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.GlyphView.GlyphPainter#GlyphPainter() public
         * javax.swing.text.GlyphView$GlyphPainter()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("Cannot construct an abstract class!")
        @Test
        @Category(Draft.class)
        public void create_GlyphPainter()
        throws Exception {
            fail("Cannot construct an abstract class!");
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.GlyphView$GlyphPainter]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.GlyphView$GlyphPainter]

    }

}
