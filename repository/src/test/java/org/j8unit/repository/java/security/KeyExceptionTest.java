package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyExceptionTest
implements org.j8unit.repository.java.security.KeyExceptionTests<java.security.KeyException> {

    @Override
    public java.security.KeyException createNewSUT() {
        return new java.security.KeyException();
    }

}
