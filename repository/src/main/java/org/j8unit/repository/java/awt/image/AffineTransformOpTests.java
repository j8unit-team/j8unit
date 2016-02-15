package org.j8unit.repository.java.awt.image;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.image.AffineTransformOp class java.awt.image.AffineTransformOp}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link AffineTransformOpClassTests}.
 * </p>
 *
 * @see java.awt.image.AffineTransformOp class java.awt.image.AffineTransformOp (the hereby targeted class-under-test
 *      class)
 * @see AffineTransformOpClassTests AffineTransformOpClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AffineTransformOpTests<SUT extends java.awt.image.AffineTransformOp>
extends BufferedImageOpTests<SUT>, RasterOpTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.awt.image.AffineTransformOp#filter(java.awt.image.BufferedImage, java.awt.image.BufferedImage) public
     * final java.awt.image.BufferedImage
     * java.awt.image.AffineTransformOp.filter(java.awt.image.BufferedImage,java.awt.image.BufferedImage)}.
     *
     * <p>
     * Test method for
     * {@link java.awt.image.AffineTransformOp#filter(java.awt.image.BufferedImage, java.awt.image.BufferedImage) public
     * final java.awt.image.BufferedImage
     * java.awt.image.AffineTransformOp.filter(java.awt.image.BufferedImage,java.awt.image.BufferedImage)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.AffineTransformOp#filter(java.awt.image.BufferedImage, java.awt.image.BufferedImage) public
     *      final java.awt.image.BufferedImage
     *      java.awt.image.AffineTransformOp.filter(java.awt.image.BufferedImage,java.awt.image.BufferedImage) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_filter_BufferedImage_BufferedImage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.image.AffineTransformOp#filter(java.awt.image.Raster, java.awt.image.WritableRaster) public final
     * java.awt.image.WritableRaster
     * java.awt.image.AffineTransformOp.filter(java.awt.image.Raster,java.awt.image.WritableRaster)}.
     *
     * <p>
     * Test method for
     * {@link java.awt.image.AffineTransformOp#filter(java.awt.image.Raster, java.awt.image.WritableRaster) public final
     * java.awt.image.WritableRaster
     * java.awt.image.AffineTransformOp.filter(java.awt.image.Raster,java.awt.image.WritableRaster)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.AffineTransformOp#filter(java.awt.image.Raster, java.awt.image.WritableRaster) public final
     *      java.awt.image.WritableRaster
     *      java.awt.image.AffineTransformOp.filter(java.awt.image.Raster,java.awt.image.WritableRaster) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_filter_Raster_WritableRaster()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.AffineTransformOp#getPoint2D(java.awt.geom.Point2D, java.awt.geom.Point2D)
     * public final java.awt.geom.Point2D
     * java.awt.image.AffineTransformOp.getPoint2D(java.awt.geom.Point2D,java.awt.geom.Point2D)}.
     *
     * <p>
     * Test method for {@link java.awt.image.AffineTransformOp#getPoint2D(java.awt.geom.Point2D, java.awt.geom.Point2D)
     * public final java.awt.geom.Point2D
     * java.awt.image.AffineTransformOp.getPoint2D(java.awt.geom.Point2D,java.awt.geom.Point2D)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.AffineTransformOp#getPoint2D(java.awt.geom.Point2D, java.awt.geom.Point2D) public final
     *      java.awt.geom.Point2D
     *      java.awt.image.AffineTransformOp.getPoint2D(java.awt.geom.Point2D,java.awt.geom.Point2D) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getPoint2D_Point2D_Point2D()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.image.AffineTransformOp#createCompatibleDestImage(java.awt.image.BufferedImage, java.awt.image.ColorModel)
     * public java.awt.image.BufferedImage
     * java.awt.image.AffineTransformOp.createCompatibleDestImage(java.awt.image.BufferedImage,java.awt.image.ColorModel)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.awt.image.AffineTransformOp#createCompatibleDestImage(java.awt.image.BufferedImage, java.awt.image.ColorModel)
     * public java.awt.image.BufferedImage
     * java.awt.image.AffineTransformOp.createCompatibleDestImage(java.awt.image.BufferedImage,java.awt.image.ColorModel)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.AffineTransformOp#createCompatibleDestImage(java.awt.image.BufferedImage,
     *      java.awt.image.ColorModel) public java.awt.image.BufferedImage
     *      java.awt.image.AffineTransformOp.createCompatibleDestImage(java.awt.image.BufferedImage,java.awt.image.
     *      ColorModel) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_createCompatibleDestImage_BufferedImage_ColorModel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.AffineTransformOp#createCompatibleDestRaster(java.awt.image.Raster) public
     * java.awt.image.WritableRaster java.awt.image.AffineTransformOp.createCompatibleDestRaster(java.awt.image.Raster)}
     * .
     *
     * <p>
     * Test method for {@link java.awt.image.AffineTransformOp#createCompatibleDestRaster(java.awt.image.Raster) public
     * java.awt.image.WritableRaster java.awt.image.AffineTransformOp.createCompatibleDestRaster(java.awt.image.Raster)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.AffineTransformOp#createCompatibleDestRaster(java.awt.image.Raster) public
     *      java.awt.image.WritableRaster
     *      java.awt.image.AffineTransformOp.createCompatibleDestRaster(java.awt.image.Raster) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_createCompatibleDestRaster_Raster()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.AffineTransformOp#getBounds2D(java.awt.image.BufferedImage) public final
     * java.awt.geom.Rectangle2D java.awt.image.AffineTransformOp.getBounds2D(java.awt.image.BufferedImage)}.
     *
     * <p>
     * Test method for {@link java.awt.image.AffineTransformOp#getBounds2D(java.awt.image.BufferedImage) public final
     * java.awt.geom.Rectangle2D java.awt.image.AffineTransformOp.getBounds2D(java.awt.image.BufferedImage)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.AffineTransformOp#getBounds2D(java.awt.image.BufferedImage) public final
     *      java.awt.geom.Rectangle2D java.awt.image.AffineTransformOp.getBounds2D(java.awt.image.BufferedImage) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getBounds2D_BufferedImage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.AffineTransformOp#getBounds2D(java.awt.image.Raster) public final
     * java.awt.geom.Rectangle2D java.awt.image.AffineTransformOp.getBounds2D(java.awt.image.Raster)}.
     *
     * <p>
     * Test method for {@link java.awt.image.AffineTransformOp#getBounds2D(java.awt.image.Raster) public final
     * java.awt.geom.Rectangle2D java.awt.image.AffineTransformOp.getBounds2D(java.awt.image.Raster)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.AffineTransformOp#getBounds2D(java.awt.image.Raster) public final java.awt.geom.Rectangle2D
     *      java.awt.image.AffineTransformOp.getBounds2D(java.awt.image.Raster) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getBounds2D_Raster()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.AffineTransformOp#getRenderingHints() public final java.awt.RenderingHints
     * java.awt.image.AffineTransformOp.getRenderingHints()}.
     *
     * <p>
     * Test method for {@link java.awt.image.AffineTransformOp#getRenderingHints() public final java.awt.RenderingHints
     * java.awt.image.AffineTransformOp.getRenderingHints()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.AffineTransformOp#getRenderingHints() public final java.awt.RenderingHints
     *      java.awt.image.AffineTransformOp.getRenderingHints() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getRenderingHints()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.AffineTransformOp#getTransform() public final java.awt.geom.AffineTransform
     * java.awt.image.AffineTransformOp.getTransform()}.
     *
     * <p>
     * Test method for {@link java.awt.image.AffineTransformOp#getTransform() public final java.awt.geom.AffineTransform
     * java.awt.image.AffineTransformOp.getTransform()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.AffineTransformOp#getTransform() public final java.awt.geom.AffineTransform
     *      java.awt.image.AffineTransformOp.getTransform() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTransform()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.AffineTransformOp#getInterpolationType() public final int
     * java.awt.image.AffineTransformOp.getInterpolationType()}.
     *
     * <p>
     * Test method for {@link java.awt.image.AffineTransformOp#getInterpolationType() public final int
     * java.awt.image.AffineTransformOp.getInterpolationType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.AffineTransformOp#getInterpolationType() public final int
     *      java.awt.image.AffineTransformOp.getInterpolationType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInterpolationType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
