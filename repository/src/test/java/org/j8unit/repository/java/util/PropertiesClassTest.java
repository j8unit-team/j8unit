package org.j8unit.repository.java.util;

import java.util.Properties;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Properties} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.PropertiesClassTests}).
 */
@RunWith(J8Unit4.class)
public class PropertiesClassTest
implements PropertiesClassTests<Properties> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Properties]

    @Override
    public Class<Properties> createNewSUT() {
        return Properties.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.Properties#Properties() public
     * java.util.Properties()}.
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
    public void create_Properties()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Properties sut = new Properties();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.Properties#Properties(java.util.Properties) public java.util.Properties(java.util.Properties)}.
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
    public void create_Properties_Properties()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Properties sut = null; // = new Properties(java.util.Properties);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Properties]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Properties]

}
