package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GeneralSecurityExceptionClassTest
implements org.j8unit.repository.java.security.GeneralSecurityExceptionClassTests<java.security.GeneralSecurityException> {

    @Override
    public Class<java.security.GeneralSecurityException> createNewSUT() {
        return java.security.GeneralSecurityException.class;
    }

}
