package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SecureRandomSpiClassTest
implements org.j8unit.repository.java.security.SecureRandomSpiClassTests<java.security.SecureRandomSpi> {

    @Override
    public Class<java.security.SecureRandomSpi> createNewSUT() {
        return java.security.SecureRandomSpi.class;
    }

}
