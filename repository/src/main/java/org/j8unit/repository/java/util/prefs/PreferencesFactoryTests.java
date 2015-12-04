package org.j8unit.repository.java.util.prefs;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.prefs.PreferencesFactory interface java.util.prefs.PreferencesFactory},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.prefs.PreferencesFactoryClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PreferencesFactoryTests<SUT extends java.util.prefs.PreferencesFactory>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.util.prefs.PreferencesFactory#systemRoot() public abstract java.util.prefs.Preferences java.util.prefs.PreferencesFactory.systemRoot()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_systemRoot() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.prefs.PreferencesFactory#userRoot() public abstract java.util.prefs.Preferences java.util.prefs.PreferencesFactory.userRoot()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_userRoot() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
