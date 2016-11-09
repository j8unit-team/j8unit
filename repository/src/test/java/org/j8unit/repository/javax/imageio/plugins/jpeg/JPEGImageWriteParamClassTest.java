package org.j8unit.repository.javax.imageio.plugins.jpeg;

import javax.imageio.plugins.jpeg.JPEGImageWriteParam;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JPEGImageWriteParam} (by simply reusing
 * the J8Unit test interface {@link JPEGImageWriteParamClassTests}).
 */

@RunWith(J8Unit4.class)
public class JPEGImageWriteParamClassTest
implements JPEGImageWriteParamClassTests<JPEGImageWriteParam> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.plugins.jpeg.JPEGImageWriteParam]

    @Override
    public Class<JPEGImageWriteParam> createNewSUT() {
        return JPEGImageWriteParam.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.plugins.jpeg.JPEGImageWriteParam#JPEGImageWriteParam(java.util.Locale) public
     * javax.imageio.plugins.jpeg.JPEGImageWriteParam(java.util.Locale)}.
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
    public void create_JPEGImageWriteParam_Locale()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final JPEGImageWriteParam sut = null; // = new JPEGImageWriteParam(java.util.Locale);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.plugins.jpeg.JPEGImageWriteParam]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.plugins.jpeg.JPEGImageWriteParam]

}
