package org.j8unit.repository.java.awt.image;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.image.BufferedImage class java.awt.image.BufferedImage}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link BufferedImageClassTests}.
 * </p>
 *
 * @see java.awt.image.BufferedImage class java.awt.image.BufferedImage (the hereby targeted class-under-test class)
 * @see BufferedImageClassTests BufferedImageClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BufferedImageTests<SUT extends java.awt.image.BufferedImage>
extends WritableRenderedImageTests<SUT>, org.j8unit.repository.java.awt.TransparencyTests<SUT>, org.j8unit.repository.java.awt.ImageTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#setData(java.awt.image.Raster) public void
     * java.awt.image.BufferedImage.setData(java.awt.image.Raster)}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#setData(java.awt.image.Raster) public void
     * java.awt.image.BufferedImage.setData(java.awt.image.Raster)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#setData(java.awt.image.Raster) public void
     *      java.awt.image.BufferedImage.setData(java.awt.image.Raster) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setData_Raster()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getSubimage(int, int, int, int) public
     * java.awt.image.BufferedImage java.awt.image.BufferedImage.getSubimage(int,int,int,int)}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getSubimage(int, int, int, int) public
     * java.awt.image.BufferedImage java.awt.image.BufferedImage.getSubimage(int,int,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getSubimage(int, int, int, int) public java.awt.image.BufferedImage
     *      java.awt.image.BufferedImage.getSubimage(int,int,int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSubimage_int_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getTile(int, int) public java.awt.image.Raster
     * java.awt.image.BufferedImage.getTile(int,int)}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getTile(int, int) public java.awt.image.Raster
     * java.awt.image.BufferedImage.getTile(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getTile(int, int) public java.awt.image.Raster
     *      java.awt.image.BufferedImage.getTile(int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getTile_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getTileHeight() public int
     * java.awt.image.BufferedImage.getTileHeight()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getTileHeight() public int
     * java.awt.image.BufferedImage.getTileHeight()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getTileHeight() public int java.awt.image.BufferedImage.getTileHeight() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getTileHeight()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getProperty(String) public java.lang.Object
     * java.awt.image.BufferedImage.getProperty(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getProperty(String) public java.lang.Object
     * java.awt.image.BufferedImage.getProperty(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getProperty(String) public java.lang.Object
     *      java.awt.image.BufferedImage.getProperty(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getProperty_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getProperty(String, java.awt.image.ImageObserver) public
     * java.lang.Object java.awt.image.BufferedImage.getProperty(java.lang.String,java.awt.image.ImageObserver)}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getProperty(String, java.awt.image.ImageObserver) public
     * java.lang.Object java.awt.image.BufferedImage.getProperty(java.lang.String,java.awt.image.ImageObserver)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getProperty(String, java.awt.image.ImageObserver) public java.lang.Object
     *      java.awt.image.BufferedImage.getProperty(java.lang.String,java.awt.image.ImageObserver) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getProperty_String_ImageObserver()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getColorModel() public java.awt.image.ColorModel
     * java.awt.image.BufferedImage.getColorModel()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getColorModel() public java.awt.image.ColorModel
     * java.awt.image.BufferedImage.getColorModel()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getColorModel() public java.awt.image.ColorModel
     *      java.awt.image.BufferedImage.getColorModel() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getColorModel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#copyData(java.awt.image.WritableRaster) public
     * java.awt.image.WritableRaster java.awt.image.BufferedImage.copyData(java.awt.image.WritableRaster)}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#copyData(java.awt.image.WritableRaster) public
     * java.awt.image.WritableRaster java.awt.image.BufferedImage.copyData(java.awt.image.WritableRaster)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#copyData(java.awt.image.WritableRaster) public java.awt.image.WritableRaster
     *      java.awt.image.BufferedImage.copyData(java.awt.image.WritableRaster) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_copyData_WritableRaster()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getTransparency() public int
     * java.awt.image.BufferedImage.getTransparency()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getTransparency() public int
     * java.awt.image.BufferedImage.getTransparency()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getTransparency() public int java.awt.image.BufferedImage.getTransparency()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getTransparency()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#isAlphaPremultiplied() public boolean
     * java.awt.image.BufferedImage.isAlphaPremultiplied()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#isAlphaPremultiplied() public boolean
     * java.awt.image.BufferedImage.isAlphaPremultiplied()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#isAlphaPremultiplied() public boolean
     *      java.awt.image.BufferedImage.isAlphaPremultiplied() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isAlphaPremultiplied()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#hasTileWriters() public boolean
     * java.awt.image.BufferedImage.hasTileWriters()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#hasTileWriters() public boolean
     * java.awt.image.BufferedImage.hasTileWriters()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#hasTileWriters() public boolean java.awt.image.BufferedImage.hasTileWriters()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hasTileWriters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getType() public int java.awt.image.BufferedImage.getType()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getType() public int java.awt.image.BufferedImage.getType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getType() public int java.awt.image.BufferedImage.getType() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getSource() public java.awt.image.ImageProducer
     * java.awt.image.BufferedImage.getSource()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getSource() public java.awt.image.ImageProducer
     * java.awt.image.BufferedImage.getSource()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getSource() public java.awt.image.ImageProducer
     *      java.awt.image.BufferedImage.getSource() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getSource()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getTileGridYOffset() public int
     * java.awt.image.BufferedImage.getTileGridYOffset()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getTileGridYOffset() public int
     * java.awt.image.BufferedImage.getTileGridYOffset()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getTileGridYOffset() public int
     *      java.awt.image.BufferedImage.getTileGridYOffset() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getTileGridYOffset()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#releaseWritableTile(int, int) public void
     * java.awt.image.BufferedImage.releaseWritableTile(int,int)}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#releaseWritableTile(int, int) public void
     * java.awt.image.BufferedImage.releaseWritableTile(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#releaseWritableTile(int, int) public void
     *      java.awt.image.BufferedImage.releaseWritableTile(int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_releaseWritableTile_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getMinY() public int java.awt.image.BufferedImage.getMinY()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getMinY() public int java.awt.image.BufferedImage.getMinY()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getMinY() public int java.awt.image.BufferedImage.getMinY() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMinY()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getMinX() public int java.awt.image.BufferedImage.getMinX()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getMinX() public int java.awt.image.BufferedImage.getMinX()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getMinX() public int java.awt.image.BufferedImage.getMinX() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMinX()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#toString() public java.lang.String
     * java.awt.image.BufferedImage.toString()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#toString() public java.lang.String
     * java.awt.image.BufferedImage.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#toString() public java.lang.String java.awt.image.BufferedImage.toString() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getMinTileY() public int
     * java.awt.image.BufferedImage.getMinTileY()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getMinTileY() public int
     * java.awt.image.BufferedImage.getMinTileY()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getMinTileY() public int java.awt.image.BufferedImage.getMinTileY() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMinTileY()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getMinTileX() public int
     * java.awt.image.BufferedImage.getMinTileX()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getMinTileX() public int
     * java.awt.image.BufferedImage.getMinTileX()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getMinTileX() public int java.awt.image.BufferedImage.getMinTileX() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMinTileX()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getTileWidth() public int
     * java.awt.image.BufferedImage.getTileWidth()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getTileWidth() public int
     * java.awt.image.BufferedImage.getTileWidth()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getTileWidth() public int java.awt.image.BufferedImage.getTileWidth() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getTileWidth()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getTileGridXOffset() public int
     * java.awt.image.BufferedImage.getTileGridXOffset()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getTileGridXOffset() public int
     * java.awt.image.BufferedImage.getTileGridXOffset()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getTileGridXOffset() public int
     *      java.awt.image.BufferedImage.getTileGridXOffset() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getTileGridXOffset()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#addTileObserver(java.awt.image.TileObserver) public void
     * java.awt.image.BufferedImage.addTileObserver(java.awt.image.TileObserver)}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#addTileObserver(java.awt.image.TileObserver) public void
     * java.awt.image.BufferedImage.addTileObserver(java.awt.image.TileObserver)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#addTileObserver(java.awt.image.TileObserver) public void
     *      java.awt.image.BufferedImage.addTileObserver(java.awt.image.TileObserver) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addTileObserver_TileObserver()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#setRGB(int, int, int) public synchronized void
     * java.awt.image.BufferedImage.setRGB(int,int,int)}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#setRGB(int, int, int) public synchronized void
     * java.awt.image.BufferedImage.setRGB(int,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#setRGB(int, int, int) public synchronized void
     *      java.awt.image.BufferedImage.setRGB(int,int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setRGB_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#setRGB(int, int, int, int, int[], int, int) public void
     * java.awt.image.BufferedImage.setRGB(int,int,int,int,int[],int,int)}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#setRGB(int, int, int, int, int[], int, int) public void
     * java.awt.image.BufferedImage.setRGB(int,int,int,int,int[],int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#setRGB(int, int, int, int, int[], int, int) public void
     *      java.awt.image.BufferedImage.setRGB(int,int,int,int,int[],int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setRGB_int_int_int_int_intArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#isTileWritable(int, int) public boolean
     * java.awt.image.BufferedImage.isTileWritable(int,int)}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#isTileWritable(int, int) public boolean
     * java.awt.image.BufferedImage.isTileWritable(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#isTileWritable(int, int) public boolean
     *      java.awt.image.BufferedImage.isTileWritable(int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isTileWritable_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getWidth(java.awt.image.ImageObserver) public int
     * java.awt.image.BufferedImage.getWidth(java.awt.image.ImageObserver)}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getWidth(java.awt.image.ImageObserver) public int
     * java.awt.image.BufferedImage.getWidth(java.awt.image.ImageObserver)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getWidth(java.awt.image.ImageObserver) public int
     *      java.awt.image.BufferedImage.getWidth(java.awt.image.ImageObserver) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getWidth_ImageObserver()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getWidth() public int
     * java.awt.image.BufferedImage.getWidth()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getWidth() public int
     * java.awt.image.BufferedImage.getWidth()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getWidth() public int java.awt.image.BufferedImage.getWidth() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getWidth()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getSources() public java.util.Vector
     * <java.awt.image.RenderedImage> java.awt.image.BufferedImage.getSources()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getSources() public java.util.Vector
     * java.awt.image.BufferedImage.getSources()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getSources() public java.util.Vector java.awt.image.BufferedImage.getSources()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getSources()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#coerceData(boolean) public void
     * java.awt.image.BufferedImage.coerceData(boolean)}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#coerceData(boolean) public void
     * java.awt.image.BufferedImage.coerceData(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#coerceData(boolean) public void
     *      java.awt.image.BufferedImage.coerceData(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_coerceData_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getNumYTiles() public int
     * java.awt.image.BufferedImage.getNumYTiles()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getNumYTiles() public int
     * java.awt.image.BufferedImage.getNumYTiles()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getNumYTiles() public int java.awt.image.BufferedImage.getNumYTiles() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getNumYTiles()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getSampleModel() public java.awt.image.SampleModel
     * java.awt.image.BufferedImage.getSampleModel()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getSampleModel() public java.awt.image.SampleModel
     * java.awt.image.BufferedImage.getSampleModel()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getSampleModel() public java.awt.image.SampleModel
     *      java.awt.image.BufferedImage.getSampleModel() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getSampleModel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getWritableTileIndices() public java.awt.Point[]
     * java.awt.image.BufferedImage.getWritableTileIndices()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getWritableTileIndices() public java.awt.Point[]
     * java.awt.image.BufferedImage.getWritableTileIndices()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getWritableTileIndices() public java.awt.Point[]
     *      java.awt.image.BufferedImage.getWritableTileIndices() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getWritableTileIndices()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#removeTileObserver(java.awt.image.TileObserver) public void
     * java.awt.image.BufferedImage.removeTileObserver(java.awt.image.TileObserver)}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#removeTileObserver(java.awt.image.TileObserver) public void
     * java.awt.image.BufferedImage.removeTileObserver(java.awt.image.TileObserver)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#removeTileObserver(java.awt.image.TileObserver) public void
     *      java.awt.image.BufferedImage.removeTileObserver(java.awt.image.TileObserver) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeTileObserver_TileObserver()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getHeight() public int
     * java.awt.image.BufferedImage.getHeight()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getHeight() public int
     * java.awt.image.BufferedImage.getHeight()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getHeight() public int java.awt.image.BufferedImage.getHeight() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getHeight()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getHeight(java.awt.image.ImageObserver) public int
     * java.awt.image.BufferedImage.getHeight(java.awt.image.ImageObserver)}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getHeight(java.awt.image.ImageObserver) public int
     * java.awt.image.BufferedImage.getHeight(java.awt.image.ImageObserver)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getHeight(java.awt.image.ImageObserver) public int
     *      java.awt.image.BufferedImage.getHeight(java.awt.image.ImageObserver) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getHeight_ImageObserver()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getWritableTile(int, int) public
     * java.awt.image.WritableRaster java.awt.image.BufferedImage.getWritableTile(int,int)}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getWritableTile(int, int) public
     * java.awt.image.WritableRaster java.awt.image.BufferedImage.getWritableTile(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getWritableTile(int, int) public java.awt.image.WritableRaster
     *      java.awt.image.BufferedImage.getWritableTile(int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getWritableTile_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getNumXTiles() public int
     * java.awt.image.BufferedImage.getNumXTiles()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getNumXTiles() public int
     * java.awt.image.BufferedImage.getNumXTiles()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getNumXTiles() public int java.awt.image.BufferedImage.getNumXTiles() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getNumXTiles()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getRGB(int, int) public int
     * java.awt.image.BufferedImage.getRGB(int,int)}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getRGB(int, int) public int
     * java.awt.image.BufferedImage.getRGB(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getRGB(int, int) public int java.awt.image.BufferedImage.getRGB(int,int) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRGB_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getRGB(int, int, int, int, int[], int, int) public int[]
     * java.awt.image.BufferedImage.getRGB(int,int,int,int,int[],int,int)}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getRGB(int, int, int, int, int[], int, int) public int[]
     * java.awt.image.BufferedImage.getRGB(int,int,int,int,int[],int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getRGB(int, int, int, int, int[], int, int) public int[]
     *      java.awt.image.BufferedImage.getRGB(int,int,int,int,int[],int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRGB_int_int_int_int_intArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getRaster() public java.awt.image.WritableRaster
     * java.awt.image.BufferedImage.getRaster()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getRaster() public java.awt.image.WritableRaster
     * java.awt.image.BufferedImage.getRaster()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getRaster() public java.awt.image.WritableRaster
     *      java.awt.image.BufferedImage.getRaster() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRaster()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getData(java.awt.Rectangle) public java.awt.image.Raster
     * java.awt.image.BufferedImage.getData(java.awt.Rectangle)}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getData(java.awt.Rectangle) public java.awt.image.Raster
     * java.awt.image.BufferedImage.getData(java.awt.Rectangle)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getData(java.awt.Rectangle) public java.awt.image.Raster
     *      java.awt.image.BufferedImage.getData(java.awt.Rectangle) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getData_Rectangle()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getData() public java.awt.image.Raster
     * java.awt.image.BufferedImage.getData()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getData() public java.awt.image.Raster
     * java.awt.image.BufferedImage.getData()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getData() public java.awt.image.Raster java.awt.image.BufferedImage.getData()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getData()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getAlphaRaster() public java.awt.image.WritableRaster
     * java.awt.image.BufferedImage.getAlphaRaster()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getAlphaRaster() public java.awt.image.WritableRaster
     * java.awt.image.BufferedImage.getAlphaRaster()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getAlphaRaster() public java.awt.image.WritableRaster
     *      java.awt.image.BufferedImage.getAlphaRaster() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAlphaRaster()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getPropertyNames() public java.lang.String[]
     * java.awt.image.BufferedImage.getPropertyNames()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getPropertyNames() public java.lang.String[]
     * java.awt.image.BufferedImage.getPropertyNames()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getPropertyNames() public java.lang.String[]
     *      java.awt.image.BufferedImage.getPropertyNames() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getPropertyNames()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getGraphics() public java.awt.Graphics
     * java.awt.image.BufferedImage.getGraphics()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#getGraphics() public java.awt.Graphics
     * java.awt.image.BufferedImage.getGraphics()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#getGraphics() public java.awt.Graphics
     *      java.awt.image.BufferedImage.getGraphics() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getGraphics()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#createGraphics() public java.awt.Graphics2D
     * java.awt.image.BufferedImage.createGraphics()}.
     *
     * <p>
     * Test method for {@link java.awt.image.BufferedImage#createGraphics() public java.awt.Graphics2D
     * java.awt.image.BufferedImage.createGraphics()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.BufferedImage#createGraphics() public java.awt.Graphics2D
     *      java.awt.image.BufferedImage.createGraphics() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createGraphics()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
