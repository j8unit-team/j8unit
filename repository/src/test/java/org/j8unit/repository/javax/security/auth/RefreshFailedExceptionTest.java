package org.j8unit.repository.javax.security.auth;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RefreshFailedExceptionTest
implements org.j8unit.repository.javax.security.auth.RefreshFailedExceptionTests<javax.security.auth.RefreshFailedException> {

    @Override
    public javax.security.auth.RefreshFailedException createNewSUT() {
        return new javax.security.auth.RefreshFailedException();
    }

}
