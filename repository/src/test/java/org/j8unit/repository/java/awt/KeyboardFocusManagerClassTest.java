package org.j8unit.repository.java.awt;

import static org.junit.Assert.fail;
import java.awt.KeyboardFocusManager;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link KeyboardFocusManager} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.KeyboardFocusManagerClassTests}).
 */

@RunWith(J8Unit4.class)
public class KeyboardFocusManagerClassTest
implements KeyboardFocusManagerClassTests<KeyboardFocusManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.KeyboardFocusManager]

    @Override
    public Class<KeyboardFocusManager> createNewSUT() {
        return KeyboardFocusManager.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.KeyboardFocusManager#KeyboardFocusManager() public java.awt.KeyboardFocusManager()}.
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
    public void create_KeyboardFocusManager()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.awt.KeyboardFocusManager#getCurrentKeyboardFocusManager() public static java.awt.KeyboardFocusManager
     * java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager()}.
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
    public void test_getCurrentKeyboardFocusManager()
    throws Exception {
        // write some test for {@link java.awt.KeyboardFocusManager#getCurrentKeyboardFocusManager()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.awt.KeyboardFocusManager#setCurrentKeyboardFocusManager(java.awt.KeyboardFocusManager) public static
     * void java.awt.KeyboardFocusManager.setCurrentKeyboardFocusManager(java.awt.KeyboardFocusManager) throws
     * java.lang.SecurityException}.
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
    public void test_setCurrentKeyboardFocusManager_KeyboardFocusManager()
    throws Exception {
        // write some test for {@link
        // java.awt.KeyboardFocusManager#setCurrentKeyboardFocusManager(java.awt.KeyboardFocusManager)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.KeyboardFocusManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.KeyboardFocusManager]

}
