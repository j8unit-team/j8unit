package org.j8unit.repository.java.awt.font;

import java.awt.font.GlyphMetrics;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link GlyphMetrics} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.font.GlyphMetricsClassTests}).
 */

@RunWith(J8Unit4.class)
public class GlyphMetricsClassTest
implements GlyphMetricsClassTests<GlyphMetrics> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.font.GlyphMetrics]

    @Override
    public Class<GlyphMetrics> createNewSUT() {
        return GlyphMetrics.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.font.GlyphMetrics#GlyphMetrics(boolean, float, float, java.awt.geom.Rectangle2D, byte) public
     * java.awt.font.GlyphMetrics(boolean,float,float,java.awt.geom.Rectangle2D,byte)}.
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
    public void create_GlyphMetrics_boolean_float_float_Rectangle2D_byte()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final GlyphMetrics sut = null; // = new GlyphMetrics(boolean, float, float, java.awt.geom.Rectangle2D, byte);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.font.GlyphMetrics#GlyphMetrics(float, java.awt.geom.Rectangle2D, byte) public
     * java.awt.font.GlyphMetrics(float,java.awt.geom.Rectangle2D,byte)}.
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
    public void create_GlyphMetrics_float_Rectangle2D_byte()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final GlyphMetrics sut = null; // = new GlyphMetrics(float, java.awt.geom.Rectangle2D, byte);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.font.GlyphMetrics]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.font.GlyphMetrics]

}
