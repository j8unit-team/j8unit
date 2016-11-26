package org.j8unit.repository.java.awt;

import java.awt.AlphaComposite;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AlphaComposite} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.AlphaCompositeClassTests}).
 */
@RunWith(J8Unit4.class)
public class AlphaCompositeClassTest
implements AlphaCompositeClassTests<AlphaComposite> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.AlphaComposite]

    @Override
    public Class<AlphaComposite> createNewSUT() {
        return AlphaComposite.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.AlphaComposite#getInstance(int) public
     * static java.awt.AlphaComposite java.awt.AlphaComposite.getInstance(int)}.
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
        // write some test for {@link java.awt.AlphaComposite#getInstance(int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.AlphaComposite#getInstance(int, float)
     * public static java.awt.AlphaComposite java.awt.AlphaComposite.getInstance(int,float)}.
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
    public void test_getInstance_int_float()
    throws Exception {
        // write some test for {@link java.awt.AlphaComposite#getInstance(int, float)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.AlphaComposite]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.AlphaComposite]

}
