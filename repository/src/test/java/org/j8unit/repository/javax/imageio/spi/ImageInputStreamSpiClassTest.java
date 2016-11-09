package org.j8unit.repository.javax.imageio.spi;

import static org.junit.Assert.fail;
import javax.imageio.spi.ImageInputStreamSpi;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ImageInputStreamSpi} (by simply reusing
 * the J8Unit test interface {@link ImageInputStreamSpiClassTests}).
 */

@RunWith(J8Unit4.class)
public class ImageInputStreamSpiClassTest
implements ImageInputStreamSpiClassTests<ImageInputStreamSpi> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.spi.ImageInputStreamSpi]

    @Override
    public Class<ImageInputStreamSpi> createNewSUT() {
        return ImageInputStreamSpi.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.spi.ImageInputStreamSpi#ImageInputStreamSpi(String, String, Class) public
     * javax.imageio.spi.ImageInputStreamSpi(java.lang.String,java.lang.String,java.lang.Class<?>)}.
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
    public void create_ImageInputStreamSpi_String_String_Class()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.spi.ImageInputStreamSpi]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.spi.ImageInputStreamSpi]

}
