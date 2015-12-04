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
 * Test class for {@link java.util.prefs.PreferenceChangeListener interface java.util.prefs.PreferenceChangeListener},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.prefs.PreferenceChangeListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PreferenceChangeListenerTests<SUT extends java.util.prefs.PreferenceChangeListener>
extends org.j8unit.repository.java.util.EventListenerTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.util.prefs.PreferenceChangeListener#preferenceChange(java.util.prefs.PreferenceChangeEvent) public abstract void java.util.prefs.PreferenceChangeListener.preferenceChange(java.util.prefs.PreferenceChangeEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_preferenceChange_PreferenceChangeEvent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
