package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FailedLoginExceptionTest
implements org.j8unit.repository.javax.security.auth.login.FailedLoginExceptionTests<javax.security.auth.login.FailedLoginException> {

    @Override
    public javax.security.auth.login.FailedLoginException createNewSUT() {
        return new javax.security.auth.login.FailedLoginException();
    }

}
