package org.j8unit.repository.javax.imageio.spi;

import static org.junit.Assert.fail;
import javax.imageio.spi.ImageReaderWriterSpi;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageReaderWriterSpiClassTest
implements org.j8unit.repository.javax.imageio.spi.ImageReaderWriterSpiClassTests<ImageReaderWriterSpi> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.spi.ImageReaderWriterSpi]

    @Override
    public Class<ImageReaderWriterSpi> createNewSUT() {
        return ImageReaderWriterSpi.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.spi.ImageReaderWriterSpi#ImageReaderWriterSpi(String, String, String[], String[], String[], String, boolean, String, String, String[], String[], boolean, String, String, String[], String[])
     * public
     * javax.imageio.spi.ImageReaderWriterSpi(java.lang.String,java.lang.String,java.lang.String[],java.lang.String[],java.lang.String[],java.lang.String,boolean,java.lang.String,java.lang.String,java.lang.String[],java.lang.String[],boolean,java.lang.String,java.lang.String,java.lang.String[],java.lang.String[])}
     * .
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
    public void create_ImageReaderWriterSpi_String_String_StringArray_StringArray_StringArray_String_boolean_String_String_StringArray_StringArray_boolean_String_String_StringArray_StringArray()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.spi.ImageReaderWriterSpi#ImageReaderWriterSpi() public
     * javax.imageio.spi.ImageReaderWriterSpi()}.
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
    public void create_ImageReaderWriterSpi()
    throws Exception {
        Assert.fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.spi.ImageReaderWriterSpi]

}
