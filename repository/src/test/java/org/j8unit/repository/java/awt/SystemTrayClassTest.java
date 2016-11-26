package org.j8unit.repository.java.awt;

import java.awt.SystemTray;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SystemTray} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.SystemTrayClassTests}).
 */
@RunWith(J8Unit4.class)
public class SystemTrayClassTest
implements SystemTrayClassTests<SystemTray> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.SystemTray]

    @Override
    public Class<SystemTray> createNewSUT() {
        return SystemTray.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.SystemTray#getSystemTray() public static
     * java.awt.SystemTray java.awt.SystemTray.getSystemTray()}.
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
    public void test_getSystemTray()
    throws Exception {
        // write some test for {@link java.awt.SystemTray#getSystemTray()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.awt.SystemTray#isSupported() public static
     * boolean java.awt.SystemTray.isSupported()}.
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
    public void test_isSupported()
    throws Exception {
        // write some test for {@link java.awt.SystemTray#isSupported()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.SystemTray]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.SystemTray]

}
