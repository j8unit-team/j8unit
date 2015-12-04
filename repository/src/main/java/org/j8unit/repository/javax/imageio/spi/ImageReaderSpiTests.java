package org.j8unit.repository.javax.imageio.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.imageio.spi.ImageReaderSpi class javax.imageio.spi.ImageReaderSpi}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.imageio.spi.ImageReaderSpiClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ImageReaderSpiTests<SUT extends javax.imageio.spi.ImageReaderSpi>
extends org.j8unit.repository.javax.imageio.spi.ImageReaderWriterSpiTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ImageReaderSpi#canDecodeInput(java.lang.Object) public abstract boolean
     * javax.imageio.spi.ImageReaderSpi.canDecodeInput(java.lang.Object) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_canDecodeInput_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ImageReaderSpi#createReaderInstance() public javax.imageio.ImageReader
     * javax.imageio.spi.ImageReaderSpi.createReaderInstance() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createReaderInstance()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ImageReaderSpi#createReaderInstance(java.lang.Object) public abstract
     * javax.imageio.ImageReader javax.imageio.spi.ImageReaderSpi.createReaderInstance(java.lang.Object) throws
     * java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createReaderInstance_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ImageReaderSpi#getImageWriterSpiNames() public java.lang.String[]
     * javax.imageio.spi.ImageReaderSpi.getImageWriterSpiNames()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getImageWriterSpiNames()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ImageReaderSpi#getInputTypes() public java.lang.Class[]
     * javax.imageio.spi.ImageReaderSpi.getInputTypes()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInputTypes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ImageReaderSpi#isOwnReader(javax.imageio.ImageReader) public boolean
     * javax.imageio.spi.ImageReaderSpi.isOwnReader(javax.imageio.ImageReader)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isOwnReader_ImageReader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
