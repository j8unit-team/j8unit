package org.j8unit.repository.java.awt.image;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.awt.image.PixelInterleavedSampleModel class
 * java.awt.image.PixelInterleavedSampleModel}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.awt.image.PixelInterleavedSampleModelTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.awt.image.PixelInterleavedSampleModelClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.awt.image.PixelInterleavedSampleModel
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PixelInterleavedSampleModelTests<SUT extends java.awt.image.PixelInterleavedSampleModel>
extends org.j8unit.repository.java.awt.image.ComponentSampleModelTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.image.PixelInterleavedSampleModel#createCompatibleSampleModel(int, int) public
     * java.awt.image.SampleModel java.awt.image.PixelInterleavedSampleModel.createCompatibleSampleModel(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.image.PixelInterleavedSampleModel#createCompatibleSampleModel(int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createCompatibleSampleModel_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.PixelInterleavedSampleModel#createSubsetSampleModel(int[]) public
     * java.awt.image.SampleModel java.awt.image.PixelInterleavedSampleModel.createSubsetSampleModel(int[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.image.PixelInterleavedSampleModel#createSubsetSampleModel(int[])
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createSubsetSampleModel_intArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.PixelInterleavedSampleModel#hashCode() public int
     * java.awt.image.PixelInterleavedSampleModel.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.awt.image.PixelInterleavedSampleModel#hashCode()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
