package org.j8unit.repository.java.util.prefs;

import java.util.prefs.Preferences;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PreferencesTest
implements org.j8unit.repository.java.util.prefs.PreferencesTests<Preferences> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.prefs.Preferences]

    @Override
    public Preferences createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.prefs.Preferences], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.prefs.Preferences]

}
