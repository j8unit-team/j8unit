package org.j8unit.repository.java.awt;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.LinearGradientPaint class java.awt.LinearGradientPaint}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link LinearGradientPaintClassTests}.
 * </p>
 *
 * @see java.awt.LinearGradientPaint class java.awt.LinearGradientPaint (the hereby targeted class-under-test class)
 * @see LinearGradientPaintClassTests LinearGradientPaintClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LinearGradientPaintTests<SUT extends java.awt.LinearGradientPaint>
extends MultipleGradientPaintTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.awt.LinearGradientPaint#createContext(java.awt.image.ColorModel, java.awt.Rectangle, java.awt.geom.Rectangle2D, java.awt.geom.AffineTransform, java.awt.RenderingHints)
     * public java.awt.PaintContext
     * java.awt.LinearGradientPaint.createContext(java.awt.image.ColorModel,java.awt.Rectangle,java.awt.geom.Rectangle2D,java.awt.geom.AffineTransform,java.awt.RenderingHints)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.awt.LinearGradientPaint#createContext(java.awt.image.ColorModel, java.awt.Rectangle, java.awt.geom.Rectangle2D, java.awt.geom.AffineTransform, java.awt.RenderingHints)
     * public java.awt.PaintContext
     * java.awt.LinearGradientPaint.createContext(java.awt.image.ColorModel,java.awt.Rectangle,java.awt.geom.Rectangle2D,java.awt.geom.AffineTransform,java.awt.RenderingHints)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.LinearGradientPaint#createContext(java.awt.image.ColorModel, java.awt.Rectangle,
     *      java.awt.geom.Rectangle2D, java.awt.geom.AffineTransform, java.awt.RenderingHints) public
     *      java.awt.PaintContext
     *      java.awt.LinearGradientPaint.createContext(java.awt.image.ColorModel,java.awt.Rectangle,java.awt.geom.
     *      Rectangle2D,java.awt.geom.AffineTransform,java.awt.RenderingHints) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_createContext_ColorModel_Rectangle_Rectangle2D_AffineTransform_RenderingHints()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.LinearGradientPaint#getEndPoint() public java.awt.geom.Point2D
     * java.awt.LinearGradientPaint.getEndPoint()}.
     *
     * <p>
     * Test method for {@link java.awt.LinearGradientPaint#getEndPoint() public java.awt.geom.Point2D
     * java.awt.LinearGradientPaint.getEndPoint()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.LinearGradientPaint#getEndPoint() public java.awt.geom.Point2D
     *      java.awt.LinearGradientPaint.getEndPoint() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEndPoint()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.LinearGradientPaint#getStartPoint() public java.awt.geom.Point2D
     * java.awt.LinearGradientPaint.getStartPoint()}.
     *
     * <p>
     * Test method for {@link java.awt.LinearGradientPaint#getStartPoint() public java.awt.geom.Point2D
     * java.awt.LinearGradientPaint.getStartPoint()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.LinearGradientPaint#getStartPoint() public java.awt.geom.Point2D
     *      java.awt.LinearGradientPaint.getStartPoint() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStartPoint()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
