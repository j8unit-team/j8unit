package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccountExpiredExceptionClassTest
implements org.j8unit.repository.javax.security.auth.login.AccountExpiredExceptionClassTests<javax.security.auth.login.AccountExpiredException> {

    @Override
    public Class<javax.security.auth.login.AccountExpiredException> createNewSUT() {
        return javax.security.auth.login.AccountExpiredException.class;
    }

}
