package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConfigurationClassTest
implements org.j8unit.repository.javax.security.auth.login.ConfigurationClassTests<javax.security.auth.login.Configuration> {

    @RunWith(J8Unit4.class)
    public static class ParametersClassTest
    implements
    org.j8unit.repository.javax.security.auth.login.ConfigurationClassTests.ParametersClassTests<javax.security.auth.login.Configuration.Parameters> {

        @Override
        public Class<javax.security.auth.login.Configuration.Parameters> createNewSUT() {
            return javax.security.auth.login.Configuration.Parameters.class;
        }

    }

    @Override
    public Class<javax.security.auth.login.Configuration> createNewSUT() {
        return javax.security.auth.login.Configuration.class;
    }

}
