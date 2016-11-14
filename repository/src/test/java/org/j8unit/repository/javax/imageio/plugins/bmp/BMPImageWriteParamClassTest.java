package org.j8unit.repository.javax.imageio.plugins.bmp;

import javax.imageio.plugins.bmp.BMPImageWriteParam;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BMPImageWriteParam} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.imageio.plugins.bmp.BMPImageWriteParamClassTests}).
 */

@RunWith(J8Unit4.class)
public class BMPImageWriteParamClassTest
implements BMPImageWriteParamClassTests<BMPImageWriteParam> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.plugins.bmp.BMPImageWriteParam]

    @Override
    public Class<BMPImageWriteParam> createNewSUT() {
        return BMPImageWriteParam.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.plugins.bmp.BMPImageWriteParam#BMPImageWriteParam() public
     * javax.imageio.plugins.bmp.BMPImageWriteParam()}.
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
    public void create_BMPImageWriteParam()
    throws Exception {
        // create new instance
        final BMPImageWriteParam sut = new BMPImageWriteParam();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.plugins.bmp.BMPImageWriteParam#BMPImageWriteParam(java.util.Locale) public
     * javax.imageio.plugins.bmp.BMPImageWriteParam(java.util.Locale)}.
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
    public void create_BMPImageWriteParam_Locale()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BMPImageWriteParam sut = null; // = new BMPImageWriteParam(java.util.Locale);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.plugins.bmp.BMPImageWriteParam]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.plugins.bmp.BMPImageWriteParam]

}
