package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccountExceptionTest
implements org.j8unit.repository.javax.security.auth.login.AccountExceptionTests<javax.security.auth.login.AccountException> {

    @Override
    public javax.security.auth.login.AccountException createNewSUT() {
        return new javax.security.auth.login.AccountException();
    }

}
