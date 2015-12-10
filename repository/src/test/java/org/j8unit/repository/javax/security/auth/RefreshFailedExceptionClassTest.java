package org.j8unit.repository.javax.security.auth;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RefreshFailedExceptionClassTest
implements org.j8unit.repository.javax.security.auth.RefreshFailedExceptionClassTests<javax.security.auth.RefreshFailedException> {

    @Override
    public Class<javax.security.auth.RefreshFailedException> createNewSUT() {
        return javax.security.auth.RefreshFailedException.class;
    }

}
