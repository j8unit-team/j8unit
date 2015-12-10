package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MessageDigestSpiClassTest
implements org.j8unit.repository.java.security.MessageDigestSpiClassTests<java.security.MessageDigestSpi> {

    @Override
    public Class<java.security.MessageDigestSpi> createNewSUT() {
        return java.security.MessageDigestSpi.class;
    }

}
