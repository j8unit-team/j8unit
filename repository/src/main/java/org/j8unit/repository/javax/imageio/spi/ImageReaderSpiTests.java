package org.j8unit.repository.javax.imageio.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.imageio.spi.ImageReaderSpi class javax.imageio.spi.ImageReaderSpi}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link ImageReaderSpiClassTests}.
 * </p>
 *
 * @see javax.imageio.spi.ImageReaderSpi class javax.imageio.spi.ImageReaderSpi (the hereby targeted class-under-test
 *      class)
 * @see ImageReaderSpiClassTests ImageReaderSpiClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ImageReaderSpiTests<SUT extends javax.imageio.spi.ImageReaderSpi>
extends ImageReaderWriterSpiTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ImageReaderSpi#isOwnReader(javax.imageio.ImageReader) public boolean
     * javax.imageio.spi.ImageReaderSpi.isOwnReader(javax.imageio.ImageReader)}.
     *
     * <p>
     * Test method for {@link javax.imageio.spi.ImageReaderSpi#isOwnReader(javax.imageio.ImageReader) public boolean
     * javax.imageio.spi.ImageReaderSpi.isOwnReader(javax.imageio.ImageReader)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.imageio.spi.ImageReaderSpi#isOwnReader(javax.imageio.ImageReader) public boolean
     *      javax.imageio.spi.ImageReaderSpi.isOwnReader(javax.imageio.ImageReader) (the hereby targeted
     *      method-under-test)
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

    /**
     * <p>
     * Test method for {@link javax.imageio.spi.ImageReaderSpi#getInputTypes() public java.lang.Class[]
     * javax.imageio.spi.ImageReaderSpi.getInputTypes()}.
     *
     * <p>
     * Test method for {@link javax.imageio.spi.ImageReaderSpi#getInputTypes() public java.lang.Class[]
     * javax.imageio.spi.ImageReaderSpi.getInputTypes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.imageio.spi.ImageReaderSpi#getInputTypes() public java.lang.Class[]
     *      javax.imageio.spi.ImageReaderSpi.getInputTypes() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.imageio.spi.ImageReaderSpi#createReaderInstance() public javax.imageio.ImageReader
     * javax.imageio.spi.ImageReaderSpi.createReaderInstance() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.imageio.spi.ImageReaderSpi#createReaderInstance() public javax.imageio.ImageReader
     * javax.imageio.spi.ImageReaderSpi.createReaderInstance() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.imageio.spi.ImageReaderSpi#createReaderInstance() public javax.imageio.ImageReader
     *      javax.imageio.spi.ImageReaderSpi.createReaderInstance() throws java.io.IOException (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link javax.imageio.spi.ImageReaderSpi#createReaderInstance(Object) public abstract
     * javax.imageio.ImageReader javax.imageio.spi.ImageReaderSpi.createReaderInstance(java.lang.Object) throws
     * java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.imageio.spi.ImageReaderSpi#createReaderInstance(Object) public abstract
     * javax.imageio.ImageReader javax.imageio.spi.ImageReaderSpi.createReaderInstance(java.lang.Object) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.imageio.spi.ImageReaderSpi#createReaderInstance(Object) public abstract javax.imageio.ImageReader
     *      javax.imageio.spi.ImageReaderSpi.createReaderInstance(java.lang.Object) throws java.io.IOException (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link javax.imageio.spi.ImageReaderSpi#canDecodeInput(Object) public abstract boolean
     * javax.imageio.spi.ImageReaderSpi.canDecodeInput(java.lang.Object) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link javax.imageio.spi.ImageReaderSpi#canDecodeInput(Object) public abstract boolean
     * javax.imageio.spi.ImageReaderSpi.canDecodeInput(java.lang.Object) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.imageio.spi.ImageReaderSpi#canDecodeInput(Object) public abstract boolean
     *      javax.imageio.spi.ImageReaderSpi.canDecodeInput(java.lang.Object) throws java.io.IOException (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link javax.imageio.spi.ImageReaderSpi#getImageWriterSpiNames() public java.lang.String[]
     * javax.imageio.spi.ImageReaderSpi.getImageWriterSpiNames()}.
     *
     * <p>
     * Test method for {@link javax.imageio.spi.ImageReaderSpi#getImageWriterSpiNames() public java.lang.String[]
     * javax.imageio.spi.ImageReaderSpi.getImageWriterSpiNames()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.imageio.spi.ImageReaderSpi#getImageWriterSpiNames() public java.lang.String[]
     *      javax.imageio.spi.ImageReaderSpi.getImageWriterSpiNames() (the hereby targeted method-under-test)
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

}
