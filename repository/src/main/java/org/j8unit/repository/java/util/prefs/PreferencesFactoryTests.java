package org.j8unit.repository.java.util.prefs;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.prefs.PreferencesFactory interface
 * java.util.prefs.PreferencesFactory}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.util.prefs.PreferencesFactoryTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.prefs.PreferencesFactoryClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.prefs.PreferencesFactory
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PreferencesFactoryTests<SUT extends java.util.prefs.PreferencesFactory>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.prefs.PreferencesFactory#systemRoot() public abstract
     * java.util.prefs.Preferences java.util.prefs.PreferencesFactory.systemRoot()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.prefs.PreferencesFactory#systemRoot()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_systemRoot()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.prefs.PreferencesFactory#userRoot() public abstract java.util.prefs.Preferences
     * java.util.prefs.PreferencesFactory.userRoot()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.prefs.PreferencesFactory#userRoot()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_userRoot()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
