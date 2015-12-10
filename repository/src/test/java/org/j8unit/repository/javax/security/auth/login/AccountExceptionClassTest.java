package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccountExceptionClassTest
implements org.j8unit.repository.javax.security.auth.login.AccountExceptionClassTests<javax.security.auth.login.AccountException> {

    @Override
    public Class<javax.security.auth.login.AccountException> createNewSUT() {
        return javax.security.auth.login.AccountException.class;
    }

}
