package org.j8unit.repository.java.util.prefs;

import java.util.prefs.PreferenceChangeEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PreferenceChangeEvent} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.prefs.PreferenceChangeEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class PreferenceChangeEventClassTest
implements PreferenceChangeEventClassTests<PreferenceChangeEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.prefs.PreferenceChangeEvent]

    @Override
    public Class<PreferenceChangeEvent> createNewSUT() {
        return PreferenceChangeEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.prefs.PreferenceChangeEvent#PreferenceChangeEvent(java.util.prefs.Preferences, String, String)
     * public java.util.prefs.PreferenceChangeEvent(java.util.prefs.Preferences,java.lang.String,java.lang.String)}.
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
    public void create_PreferenceChangeEvent_Preferences_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PreferenceChangeEvent sut = null; // = new PreferenceChangeEvent(java.util.prefs.Preferences, String,
                                                // String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.prefs.PreferenceChangeEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.prefs.PreferenceChangeEvent]

}
