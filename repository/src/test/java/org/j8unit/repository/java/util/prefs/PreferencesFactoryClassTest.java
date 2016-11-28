package org.j8unit.repository.java.util.prefs;

import java.util.prefs.PreferencesFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PreferencesFactory} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.prefs.PreferencesFactoryClassTests}).
 */
@RunWith(J8Unit4.class)
public class PreferencesFactoryClassTest
implements PreferencesFactoryClassTests<PreferencesFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.prefs.PreferencesFactory]

    @Override
    public Class<PreferencesFactory> createNewSUT() {
        return PreferencesFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.prefs.PreferencesFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.prefs.PreferencesFactory]

}
