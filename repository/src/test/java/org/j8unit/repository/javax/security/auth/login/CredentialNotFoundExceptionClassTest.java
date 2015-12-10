package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CredentialNotFoundExceptionClassTest
implements org.j8unit.repository.javax.security.auth.login.CredentialNotFoundExceptionClassTests<javax.security.auth.login.CredentialNotFoundException> {

    @Override
    public Class<javax.security.auth.login.CredentialNotFoundException> createNewSUT() {
        return javax.security.auth.login.CredentialNotFoundException.class;
    }

}
