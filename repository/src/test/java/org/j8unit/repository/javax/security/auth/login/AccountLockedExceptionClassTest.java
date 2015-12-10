package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccountLockedExceptionClassTest
implements org.j8unit.repository.javax.security.auth.login.AccountLockedExceptionClassTests<javax.security.auth.login.AccountLockedException> {

    @Override
    public Class<javax.security.auth.login.AccountLockedException> createNewSUT() {
        return javax.security.auth.login.AccountLockedException.class;
    }

}
