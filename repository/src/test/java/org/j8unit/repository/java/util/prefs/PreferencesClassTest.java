package org.j8unit.repository.java.util.prefs;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PreferencesClassTest
implements org.j8unit.repository.java.util.prefs.PreferencesClassTests<java.util.prefs.Preferences> {

    @Override
    public Class<java.util.prefs.Preferences> createNewSUT() {
        return java.util.prefs.Preferences.class;
    }

}
