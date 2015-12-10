package org.j8unit.repository.java.security.interfaces;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DSAKeyPairGeneratorClassTest
implements org.j8unit.repository.java.security.interfaces.DSAKeyPairGeneratorClassTests<java.security.interfaces.DSAKeyPairGenerator> {

    @Override
    public Class<java.security.interfaces.DSAKeyPairGenerator> createNewSUT() {
        return java.security.interfaces.DSAKeyPairGenerator.class;
    }

}
