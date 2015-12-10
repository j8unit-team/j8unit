package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidAlgorithmParameterExceptionTest
implements org.j8unit.repository.java.security.InvalidAlgorithmParameterExceptionTests<java.security.InvalidAlgorithmParameterException> {

    @Override
    public java.security.InvalidAlgorithmParameterException createNewSUT() {
        return new java.security.InvalidAlgorithmParameterException();
    }

}
