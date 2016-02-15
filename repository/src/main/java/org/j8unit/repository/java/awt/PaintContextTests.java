package org.j8unit.repository.java.awt;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.PaintContext interface java.awt.PaintContext}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link PaintContextClassTests}.
 * </p>
 *
 * @see java.awt.PaintContext interface java.awt.PaintContext (the hereby targeted class-under-test class)
 * @see PaintContextClassTests PaintContextClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PaintContextTests<SUT extends java.awt.PaintContext>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.PaintContext#dispose() public abstract void java.awt.PaintContext.dispose()}.
     *
     * <p>
     * Test method for {@link java.awt.PaintContext#dispose() public abstract void java.awt.PaintContext.dispose()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.PaintContext#dispose() public abstract void java.awt.PaintContext.dispose() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dispose()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.PaintContext#getRaster(int, int, int, int) public abstract java.awt.image.Raster
     * java.awt.PaintContext.getRaster(int,int,int,int)}.
     *
     * <p>
     * Test method for {@link java.awt.PaintContext#getRaster(int, int, int, int) public abstract java.awt.image.Raster
     * java.awt.PaintContext.getRaster(int,int,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.PaintContext#getRaster(int, int, int, int) public abstract java.awt.image.Raster
     *      java.awt.PaintContext.getRaster(int,int,int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRaster_int_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.PaintContext#getColorModel() public abstract java.awt.image.ColorModel
     * java.awt.PaintContext.getColorModel()}.
     *
     * <p>
     * Test method for {@link java.awt.PaintContext#getColorModel() public abstract java.awt.image.ColorModel
     * java.awt.PaintContext.getColorModel()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.PaintContext#getColorModel() public abstract java.awt.image.ColorModel
     *      java.awt.PaintContext.getColorModel() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getColorModel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
