package org.j8unit.repository.javax.security.auth.login;

import java.util.Map;
import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AppConfigurationEntryClassTest
implements org.j8unit.repository.javax.security.auth.login.AppConfigurationEntryClassTests<AppConfigurationEntry> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.login.AppConfigurationEntry]

    @Override
    public Class<AppConfigurationEntry> createNewSUT() {
        return AppConfigurationEntry.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link AppConfigurationEntry#AppConfigurationEntry(String, LoginModuleControlFlag, Map) public
     * javax.security.auth.login.AppConfigurationEntry(java.lang.String,javax.security.auth.login.AppConfigurationEntry$LoginModuleControlFlag,java.util.Map<java.lang.String,
     * ?>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_AppConfigurationEntry_String_LoginModuleControlFlag_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AppConfigurationEntry sut = null; // = new AppConfigurationEntry(String, LoginModuleControlFlag, Map);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.login.AppConfigurationEntry]

    @RunWith(J8Unit4.class)
    public static class LoginModuleControlFlagClassTest
    implements org.j8unit.repository.javax.security.auth.login.AppConfigurationEntryClassTests.LoginModuleControlFlagClassTests<LoginModuleControlFlag> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.login.AppConfigurationEntry$LoginModuleControlFlag]

        @Override
        public Class<LoginModuleControlFlag> createNewSUT() {
            return LoginModuleControlFlag.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.login.AppConfigurationEntry$LoginModuleControlFlag]

    }

}
