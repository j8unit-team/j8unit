package org.j8unit.repository.javax.imageio.spi;

import static org.junit.Assert.fail;
import javax.imageio.spi.ImageOutputStreamSpi;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageOutputStreamSpiClassTest
implements org.j8unit.repository.javax.imageio.spi.ImageOutputStreamSpiClassTests<ImageOutputStreamSpi> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.spi.ImageOutputStreamSpi]

    @Override
    public Class<ImageOutputStreamSpi> createNewSUT() {
        return ImageOutputStreamSpi.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link ImageOutputStreamSpi#ImageOutputStreamSpi(String, String, Class) public
     * javax.imageio.spi.ImageOutputStreamSpi(java.lang.String,java.lang.String,java.lang.Class<?>)}.
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
    public void create_ImageOutputStreamSpi_String_String_Class()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.spi.ImageOutputStreamSpi]

}
