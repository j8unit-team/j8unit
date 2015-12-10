package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CredentialExceptionClassTest
implements org.j8unit.repository.javax.security.auth.login.CredentialExceptionClassTests<javax.security.auth.login.CredentialException> {

    @Override
    public Class<javax.security.auth.login.CredentialException> createNewSUT() {
        return javax.security.auth.login.CredentialException.class;
    }

}
