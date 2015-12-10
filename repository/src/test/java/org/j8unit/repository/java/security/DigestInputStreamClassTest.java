package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DigestInputStreamClassTest
implements org.j8unit.repository.java.security.DigestInputStreamClassTests<java.security.DigestInputStream> {

    @Override
    public Class<java.security.DigestInputStream> createNewSUT() {
        return java.security.DigestInputStream.class;
    }

}
