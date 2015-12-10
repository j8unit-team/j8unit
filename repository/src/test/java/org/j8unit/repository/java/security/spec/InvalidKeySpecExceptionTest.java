package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidKeySpecExceptionTest
implements org.j8unit.repository.java.security.spec.InvalidKeySpecExceptionTests<java.security.spec.InvalidKeySpecException> {

    @Override
    public java.security.spec.InvalidKeySpecException createNewSUT() {
        return new java.security.spec.InvalidKeySpecException();
    }

}
