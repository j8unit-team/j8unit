package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccountLockedExceptionTest
implements org.j8unit.repository.javax.security.auth.login.AccountLockedExceptionTests<javax.security.auth.login.AccountLockedException> {

    @Override
    public javax.security.auth.login.AccountLockedException createNewSUT() {
        return new javax.security.auth.login.AccountLockedException();
    }

}
