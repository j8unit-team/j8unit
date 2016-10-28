package org.j8unit.repository.java.awt;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DesktopClassTest
implements org.j8unit.repository.java.awt.DesktopClassTests<Desktop> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Desktop]

    @Override
    public Class<Desktop> createNewSUT() {
        return Desktop.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.Desktop#isDesktopSupported() public static
     * boolean java.awt.Desktop.isDesktopSupported()}.
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
    public void test_isDesktopSupported()
    throws Exception {
        // write some test for {@link java.awt.Desktop#isDesktopSupported()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.Desktop#getDesktop() public static
     * synchronized java.awt.Desktop java.awt.Desktop.getDesktop()}.
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
    public void test_getDesktop()
    throws Exception {
        // write some test for {@link java.awt.Desktop#getDesktop()}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Desktop]

    @RunWith(J8Unit4.class)
    public static class ActionClassTest
    implements org.j8unit.repository.java.awt.DesktopClassTests.ActionClassTests<Action> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Desktop$Action]

        @Override
        public Class<Action> createNewSUT() {
            return Action.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link java.awt.Desktop.Action#values() public static
         * java.awt.Desktop$Action[] java.awt.Desktop$Action.values()}.
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
            // write some test for {@link java.awt.Desktop.Action#values()}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link java.awt.Desktop.Action#valueOf(String) public
         * static java.awt.Desktop$Action java.awt.Desktop$Action.valueOf(java.lang.String)}.
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
            // write some test for {@link java.awt.Desktop.Action#valueOf(String)}
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Desktop$Action]

    }

}
