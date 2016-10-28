package org.j8unit.repository.java.util.prefs;

import java.util.prefs.PreferenceChangeListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PreferenceChangeListenerClassTest
implements org.j8unit.repository.java.util.prefs.PreferenceChangeListenerClassTests<PreferenceChangeListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.prefs.PreferenceChangeListener]

    @Override
    public Class<PreferenceChangeListener> createNewSUT() {
        return PreferenceChangeListener.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.prefs.PreferenceChangeListener]

}
