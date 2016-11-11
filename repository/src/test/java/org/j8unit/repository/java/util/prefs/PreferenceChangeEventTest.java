package org.j8unit.repository.java.util.prefs;

import java.util.prefs.PreferenceChangeEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PreferenceChangeEvent} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.prefs.PreferenceChangeEventTests}).
 */

@RunWith(J8Unit4.class)
public class PreferenceChangeEventTest
implements PreferenceChangeEventTests<PreferenceChangeEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.prefs.PreferenceChangeEvent]

    @Override
    public PreferenceChangeEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.prefs.PreferenceChangeEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.prefs.PreferenceChangeEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.prefs.PreferenceChangeEvent]

}
