package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidKeyExceptionClassTest
implements org.j8unit.repository.java.security.InvalidKeyExceptionClassTests<java.security.InvalidKeyException> {

    @Override
    public Class<java.security.InvalidKeyException> createNewSUT() {
        return java.security.InvalidKeyException.class;
    }

}
