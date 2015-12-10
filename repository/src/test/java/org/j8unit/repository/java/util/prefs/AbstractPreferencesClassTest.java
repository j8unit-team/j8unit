package org.j8unit.repository.java.util.prefs;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractPreferencesClassTest
implements org.j8unit.repository.java.util.prefs.AbstractPreferencesClassTests<java.util.prefs.AbstractPreferences> {

    @Override
    public Class<java.util.prefs.AbstractPreferences> createNewSUT() {
        return java.util.prefs.AbstractPreferences.class;
    }

}
