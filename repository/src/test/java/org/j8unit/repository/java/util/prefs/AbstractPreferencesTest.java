package org.j8unit.repository.java.util.prefs;

import java.util.prefs.AbstractPreferences;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AbstractPreferences} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.prefs.AbstractPreferencesTests}).
 */
@RunWith(J8Unit4.class)
public class AbstractPreferencesTest
implements AbstractPreferencesTests<AbstractPreferences> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.prefs.AbstractPreferences]

    @Override
    public AbstractPreferences createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.prefs.AbstractPreferences], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.prefs.AbstractPreferences]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.prefs.AbstractPreferences]

}
