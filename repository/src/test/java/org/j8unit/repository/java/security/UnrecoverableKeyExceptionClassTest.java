package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnrecoverableKeyExceptionClassTest
implements org.j8unit.repository.java.security.UnrecoverableKeyExceptionClassTests<java.security.UnrecoverableKeyException> {

    @Override
    public Class<java.security.UnrecoverableKeyException> createNewSUT() {
        return java.security.UnrecoverableKeyException.class;
    }

}
