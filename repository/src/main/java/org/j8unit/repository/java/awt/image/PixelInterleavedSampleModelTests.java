package org.j8unit.repository.java.awt.image;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.image.PixelInterleavedSampleModel class
 * java.awt.image.PixelInterleavedSampleModel}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link PixelInterleavedSampleModelClassTests}.
 * </p>
 *
 * @see java.awt.image.PixelInterleavedSampleModel class java.awt.image.PixelInterleavedSampleModel (the hereby targeted
 *      class-under-test class)
 * @see PixelInterleavedSampleModelClassTests PixelInterleavedSampleModelClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PixelInterleavedSampleModelTests<SUT extends java.awt.image.PixelInterleavedSampleModel>
extends ComponentSampleModelTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.image.PixelInterleavedSampleModel#createSubsetSampleModel(int[]) public
     * java.awt.image.SampleModel java.awt.image.PixelInterleavedSampleModel.createSubsetSampleModel(int[])}.
     *
     * <p>
     * Test method for {@link java.awt.image.PixelInterleavedSampleModel#createSubsetSampleModel(int[]) public
     * java.awt.image.SampleModel java.awt.image.PixelInterleavedSampleModel.createSubsetSampleModel(int[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.PixelInterleavedSampleModel#createSubsetSampleModel(int[]) public java.awt.image.SampleModel
     *      java.awt.image.PixelInterleavedSampleModel.createSubsetSampleModel(int[]) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
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
     * <p>
     * Test method for {@link java.awt.image.PixelInterleavedSampleModel#hashCode() public int
     * java.awt.image.PixelInterleavedSampleModel.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.PixelInterleavedSampleModel#hashCode() public int
     *      java.awt.image.PixelInterleavedSampleModel.hashCode() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.PixelInterleavedSampleModel#createCompatibleSampleModel(int, int) public
     * java.awt.image.SampleModel java.awt.image.PixelInterleavedSampleModel.createCompatibleSampleModel(int,int)}.
     *
     * <p>
     * Test method for {@link java.awt.image.PixelInterleavedSampleModel#createCompatibleSampleModel(int, int) public
     * java.awt.image.SampleModel java.awt.image.PixelInterleavedSampleModel.createCompatibleSampleModel(int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.image.PixelInterleavedSampleModel#createCompatibleSampleModel(int, int) public
     *      java.awt.image.SampleModel java.awt.image.PixelInterleavedSampleModel.createCompatibleSampleModel(int,int)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_createCompatibleSampleModel_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
