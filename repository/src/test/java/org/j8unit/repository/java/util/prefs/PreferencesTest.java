package org.j8unit.repository.java.util.prefs;

import java.util.prefs.Preferences;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Preferences} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.prefs.PreferencesTests}).
 */
@RunWith(J8Unit4.class)
public class PreferencesTest
implements PreferencesTests<Preferences> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.prefs.Preferences]

    @Override
    public Preferences createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.prefs.Preferences], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.prefs.Preferences]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.prefs.Preferences]

}
