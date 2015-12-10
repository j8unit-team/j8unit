package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccountNotFoundExceptionTest
implements org.j8unit.repository.javax.security.auth.login.AccountNotFoundExceptionTests<javax.security.auth.login.AccountNotFoundException> {

    @Override
    public javax.security.auth.login.AccountNotFoundException createNewSUT() {
        return new javax.security.auth.login.AccountNotFoundException();
    }

}
