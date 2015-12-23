package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AppConfigurationEntryClassTest
implements org.j8unit.repository.javax.security.auth.login.AppConfigurationEntryClassTests<javax.security.auth.login.AppConfigurationEntry> {

    @Override
    public Class<javax.security.auth.login.AppConfigurationEntry> createNewSUT() {
        return javax.security.auth.login.AppConfigurationEntry.class;
    }

    @RunWith(J8Unit4.class)
    public static class LoginModuleControlFlagClassTest
    implements
    org.j8unit.repository.javax.security.auth.login.AppConfigurationEntryClassTests.LoginModuleControlFlagClassTests<javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag> {

        @Override
        public Class<javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag> createNewSUT() {
            return javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag.class;
        }

    }

}
