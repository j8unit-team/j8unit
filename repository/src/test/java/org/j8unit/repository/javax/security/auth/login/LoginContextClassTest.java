package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LoginContextClassTest
implements org.j8unit.repository.javax.security.auth.login.LoginContextClassTests<javax.security.auth.login.LoginContext> {

    @Override
    public Class<javax.security.auth.login.LoginContext> createNewSUT() {
        return javax.security.auth.login.LoginContext.class;
    }

}
