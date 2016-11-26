package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.fail;
import javax.swing.text.LayeredHighlighter;
import javax.swing.text.LayeredHighlighter.LayerPainter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LayeredHighlighter} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.text.LayeredHighlighterClassTests}).
 */
@RunWith(J8Unit4.class)
public class LayeredHighlighterClassTest
implements LayeredHighlighterClassTests<LayeredHighlighter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.LayeredHighlighter]

    @Override
    public Class<LayeredHighlighter> createNewSUT() {
        return LayeredHighlighter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.LayeredHighlighter#LayeredHighlighter() public javax.swing.text.LayeredHighlighter()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_LayeredHighlighter()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.LayeredHighlighter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.LayeredHighlighter]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link LayerPainter} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.LayeredHighlighterClassTests.LayerPainterClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class LayerPainterClassTest
    implements LayerPainterClassTests<LayerPainter> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.LayeredHighlighter$LayerPainter]

        @Override
        public Class<LayerPainter> createNewSUT() {
            return LayerPainter.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.LayeredHighlighter.LayerPainter#LayerPainter() public
         * javax.swing.text.LayeredHighlighter$LayerPainter()}.
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
        public void create_LayerPainter()
        throws Exception {
            Assert.fail("Cannot construct an abstract class!");
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.LayeredHighlighter$LayerPainter]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.LayeredHighlighter$LayerPainter]

    }

}
