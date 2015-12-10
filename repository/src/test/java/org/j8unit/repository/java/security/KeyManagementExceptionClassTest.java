package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyManagementExceptionClassTest
implements org.j8unit.repository.java.security.KeyManagementExceptionClassTests<java.security.KeyManagementException> {

    @Override
    public Class<java.security.KeyManagementException> createNewSUT() {
        return java.security.KeyManagementException.class;
    }

}
