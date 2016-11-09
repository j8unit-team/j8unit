package org.j8unit.repository.java.awt;

import java.awt.Canvas;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Canvas} (by simply reusing the J8Unit
 * test interface {@link CanvasClassTests}).
 */

@RunWith(J8Unit4.class)
public class CanvasClassTest
implements CanvasClassTests<Canvas> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Canvas]

    @Override
    public Class<Canvas> createNewSUT() {
        return Canvas.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.Canvas#Canvas(java.awt.GraphicsConfiguration) public
     * java.awt.Canvas(java.awt.GraphicsConfiguration)}.
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
    public void create_Canvas_GraphicsConfiguration()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Canvas sut = null; // = new Canvas(java.awt.GraphicsConfiguration);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.Canvas#Canvas() public
     * java.awt.Canvas()}.
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
    public void create_Canvas()
    throws Exception {
        // create new instance
        final Canvas sut = new Canvas();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.Canvas]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Canvas]

}
