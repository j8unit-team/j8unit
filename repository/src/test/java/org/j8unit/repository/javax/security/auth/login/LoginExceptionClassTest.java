package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LoginExceptionClassTest
implements org.j8unit.repository.javax.security.auth.login.LoginExceptionClassTests<javax.security.auth.login.LoginException> {

    @Override
    public Class<javax.security.auth.login.LoginException> createNewSUT() {
        return javax.security.auth.login.LoginException.class;
    }

}
