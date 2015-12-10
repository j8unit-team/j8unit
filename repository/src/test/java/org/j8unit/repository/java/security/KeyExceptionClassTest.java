package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyExceptionClassTest
implements org.j8unit.repository.java.security.KeyExceptionClassTests<java.security.KeyException> {

    @Override
    public Class<java.security.KeyException> createNewSUT() {
        return java.security.KeyException.class;
    }

}
