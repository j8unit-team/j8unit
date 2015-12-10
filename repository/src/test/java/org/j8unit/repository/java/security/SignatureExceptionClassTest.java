package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SignatureExceptionClassTest
implements org.j8unit.repository.java.security.SignatureExceptionClassTests<java.security.SignatureException> {

    @Override
    public Class<java.security.SignatureException> createNewSUT() {
        return java.security.SignatureException.class;
    }

}
