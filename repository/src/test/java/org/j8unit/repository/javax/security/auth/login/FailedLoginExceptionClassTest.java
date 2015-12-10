package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FailedLoginExceptionClassTest
implements org.j8unit.repository.javax.security.auth.login.FailedLoginExceptionClassTests<javax.security.auth.login.FailedLoginException> {

    @Override
    public Class<javax.security.auth.login.FailedLoginException> createNewSUT() {
        return javax.security.auth.login.FailedLoginException.class;
    }

}
