package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DigestExceptionClassTest
implements org.j8unit.repository.java.security.DigestExceptionClassTests<java.security.DigestException> {

    @Override
    public Class<java.security.DigestException> createNewSUT() {
        return java.security.DigestException.class;
    }

}
