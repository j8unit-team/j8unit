package org.j8unit.repository.javax.imageio.stream;

import static org.junit.Assert.fail;
import javax.imageio.stream.ImageInputStreamImpl;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ImageInputStreamImpl} (by simply reusing
 * the J8Unit test interface {@link ImageInputStreamImplClassTests}).
 */

@RunWith(J8Unit4.class)
public class ImageInputStreamImplClassTest
implements ImageInputStreamImplClassTests<ImageInputStreamImpl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.stream.ImageInputStreamImpl]

    @Override
    public Class<ImageInputStreamImpl> createNewSUT() {
        return ImageInputStreamImpl.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.stream.ImageInputStreamImpl#ImageInputStreamImpl() public
     * javax.imageio.stream.ImageInputStreamImpl()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_ImageInputStreamImpl()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.stream.ImageInputStreamImpl]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.stream.ImageInputStreamImpl]

}
