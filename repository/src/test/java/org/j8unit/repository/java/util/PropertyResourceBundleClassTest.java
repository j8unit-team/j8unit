package org.j8unit.repository.java.util;

import java.util.PropertyResourceBundle;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PropertyResourceBundle} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.PropertyResourceBundleClassTests}).
 */

@RunWith(J8Unit4.class)
public class PropertyResourceBundleClassTest
implements PropertyResourceBundleClassTests<PropertyResourceBundle> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.PropertyResourceBundle]

    @Override
    public Class<PropertyResourceBundle> createNewSUT() {
        return PropertyResourceBundle.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.PropertyResourceBundle#PropertyResourceBundle(java.io.Reader) public
     * java.util.PropertyResourceBundle(java.io.Reader) throws java.io.IOException}.
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
    public void create_PropertyResourceBundle_Reader()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PropertyResourceBundle sut = null; // = new PropertyResourceBundle(java.io.Reader);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.PropertyResourceBundle#PropertyResourceBundle(java.io.InputStream) public
     * java.util.PropertyResourceBundle(java.io.InputStream) throws java.io.IOException}.
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
    public void create_PropertyResourceBundle_InputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PropertyResourceBundle sut = null; // = new PropertyResourceBundle(java.io.InputStream);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.PropertyResourceBundle]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.PropertyResourceBundle]

}
