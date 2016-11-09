package org.j8unit.repository.java.util.prefs;

import java.util.prefs.Preferences;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Preferences} (by simply reusing the
 * J8Unit test interface {@link PreferencesClassTests}).
 */

@RunWith(J8Unit4.class)
public class PreferencesClassTest
implements PreferencesClassTests<Preferences> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.prefs.Preferences]

    @Override
    public Class<Preferences> createNewSUT() {
        return Preferences.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.prefs.Preferences#importPreferences(java.io.InputStream) public static void
     * java.util.prefs.Preferences.importPreferences(java.io.InputStream) throws
     * java.io.IOException,java.util.prefs.InvalidPreferencesFormatException}.
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
    public void test_importPreferences_InputStream()
    throws Exception {
        // write some test for {@link java.util.prefs.Preferences#importPreferences(java.io.InputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.prefs.Preferences#userNodeForPackage(Class) public static java.util.prefs.Preferences
     * java.util.prefs.Preferences.userNodeForPackage(java.lang.Class<?>)}.
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
    public void test_userNodeForPackage_Class()
    throws Exception {
        // write some test for {@link java.util.prefs.Preferences#userNodeForPackage(Class)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.prefs.Preferences#systemNodeForPackage(Class) public static java.util.prefs.Preferences
     * java.util.prefs.Preferences.systemNodeForPackage(java.lang.Class<?>)}.
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
    public void test_systemNodeForPackage_Class()
    throws Exception {
        // write some test for {@link java.util.prefs.Preferences#systemNodeForPackage(Class)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.prefs.Preferences#systemRoot() public
     * static java.util.prefs.Preferences java.util.prefs.Preferences.systemRoot()}.
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
    public void test_systemRoot()
    throws Exception {
        // write some test for {@link java.util.prefs.Preferences#systemRoot()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.prefs.Preferences#userRoot() public static
     * java.util.prefs.Preferences java.util.prefs.Preferences.userRoot()}.
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
    public void test_userRoot()
    throws Exception {
        // write some test for {@link java.util.prefs.Preferences#userRoot()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.prefs.Preferences]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.prefs.Preferences]

}
