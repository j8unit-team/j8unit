package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CredentialExpiredExceptionTest
implements org.j8unit.repository.javax.security.auth.login.CredentialExpiredExceptionTests<javax.security.auth.login.CredentialExpiredException> {

    @Override
    public javax.security.auth.login.CredentialExpiredException createNewSUT() {
        return new javax.security.auth.login.CredentialExpiredException();
    }

}
