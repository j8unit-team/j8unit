package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DigestOutputStreamClassTest
implements org.j8unit.repository.java.security.DigestOutputStreamClassTests<java.security.DigestOutputStream> {

    @Override
    public Class<java.security.DigestOutputStream> createNewSUT() {
        return java.security.DigestOutputStream.class;
    }

}
