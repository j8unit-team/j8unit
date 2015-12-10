package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoSuchAlgorithmExceptionTest
implements org.j8unit.repository.java.security.NoSuchAlgorithmExceptionTests<java.security.NoSuchAlgorithmException> {

    @Override
    public java.security.NoSuchAlgorithmException createNewSUT() {
        return new java.security.NoSuchAlgorithmException();
    }

}
