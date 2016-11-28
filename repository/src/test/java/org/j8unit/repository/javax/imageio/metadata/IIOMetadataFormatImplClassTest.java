package org.j8unit.repository.javax.imageio.metadata;

import static org.junit.Assert.fail;
import javax.imageio.metadata.IIOMetadataFormatImpl;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IIOMetadataFormatImpl} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.imageio.metadata.IIOMetadataFormatImplClassTests}).
 */
@RunWith(J8Unit4.class)
public class IIOMetadataFormatImplClassTest
implements IIOMetadataFormatImplClassTests<IIOMetadataFormatImpl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.imageio.metadata.IIOMetadataFormatImpl]

    @Override
    public Class<IIOMetadataFormatImpl> createNewSUT() {
        return IIOMetadataFormatImpl.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.metadata.IIOMetadataFormatImpl#IIOMetadataFormatImpl(String, int, int) public
     * javax.imageio.metadata.IIOMetadataFormatImpl(java.lang.String,int,int)}.
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
    public void create_IIOMetadataFormatImpl_String_int_int()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.imageio.metadata.IIOMetadataFormatImpl#IIOMetadataFormatImpl(String, int) public
     * javax.imageio.metadata.IIOMetadataFormatImpl(java.lang.String,int)}.
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
    public void create_IIOMetadataFormatImpl_String_int()
    throws Exception {
        Assert.fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.imageio.metadata.IIOMetadataFormatImpl#getStandardFormatInstance() public static
     * javax.imageio.metadata.IIOMetadataFormat
     * javax.imageio.metadata.IIOMetadataFormatImpl.getStandardFormatInstance()}.
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
    public void test_getStandardFormatInstance()
    throws Exception {
        // write some test for {@link javax.imageio.metadata.IIOMetadataFormatImpl#getStandardFormatInstance()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.imageio.metadata.IIOMetadataFormatImpl]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.imageio.metadata.IIOMetadataFormatImpl]

}
