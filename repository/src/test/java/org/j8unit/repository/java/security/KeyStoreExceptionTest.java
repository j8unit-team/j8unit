package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyStoreExceptionTest
implements org.j8unit.repository.java.security.KeyStoreExceptionTests<java.security.KeyStoreException> {

    @Override
    public java.security.KeyStoreException createNewSUT() {
        return new java.security.KeyStoreException();
    }

}
