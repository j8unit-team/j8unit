package org.j8unit.repository.javax.security.auth.login;

import javax.security.auth.login.Configuration;
import javax.security.auth.login.Configuration.Parameters;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Configuration} (by simply reusing the
 * J8Unit test interface {@link ConfigurationTests}).
 */

@RunWith(J8Unit4.class)
public class ConfigurationTest
implements ConfigurationTests<Configuration> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.login.Configuration]

    @Override
    public Configuration createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.security.auth.login.Configuration], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.login.Configuration]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.login.Configuration]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Parameters} (by simply reusing
     * the J8Unit test interface {@link ParametersTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ParametersTest
    implements ParametersTests<Parameters> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.login.Configuration$Parameters]

        @Override
        public Parameters createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.security.auth.login.Configuration.Parameters], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.login.Configuration$Parameters]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.login.Configuration$Parameters]

    }

}
