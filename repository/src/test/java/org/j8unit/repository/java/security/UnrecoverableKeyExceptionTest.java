package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnrecoverableKeyExceptionTest
implements org.j8unit.repository.java.security.UnrecoverableKeyExceptionTests<java.security.UnrecoverableKeyException> {

    @Override
    public java.security.UnrecoverableKeyException createNewSUT() {
        return new java.security.UnrecoverableKeyException();
    }

}
