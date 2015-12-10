package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LoginExceptionTest
implements org.j8unit.repository.javax.security.auth.login.LoginExceptionTests<javax.security.auth.login.LoginException> {

    @Override
    public javax.security.auth.login.LoginException createNewSUT() {
        return new javax.security.auth.login.LoginException();
    }

}
