package org.j8unit.repository.java.util.prefs;

import java.util.prefs.PreferenceChangeListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PreferenceChangeListener} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.prefs.PreferenceChangeListenerTests}).
 */
@RunWith(J8Unit4.class)
public class PreferenceChangeListenerTest
implements PreferenceChangeListenerTests<PreferenceChangeListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.prefs.PreferenceChangeListener]

    @Override
    public PreferenceChangeListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.prefs.PreferenceChangeListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.prefs.PreferenceChangeListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.prefs.PreferenceChangeListener]

}
