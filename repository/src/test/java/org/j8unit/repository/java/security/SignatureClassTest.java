package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SignatureClassTest
implements org.j8unit.repository.java.security.SignatureClassTests<java.security.Signature> {

    @Override
    public Class<java.security.Signature> createNewSUT() {
        return java.security.Signature.class;
    }

}
