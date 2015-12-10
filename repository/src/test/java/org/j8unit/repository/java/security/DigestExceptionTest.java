package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DigestExceptionTest
implements org.j8unit.repository.java.security.DigestExceptionTests<java.security.DigestException> {

    @Override
    public java.security.DigestException createNewSUT() {
        return new java.security.DigestException();
    }

}
