package org.j8unit.repository.java.awt;

import java.awt.GraphicsDevice;
import java.awt.GraphicsDevice.WindowTranslucency;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GraphicsDeviceClassTest
implements org.j8unit.repository.java.awt.GraphicsDeviceClassTests<GraphicsDevice> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.GraphicsDevice]

    @Override
    public Class<GraphicsDevice> createNewSUT() {
        return GraphicsDevice.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.GraphicsDevice]

    @RunWith(J8Unit4.class)
    public static class WindowTranslucencyClassTest
    implements org.j8unit.repository.java.awt.GraphicsDeviceClassTests.WindowTranslucencyClassTests<WindowTranslucency> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.GraphicsDevice$WindowTranslucency]

        @Override
        public Class<WindowTranslucency> createNewSUT() {
            return WindowTranslucency.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.awt.GraphicsDevice.WindowTranslucency#values() public static
         * java.awt.GraphicsDevice$WindowTranslucency[] java.awt.GraphicsDevice$WindowTranslucency.values()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_values()
        throws Exception {
            // write some test for {@link java.awt.GraphicsDevice.WindowTranslucency#values()}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.awt.GraphicsDevice.WindowTranslucency#valueOf(String) public static
         * java.awt.GraphicsDevice$WindowTranslucency
         * java.awt.GraphicsDevice$WindowTranslucency.valueOf(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_valueOf_String()
        throws Exception {
            // write some test for {@link java.awt.GraphicsDevice.WindowTranslucency#valueOf(String)}
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.GraphicsDevice$WindowTranslucency]

    }

}
