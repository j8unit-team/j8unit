package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CredentialExpiredExceptionClassTest
implements org.j8unit.repository.javax.security.auth.login.CredentialExpiredExceptionClassTests<javax.security.auth.login.CredentialExpiredException> {

    @Override
    public Class<javax.security.auth.login.CredentialExpiredException> createNewSUT() {
        return javax.security.auth.login.CredentialExpiredException.class;
    }

}
