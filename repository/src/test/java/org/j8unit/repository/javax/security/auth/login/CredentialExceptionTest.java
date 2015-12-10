package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CredentialExceptionTest
implements org.j8unit.repository.javax.security.auth.login.CredentialExceptionTests<javax.security.auth.login.CredentialException> {

    @Override
    public javax.security.auth.login.CredentialException createNewSUT() {
        return new javax.security.auth.login.CredentialException();
    }

}
