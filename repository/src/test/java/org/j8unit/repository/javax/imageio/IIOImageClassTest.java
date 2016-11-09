package org.j8unit.repository.javax.imageio;

import javax.imageio.IIOImage;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IIOImage} (by simply reusing the J8Unit
 * test interface {@link IIOImageClassTests}).
 */

@RunWith(J8Unit4.class)
public class IIOImageClassTest
implements IIOImageClassTests<IIOImage> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.IIOImage]

    @Override
    public Class<IIOImage> createNewSUT() {
        return IIOImage.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.IIOImage#IIOImage(java.awt.image.RenderedImage, java.util.List, javax.imageio.metadata.IIOMetadata)
     * public javax.imageio.IIOImage(java.awt.image.RenderedImage,java.util.List<? extends
     * java.awt.image.BufferedImage>,javax.imageio.metadata.IIOMetadata)}.
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
    public void create_IIOImage_RenderedImage_List_IIOMetadata()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IIOImage sut = null; // = new IIOImage(java.awt.image.RenderedImage, java.util.List,
                                   // javax.imageio.metadata.IIOMetadata);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.IIOImage#IIOImage(java.awt.image.Raster, java.util.List, javax.imageio.metadata.IIOMetadata)
     * public javax.imageio.IIOImage(java.awt.image.Raster,java.util.List<? extends
     * java.awt.image.BufferedImage>,javax.imageio.metadata.IIOMetadata)}.
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
    public void create_IIOImage_Raster_List_IIOMetadata()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IIOImage sut = null; // = new IIOImage(java.awt.image.Raster, java.util.List,
                                   // javax.imageio.metadata.IIOMetadata);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.IIOImage]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.IIOImage]

}
