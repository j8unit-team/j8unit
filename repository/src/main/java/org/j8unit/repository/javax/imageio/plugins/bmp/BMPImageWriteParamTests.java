package org.j8unit.repository.javax.imageio.plugins.bmp;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.imageio.plugins.bmp.BMPImageWriteParam class javax.imageio.plugins.bmp.BMPImageWriteParam},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.imageio.plugins.bmp.BMPImageWriteParamClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BMPImageWriteParamTests<SUT extends javax.imageio.plugins.bmp.BMPImageWriteParam>
extends org.j8unit.repository.javax.imageio.ImageWriteParamTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.imageio.plugins.bmp.BMPImageWriteParam#setTopDown(boolean) public void javax.imageio.plugins.bmp.BMPImageWriteParam.setTopDown(boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setTopDown_boolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.imageio.plugins.bmp.BMPImageWriteParam#isTopDown() public boolean javax.imageio.plugins.bmp.BMPImageWriteParam.isTopDown()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isTopDown() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
