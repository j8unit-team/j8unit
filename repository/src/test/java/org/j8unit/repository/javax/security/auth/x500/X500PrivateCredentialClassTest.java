package org.j8unit.repository.javax.security.auth.x500;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X500PrivateCredentialClassTest
implements org.j8unit.repository.javax.security.auth.x500.X500PrivateCredentialClassTests<javax.security.auth.x500.X500PrivateCredential> {

    @Override
    public Class<javax.security.auth.x500.X500PrivateCredential> createNewSUT() {
        return javax.security.auth.x500.X500PrivateCredential.class;
    }

}
