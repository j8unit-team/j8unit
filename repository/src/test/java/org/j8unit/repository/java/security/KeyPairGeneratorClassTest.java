package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyPairGeneratorClassTest
implements org.j8unit.repository.java.security.KeyPairGeneratorClassTests<java.security.KeyPairGenerator> {

    @Override
    public Class<java.security.KeyPairGenerator> createNewSUT() {
        return java.security.KeyPairGenerator.class;
    }

}
