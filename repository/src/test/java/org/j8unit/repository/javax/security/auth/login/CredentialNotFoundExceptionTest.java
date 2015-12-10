package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CredentialNotFoundExceptionTest
implements org.j8unit.repository.javax.security.auth.login.CredentialNotFoundExceptionTests<javax.security.auth.login.CredentialNotFoundException> {

    @Override
    public javax.security.auth.login.CredentialNotFoundException createNewSUT() {
        return new javax.security.auth.login.CredentialNotFoundException();
    }

}
