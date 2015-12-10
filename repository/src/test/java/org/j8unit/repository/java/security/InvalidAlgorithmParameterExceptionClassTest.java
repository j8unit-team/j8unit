package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidAlgorithmParameterExceptionClassTest
implements org.j8unit.repository.java.security.InvalidAlgorithmParameterExceptionClassTests<java.security.InvalidAlgorithmParameterException> {

    @Override
    public Class<java.security.InvalidAlgorithmParameterException> createNewSUT() {
        return java.security.InvalidAlgorithmParameterException.class;
    }

}
