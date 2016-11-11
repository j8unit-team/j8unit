package org.j8unit.repository.java.awt;

import java.awt.ComponentOrientation;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ComponentOrientation} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.ComponentOrientationClassTests}).
 */

@RunWith(J8Unit4.class)
public class ComponentOrientationClassTest
implements ComponentOrientationClassTests<ComponentOrientation> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.ComponentOrientation]

    @Override
    public Class<ComponentOrientation> createNewSUT() {
        return ComponentOrientation.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.awt.ComponentOrientation#getOrientation(java.util.Locale) public static java.awt.ComponentOrientation
     * java.awt.ComponentOrientation.getOrientation(java.util.Locale)}.
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
    public void test_getOrientation_Locale()
    throws Exception {
        // write some test for {@link java.awt.ComponentOrientation#getOrientation(java.util.Locale)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.awt.ComponentOrientation#getOrientation(java.util.ResourceBundle) public static
     * java.awt.ComponentOrientation java.awt.ComponentOrientation.getOrientation(java.util.ResourceBundle)}.
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
    public void test_getOrientation_ResourceBundle()
    throws Exception {
        // write some test for {@link java.awt.ComponentOrientation#getOrientation(java.util.ResourceBundle)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.ComponentOrientation]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.ComponentOrientation]

}
