package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoSuchAlgorithmExceptionClassTest
implements org.j8unit.repository.java.security.NoSuchAlgorithmExceptionClassTests<java.security.NoSuchAlgorithmException> {

    @Override
    public Class<java.security.NoSuchAlgorithmException> createNewSUT() {
        return java.security.NoSuchAlgorithmException.class;
    }

}
