package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SignerClassTest
implements org.j8unit.repository.java.security.SignerClassTests<java.security.Signer> {

    @Override
    public Class<java.security.Signer> createNewSUT() {
        return java.security.Signer.class;
    }

}
