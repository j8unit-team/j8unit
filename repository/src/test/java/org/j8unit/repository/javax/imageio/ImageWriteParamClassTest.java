package org.j8unit.repository.javax.imageio;

import java.util.Locale;
import javax.imageio.ImageWriteParam;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageWriteParamClassTest
implements org.j8unit.repository.javax.imageio.ImageWriteParamClassTests<ImageWriteParam> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.ImageWriteParam]

    @Override
    public Class<ImageWriteParam> createNewSUT() {
        return ImageWriteParam.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link ImageWriteParam#ImageWriteParam(Locale) public
     * javax.imageio.ImageWriteParam(java.util.Locale)}.
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
    public void create_ImageWriteParam_Locale()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ImageWriteParam sut = null; // = new ImageWriteParam(Locale);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.ImageWriteParam]

}
