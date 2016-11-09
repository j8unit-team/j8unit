package org.j8unit.repository.java.util.prefs;

import java.util.prefs.AbstractPreferences;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractPreferences} (by simply reusing
 * the J8Unit test interface {@link AbstractPreferencesClassTests}).
 */

@RunWith(J8Unit4.class)
public class AbstractPreferencesClassTest
implements AbstractPreferencesClassTests<AbstractPreferences> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.prefs.AbstractPreferences]

    @Override
    public Class<AbstractPreferences> createNewSUT() {
        return AbstractPreferences.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.prefs.AbstractPreferences]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.prefs.AbstractPreferences]

}
