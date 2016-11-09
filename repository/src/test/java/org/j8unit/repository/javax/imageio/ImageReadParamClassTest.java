package org.j8unit.repository.javax.imageio;

import javax.imageio.ImageReadParam;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ImageReadParam} (by simply reusing the
 * J8Unit test interface {@link ImageReadParamClassTests}).
 */

@RunWith(J8Unit4.class)
public class ImageReadParamClassTest
implements ImageReadParamClassTests<ImageReadParam> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.ImageReadParam]

    @Override
    public Class<ImageReadParam> createNewSUT() {
        return ImageReadParam.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.imageio.ImageReadParam#ImageReadParam()
     * public javax.imageio.ImageReadParam()}.
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
    public void create_ImageReadParam()
    throws Exception {
        // create new instance
        final ImageReadParam sut = new ImageReadParam();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.ImageReadParam]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.ImageReadParam]

}
