package org.j8unit.repository.javax.security.auth;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DestroyFailedExceptionClassTest
implements org.j8unit.repository.javax.security.auth.DestroyFailedExceptionClassTests<javax.security.auth.DestroyFailedException> {

    @Override
    public Class<javax.security.auth.DestroyFailedException> createNewSUT() {
        return javax.security.auth.DestroyFailedException.class;
    }

}
