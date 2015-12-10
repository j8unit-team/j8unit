package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyStoreExceptionClassTest
implements org.j8unit.repository.java.security.KeyStoreExceptionClassTests<java.security.KeyStoreException> {

    @Override
    public Class<java.security.KeyStoreException> createNewSUT() {
        return java.security.KeyStoreException.class;
    }

}
