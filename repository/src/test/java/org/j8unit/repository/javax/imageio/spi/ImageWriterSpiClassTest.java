package org.j8unit.repository.javax.imageio.spi;

import static org.junit.Assert.fail;
import javax.imageio.spi.ImageWriterSpi;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ImageWriterSpi} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.imageio.spi.ImageWriterSpiClassTests}).
 */
@RunWith(J8Unit4.class)
public class ImageWriterSpiClassTest
implements ImageWriterSpiClassTests<ImageWriterSpi> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.spi.ImageWriterSpi]

    @Override
    public Class<ImageWriterSpi> createNewSUT() {
        return ImageWriterSpi.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.spi.ImageWriterSpi#ImageWriterSpi(String, String, String[], String[], String[], String, Class[], String[], boolean, String, String, String[], String[], boolean, String, String, String[], String[])
     * public
     * javax.imageio.spi.ImageWriterSpi(java.lang.String,java.lang.String,java.lang.String[],java.lang.String[],java.lang.String[],java.lang.String,java.lang.Class[],java.lang.String[],boolean,java.lang.String,java.lang.String,java.lang.String[],java.lang.String[],boolean,java.lang.String,java.lang.String,java.lang.String[],java.lang.String[])}.
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
    public void create_ImageWriterSpi_String_String_StringArray_StringArray_StringArray_String_ClassArray_StringArray_boolean_String_String_StringArray_StringArray_boolean_String_String_StringArray_StringArray()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.spi.ImageWriterSpi]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.spi.ImageWriterSpi]

}
