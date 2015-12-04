package org.j8unit.repository.javax.imageio.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.imageio.spi.ImageOutputStreamSpi class javax.imageio.spi.ImageOutputStreamSpi},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.imageio.spi.ImageOutputStreamSpiClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ImageOutputStreamSpiTests<SUT extends javax.imageio.spi.ImageOutputStreamSpi>
extends org.j8unit.repository.javax.imageio.spi.IIOServiceProviderTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ImageOutputStreamSpi#getOutputClass() public java.lang.Class
     * javax.imageio.spi.ImageOutputStreamSpi.getOutputClass()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOutputClass()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ImageOutputStreamSpi#needsCacheFile() public boolean
     * javax.imageio.spi.ImageOutputStreamSpi.needsCacheFile()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_needsCacheFile()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ImageOutputStreamSpi#canUseCacheFile() public boolean
     * javax.imageio.spi.ImageOutputStreamSpi.canUseCacheFile()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_canUseCacheFile()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ImageOutputStreamSpi#createOutputStreamInstance(java.lang.Object) public
     * javax.imageio.stream.ImageOutputStream
     * javax.imageio.spi.ImageOutputStreamSpi.createOutputStreamInstance(java.lang.Object) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createOutputStreamInstance_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.imageio.spi.ImageOutputStreamSpi#createOutputStreamInstance(java.lang.Object,boolean,java.io.File)
     * public abstract javax.imageio.stream.ImageOutputStream
     * javax.imageio.spi.ImageOutputStreamSpi.createOutputStreamInstance(java.lang.Object,boolean,java.io.File) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createOutputStreamInstance_Object_boolean_File()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
