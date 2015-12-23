package org.j8unit.repository.java.awt.image;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.image.AreaAveragingScaleFilter class
 * java.awt.image.AreaAveragingScaleFilter}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.awt.image.AreaAveragingScaleFilterTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.awt.image.AreaAveragingScaleFilterClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.image.AreaAveragingScaleFilter
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AreaAveragingScaleFilterTests<SUT extends java.awt.image.AreaAveragingScaleFilter>
extends org.j8unit.repository.java.awt.image.ReplicateScaleFilterTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.image.AreaAveragingScaleFilter#setHints(int) public void
     * java.awt.image.AreaAveragingScaleFilter.setHints(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.image.AreaAveragingScaleFilter#setHints(int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_setHints_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.image.AreaAveragingScaleFilter#setPixels(int, int, int, int, java.awt.image.ColorModel, byte[], int, int)
     * public void
     * java.awt.image.AreaAveragingScaleFilter.setPixels(int,int,int,int,java.awt.image.ColorModel,byte[],int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.image.AreaAveragingScaleFilter#setPixels(int, int, int, int, java.awt.image.ColorModel,
     *             byte[], int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_setPixels_int_int_int_int_ColorModel_byteArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.image.AreaAveragingScaleFilter#setPixels(int, int, int, int, java.awt.image.ColorModel, int[], int, int)
     * public void
     * java.awt.image.AreaAveragingScaleFilter.setPixels(int,int,int,int,java.awt.image.ColorModel,int[],int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.image.AreaAveragingScaleFilter#setPixels(int, int, int, int, java.awt.image.ColorModel,
     *             int[], int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_setPixels_int_int_int_int_ColorModel_intArray_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
