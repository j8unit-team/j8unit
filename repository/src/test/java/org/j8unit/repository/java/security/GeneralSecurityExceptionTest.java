package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GeneralSecurityExceptionTest
implements org.j8unit.repository.java.security.GeneralSecurityExceptionTests<java.security.GeneralSecurityException> {

    @Override
    public java.security.GeneralSecurityException createNewSUT() {
        return new java.security.GeneralSecurityException();
    }

}
