package org.j8unit.repository.javax.imageio.plugins.jpeg;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JPEGImageReadParamClassTest
implements org.j8unit.repository.javax.imageio.plugins.jpeg.JPEGImageReadParamClassTests<JPEGImageReadParam> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.plugins.jpeg.JPEGImageReadParam]

    @Override
    public Class<JPEGImageReadParam> createNewSUT() {
        return JPEGImageReadParam.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.plugins.jpeg.JPEGImageReadParam#JPEGImageReadParam() public
     * javax.imageio.plugins.jpeg.JPEGImageReadParam()}.
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
    public void create_JPEGImageReadParam()
    throws Exception {
        // create new instance
        final JPEGImageReadParam sut = new JPEGImageReadParam();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.plugins.jpeg.JPEGImageReadParam]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.plugins.jpeg.JPEGImageReadParam]

}
