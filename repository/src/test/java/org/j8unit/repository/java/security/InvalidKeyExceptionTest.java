package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidKeyExceptionTest
implements org.j8unit.repository.java.security.InvalidKeyExceptionTests<java.security.InvalidKeyException> {

    @Override
    public java.security.InvalidKeyException createNewSUT() {
        return new java.security.InvalidKeyException();
    }

}
