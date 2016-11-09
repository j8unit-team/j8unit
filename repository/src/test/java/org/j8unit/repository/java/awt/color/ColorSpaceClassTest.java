package org.j8unit.repository.java.awt.color;

import java.awt.color.ColorSpace;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ColorSpace} (by simply reusing the J8Unit
 * test interface {@link ColorSpaceClassTests}).
 */

@RunWith(J8Unit4.class)
public class ColorSpaceClassTest
implements ColorSpaceClassTests<ColorSpace> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.color.ColorSpace]

    @Override
    public Class<ColorSpace> createNewSUT() {
        return ColorSpace.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.color.ColorSpace#getInstance(int) public
     * static java.awt.color.ColorSpace java.awt.color.ColorSpace.getInstance(int)}.
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
    public void test_getInstance_int()
    throws Exception {
        // write some test for {@link java.awt.color.ColorSpace#getInstance(int)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.color.ColorSpace]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.color.ColorSpace]

}
