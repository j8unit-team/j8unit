package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccountExpiredExceptionTest
implements org.j8unit.repository.javax.security.auth.login.AccountExpiredExceptionTests<javax.security.auth.login.AccountExpiredException> {

    @Override
    public javax.security.auth.login.AccountExpiredException createNewSUT() {
        return new javax.security.auth.login.AccountExpiredException();
    }

}
