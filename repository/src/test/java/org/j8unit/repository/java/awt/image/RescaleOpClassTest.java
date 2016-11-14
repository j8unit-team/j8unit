package org.j8unit.repository.java.awt.image;

import java.awt.image.RescaleOp;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RescaleOp} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.image.RescaleOpClassTests}).
 */

@RunWith(J8Unit4.class)
public class RescaleOpClassTest
implements RescaleOpClassTests<RescaleOp> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.RescaleOp]

    @Override
    public Class<RescaleOp> createNewSUT() {
        return RescaleOp.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.image.RescaleOp#RescaleOp(float, float, java.awt.RenderingHints) public
     * java.awt.image.RescaleOp(float,float,java.awt.RenderingHints)}.
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
    public void create_RescaleOp_float_float_RenderingHints()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RescaleOp sut = null; // = new RescaleOp(float, float, java.awt.RenderingHints);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.image.RescaleOp#RescaleOp(float[], float[], java.awt.RenderingHints) public
     * java.awt.image.RescaleOp(float[],float[],java.awt.RenderingHints)}.
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
    public void create_RescaleOp_floatArray_floatArray_RenderingHints()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RescaleOp sut = null; // = new RescaleOp(float[], float[], java.awt.RenderingHints);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.image.RescaleOp]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.RescaleOp]

}
