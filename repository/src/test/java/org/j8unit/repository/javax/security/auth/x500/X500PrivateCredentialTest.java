package org.j8unit.repository.javax.security.auth.x500;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X500PrivateCredentialTest
implements org.j8unit.repository.javax.security.auth.x500.X500PrivateCredentialTests<javax.security.auth.x500.X500PrivateCredential> {

    @Override
    public javax.security.auth.x500.X500PrivateCredential createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.security.auth.x500.X500PrivateCredential] available.");
    }

}
