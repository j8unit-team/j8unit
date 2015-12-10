package org.j8unit.repository.javax.security.auth;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DestroyFailedExceptionTest
implements org.j8unit.repository.javax.security.auth.DestroyFailedExceptionTests<javax.security.auth.DestroyFailedException> {

    @Override
    public javax.security.auth.DestroyFailedException createNewSUT() {
        return new javax.security.auth.DestroyFailedException();
    }

}
