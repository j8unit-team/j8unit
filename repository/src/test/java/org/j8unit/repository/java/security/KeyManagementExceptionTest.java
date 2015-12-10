package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyManagementExceptionTest
implements org.j8unit.repository.java.security.KeyManagementExceptionTests<java.security.KeyManagementException> {

    @Override
    public java.security.KeyManagementException createNewSUT() {
        return new java.security.KeyManagementException();
    }

}
