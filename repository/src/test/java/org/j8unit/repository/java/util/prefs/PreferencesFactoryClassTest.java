package org.j8unit.repository.java.util.prefs;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PreferencesFactoryClassTest
implements org.j8unit.repository.java.util.prefs.PreferencesFactoryClassTests<java.util.prefs.PreferencesFactory> {

    @Override
    public Class<java.util.prefs.PreferencesFactory> createNewSUT() {
        return java.util.prefs.PreferencesFactory.class;
    }

}
