package org.j8unit.repository.java.util.prefs;

import java.util.prefs.PreferencesFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PreferencesFactory} (by simply
 * reusing the J8Unit test interface {@link PreferencesFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class PreferencesFactoryTest
implements PreferencesFactoryTests<PreferencesFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.prefs.PreferencesFactory]

    @Override
    public PreferencesFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.prefs.PreferencesFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.prefs.PreferencesFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.prefs.PreferencesFactory]

}
