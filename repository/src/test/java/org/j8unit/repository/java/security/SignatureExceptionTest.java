package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SignatureExceptionTest
implements org.j8unit.repository.java.security.SignatureExceptionTests<java.security.SignatureException> {

    @Override
    public java.security.SignatureException createNewSUT() {
        return new java.security.SignatureException();
    }

}
