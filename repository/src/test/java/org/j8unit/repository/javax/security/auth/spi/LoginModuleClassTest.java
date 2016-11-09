package org.j8unit.repository.javax.security.auth.spi;

import javax.security.auth.spi.LoginModule;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LoginModule} (by simply reusing the
 * J8Unit test interface {@link LoginModuleClassTests}).
 */

@RunWith(J8Unit4.class)
public class LoginModuleClassTest
implements LoginModuleClassTests<LoginModule> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.spi.LoginModule]

    @Override
    public Class<LoginModule> createNewSUT() {
        return LoginModule.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.auth.spi.LoginModule]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.spi.LoginModule]

}
