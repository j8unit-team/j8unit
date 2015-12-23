package org.j8unit.repository.javax.security.auth.login;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class AppConfigurationEntryTest
implements org.j8unit.repository.javax.security.auth.login.AppConfigurationEntryTests<javax.security.auth.login.AppConfigurationEntry> {

    @Override
    public javax.security.auth.login.AppConfigurationEntry createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.security.auth.login.AppConfigurationEntry] available.");
    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class LoginModuleControlFlagTest
    implements
    org.j8unit.repository.javax.security.auth.login.AppConfigurationEntryTests.LoginModuleControlFlagTests<javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag.SUFFICIENT, //
                                    javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag.REQUIRED, //
                                    javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag.REQUISITE, //
                                    javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag.OPTIONAL);
        }

        @Parameter(0)
        public javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag sut;

        @Override
        public javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag createNewSUT() {
            return this.sut;
        }

    }

}
