package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AppConfigurationEntryTest
implements org.j8unit.repository.javax.security.auth.login.AppConfigurationEntryTests<javax.security.auth.login.AppConfigurationEntry> {

    @RunWith(J8Unit4.class)
    public static class LoginModuleControlFlagTest
    implements
    org.j8unit.repository.javax.security.auth.login.AppConfigurationEntryTests.LoginModuleControlFlagTests<javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag> {

        @Override
        public javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag] available.");
        }

    }

    @Override
    public javax.security.auth.login.AppConfigurationEntry createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.security.auth.login.AppConfigurationEntry] available.");
    }

}
