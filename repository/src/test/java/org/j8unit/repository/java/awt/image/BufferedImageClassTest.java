package org.j8unit.repository.java.awt.image;

import java.awt.image.BufferedImage;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BufferedImage} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.image.BufferedImageClassTests}).
 */

@RunWith(J8Unit4.class)
public class BufferedImageClassTest
implements BufferedImageClassTests<BufferedImage> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.BufferedImage]

    @Override
    public Class<BufferedImage> createNewSUT() {
        return BufferedImage.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.image.BufferedImage#BufferedImage(java.awt.image.ColorModel, java.awt.image.WritableRaster, boolean, java.util.Hashtable)
     * public
     * java.awt.image.BufferedImage(java.awt.image.ColorModel,java.awt.image.WritableRaster,boolean,java.util.Hashtable<?,
     * ?>)}.
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
    public void create_BufferedImage_ColorModel_WritableRaster_boolean_Hashtable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BufferedImage sut = null; // = new BufferedImage(java.awt.image.ColorModel, java.awt.image.WritableRaster,
                                        // boolean, java.util.Hashtable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.image.BufferedImage#BufferedImage(int, int, int) public
     * java.awt.image.BufferedImage(int,int,int)}.
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
    public void create_BufferedImage_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BufferedImage sut = null; // = new BufferedImage(int, int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.image.BufferedImage#BufferedImage(int, int, int, java.awt.image.IndexColorModel) public
     * java.awt.image.BufferedImage(int,int,int,java.awt.image.IndexColorModel)}.
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
    public void create_BufferedImage_int_int_int_IndexColorModel()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BufferedImage sut = null; // = new BufferedImage(int, int, int, java.awt.image.IndexColorModel);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.image.BufferedImage]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.BufferedImage]

}
