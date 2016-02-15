package org.j8unit.repository.javax.imageio.plugins.bmp;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.imageio.plugins.bmp.BMPImageWriteParam class
 * javax.imageio.plugins.bmp.BMPImageWriteParam}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link BMPImageWriteParamClassTests}.
 * </p>
 *
 * @see javax.imageio.plugins.bmp.BMPImageWriteParam class javax.imageio.plugins.bmp.BMPImageWriteParam (the hereby
 *      targeted class-under-test class)
 * @see BMPImageWriteParamClassTests BMPImageWriteParamClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BMPImageWriteParamTests<SUT extends javax.imageio.plugins.bmp.BMPImageWriteParam>
extends org.j8unit.repository.javax.imageio.ImageWriteParamTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.imageio.plugins.bmp.BMPImageWriteParam#setTopDown(boolean) public void
     * javax.imageio.plugins.bmp.BMPImageWriteParam.setTopDown(boolean)}.
     *
     * <p>
     * Test method for {@link javax.imageio.plugins.bmp.BMPImageWriteParam#setTopDown(boolean) public void
     * javax.imageio.plugins.bmp.BMPImageWriteParam.setTopDown(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.imageio.plugins.bmp.BMPImageWriteParam#setTopDown(boolean) public void
     *      javax.imageio.plugins.bmp.BMPImageWriteParam.setTopDown(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setTopDown_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.plugins.bmp.BMPImageWriteParam#isTopDown() public boolean
     * javax.imageio.plugins.bmp.BMPImageWriteParam.isTopDown()}.
     *
     * <p>
     * Test method for {@link javax.imageio.plugins.bmp.BMPImageWriteParam#isTopDown() public boolean
     * javax.imageio.plugins.bmp.BMPImageWriteParam.isTopDown()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.imageio.plugins.bmp.BMPImageWriteParam#isTopDown() public boolean
     *      javax.imageio.plugins.bmp.BMPImageWriteParam.isTopDown() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isTopDown()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
