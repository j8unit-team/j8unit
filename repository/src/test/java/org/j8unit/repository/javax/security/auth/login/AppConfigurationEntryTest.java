package org.j8unit.repository.javax.security.auth.login;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AppConfigurationEntry} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.security.auth.login.AppConfigurationEntryTests}).
 */

@RunWith(J8Unit4.class)
public class AppConfigurationEntryTest
implements AppConfigurationEntryTests<AppConfigurationEntry> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.login.AppConfigurationEntry]

    @Override
    public AppConfigurationEntry createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.auth.login.AppConfigurationEntry], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.login.AppConfigurationEntry]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.login.AppConfigurationEntry]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link LoginModuleControlFlag} (by
     * simply reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.security.auth.login.AppConfigurationEntryTests.LoginModuleControlFlagTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class LoginModuleControlFlagTest
    implements LoginModuleControlFlagTests<LoginModuleControlFlag> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.auth.login.AppConfigurationEntry$LoginModuleControlFlag]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOf(LoginModuleControlFlag.SUFFICIENT, //
                                    LoginModuleControlFlag.REQUIRED, //
                                    LoginModuleControlFlag.REQUISITE, //
                                    LoginModuleControlFlag.OPTIONAL);
        }

        @Parameter(0)
        public LoginModuleControlFlag sut;

        @Override
        public LoginModuleControlFlag createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.auth.login.AppConfigurationEntry$LoginModuleControlFlag]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.auth.login.AppConfigurationEntry$LoginModuleControlFlag]

    }

}
