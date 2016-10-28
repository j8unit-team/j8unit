package org.j8unit.repository.java.awt.image;

import static org.junit.Assert.fail;
import java.awt.color.ColorSpace;
import java.awt.image.PackedColorModel;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PackedColorModelClassTest
implements org.j8unit.repository.java.awt.image.PackedColorModelClassTests<PackedColorModel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.PackedColorModel]

    @Override
    public Class<PackedColorModel> createNewSUT() {
        return PackedColorModel.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link PackedColorModel#PackedColorModel(ColorSpace, int, int[], int, boolean, int, int) public
     * java.awt.image.PackedColorModel(java.awt.color.ColorSpace,int,int[],int,boolean,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_PackedColorModel_ColorSpace_int_intArray_int_boolean_int_int()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link PackedColorModel#PackedColorModel(ColorSpace, int, int, int, int, int, boolean, int, int) public
     * java.awt.image.PackedColorModel(java.awt.color.ColorSpace,int,int,int,int,int,boolean,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_PackedColorModel_ColorSpace_int_int_int_int_int_boolean_int_int()
    throws Exception {
        Assert.fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.PackedColorModel]

}
