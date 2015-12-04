package org.j8unit.repository.javax.imageio.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.imageio.spi.ImageWriterSpi class javax.imageio.spi.ImageWriterSpi}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.imageio.spi.ImageWriterSpiClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ImageWriterSpiTests<SUT extends javax.imageio.spi.ImageWriterSpi>
extends org.j8unit.repository.javax.imageio.spi.ImageReaderWriterSpiTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ImageWriterSpi#getOutputTypes() public java.lang.Class[]
     * javax.imageio.spi.ImageWriterSpi.getOutputTypes()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOutputTypes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ImageWriterSpi#isOwnWriter(javax.imageio.ImageWriter) public boolean
     * javax.imageio.spi.ImageWriterSpi.isOwnWriter(javax.imageio.ImageWriter)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isOwnWriter_ImageWriter()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ImageWriterSpi#canEncodeImage(java.awt.image.RenderedImage) public
     * boolean javax.imageio.spi.ImageWriterSpi.canEncodeImage(java.awt.image.RenderedImage)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_canEncodeImage_RenderedImage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ImageWriterSpi#canEncodeImage(javax.imageio.ImageTypeSpecifier) public
     * abstract boolean javax.imageio.spi.ImageWriterSpi.canEncodeImage(javax.imageio.ImageTypeSpecifier)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_canEncodeImage_ImageTypeSpecifier()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ImageWriterSpi#createWriterInstance() public javax.imageio.ImageWriter
     * javax.imageio.spi.ImageWriterSpi.createWriterInstance() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createWriterInstance()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ImageWriterSpi#createWriterInstance(java.lang.Object) public abstract
     * javax.imageio.ImageWriter javax.imageio.spi.ImageWriterSpi.createWriterInstance(java.lang.Object) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createWriterInstance_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ImageWriterSpi#isFormatLossless() public boolean
     * javax.imageio.spi.ImageWriterSpi.isFormatLossless()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isFormatLossless()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ImageWriterSpi#getImageReaderSpiNames() public java.lang.String[]
     * javax.imageio.spi.ImageWriterSpi.getImageReaderSpiNames()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getImageReaderSpiNames()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
