package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyPairGeneratorSpiClassTest
implements org.j8unit.repository.java.security.KeyPairGeneratorSpiClassTests<java.security.KeyPairGeneratorSpi> {

    @Override
    public Class<java.security.KeyPairGeneratorSpi> createNewSUT() {
        return java.security.KeyPairGeneratorSpi.class;
    }

}
