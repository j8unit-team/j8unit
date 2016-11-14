package org.j8unit.repository.javax.security.auth.login;

import javax.security.auth.login.ConfigurationSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ConfigurationSpi} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.security.auth.login.ConfigurationSpiTests}).
 */

@RunWith(J8Unit4.class)
public class ConfigurationSpiTest
implements ConfigurationSpiTests<ConfigurationSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.login.ConfigurationSpi]

    @Override
    public ConfigurationSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.security.auth.login.ConfigurationSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.login.ConfigurationSpi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.login.ConfigurationSpi]

}
