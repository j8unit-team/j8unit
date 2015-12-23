package org.j8unit.repository.javax.imageio.plugins.bmp;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.imageio.plugins.bmp.BMPImageWriteParam class
 * javax.imageio.plugins.bmp.BMPImageWriteParam}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.imageio.plugins.bmp.BMPImageWriteParamTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.imageio.plugins.bmp.BMPImageWriteParamClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.imageio.plugins.bmp.BMPImageWriteParam
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BMPImageWriteParamTests<SUT extends javax.imageio.plugins.bmp.BMPImageWriteParam>
extends org.j8unit.repository.javax.imageio.ImageWriteParamTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.imageio.plugins.bmp.BMPImageWriteParam#isTopDown() public boolean
     * javax.imageio.plugins.bmp.BMPImageWriteParam.isTopDown()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.imageio.plugins.bmp.BMPImageWriteParam#isTopDown()
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

    /**
     * <p>
     * Test method for {@link javax.imageio.plugins.bmp.BMPImageWriteParam#setTopDown(boolean) public void
     * javax.imageio.plugins.bmp.BMPImageWriteParam.setTopDown(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.imageio.plugins.bmp.BMPImageWriteParam#setTopDown(boolean)
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

}
