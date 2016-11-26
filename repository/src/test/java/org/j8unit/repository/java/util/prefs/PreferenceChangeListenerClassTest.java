package org.j8unit.repository.java.util.prefs;

import java.util.prefs.PreferenceChangeListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PreferenceChangeListener} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.prefs.PreferenceChangeListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class PreferenceChangeListenerClassTest
implements PreferenceChangeListenerClassTests<PreferenceChangeListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.prefs.PreferenceChangeListener]

    @Override
    public Class<PreferenceChangeListener> createNewSUT() {
        return PreferenceChangeListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.prefs.PreferenceChangeListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.prefs.PreferenceChangeListener]

}
