package org.j8unit.repository.java.util.prefs;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PreferenceChangeEventClassTest
implements org.j8unit.repository.java.util.prefs.PreferenceChangeEventClassTests<java.util.prefs.PreferenceChangeEvent> {

    @Override
    public Class<java.util.prefs.PreferenceChangeEvent> createNewSUT() {
        return java.util.prefs.PreferenceChangeEvent.class;
    }

}
