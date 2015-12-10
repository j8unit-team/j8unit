package org.j8unit.repository.javax.security.auth.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LoginModuleClassTest
implements org.j8unit.repository.javax.security.auth.spi.LoginModuleClassTests<javax.security.auth.spi.LoginModule> {

    @Override
    public Class<javax.security.auth.spi.LoginModule> createNewSUT() {
        return javax.security.auth.spi.LoginModule.class;
    }

}
