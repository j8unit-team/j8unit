package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccountNotFoundExceptionClassTest
implements org.j8unit.repository.javax.security.auth.login.AccountNotFoundExceptionClassTests<javax.security.auth.login.AccountNotFoundException> {

    @Override
    public Class<javax.security.auth.login.AccountNotFoundException> createNewSUT() {
        return javax.security.auth.login.AccountNotFoundException.class;
    }

}
