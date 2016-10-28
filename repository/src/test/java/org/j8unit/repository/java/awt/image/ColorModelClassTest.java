package org.j8unit.repository.java.awt.image;

import static org.junit.Assert.fail;
import java.awt.image.ColorModel;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ColorModelClassTest
implements org.j8unit.repository.java.awt.image.ColorModelClassTests<ColorModel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.ColorModel]

    @Override
    public Class<ColorModel> createNewSUT() {
        return ColorModel.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.image.ColorModel#ColorModel(int)
     * public java.awt.image.ColorModel(int)}.
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
    public void create_ColorModel_int()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.image.ColorModel#getRGBdefault() public
     * static java.awt.image.ColorModel java.awt.image.ColorModel.getRGBdefault()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getRGBdefault()
    throws Exception {
        // write some test for {@link java.awt.image.ColorModel#getRGBdefault()}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.ColorModel]

}
