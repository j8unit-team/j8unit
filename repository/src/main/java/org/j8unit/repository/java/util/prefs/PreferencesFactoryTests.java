package org.j8unit.repository.java.util.prefs;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.prefs.PreferencesFactory interface
 * java.util.prefs.PreferencesFactory}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link PreferencesFactoryClassTests}.
 * </p>
 *
 * @see java.util.prefs.PreferencesFactory interface java.util.prefs.PreferencesFactory (the hereby targeted
 *      class-under-test class)
 * @see PreferencesFactoryClassTests PreferencesFactoryClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
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
     * <p>
     * Test method for {@link java.util.prefs.PreferencesFactory#systemRoot() public abstract
     * java.util.prefs.Preferences java.util.prefs.PreferencesFactory.systemRoot()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.prefs.PreferencesFactory#systemRoot() public abstract java.util.prefs.Preferences
     *      java.util.prefs.PreferencesFactory.systemRoot() (the hereby targeted method-under-test)
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
     * <p>
     * Test method for {@link java.util.prefs.PreferencesFactory#userRoot() public abstract java.util.prefs.Preferences
     * java.util.prefs.PreferencesFactory.userRoot()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.prefs.PreferencesFactory#userRoot() public abstract java.util.prefs.Preferences
     *      java.util.prefs.PreferencesFactory.userRoot() (the hereby targeted method-under-test)
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
