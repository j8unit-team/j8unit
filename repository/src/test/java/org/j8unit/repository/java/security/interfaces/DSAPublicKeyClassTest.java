package org.j8unit.repository.java.security.interfaces;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DSAPublicKeyClassTest
implements org.j8unit.repository.java.security.interfaces.DSAPublicKeyClassTests<java.security.interfaces.DSAPublicKey> {

    @Override
    public Class<java.security.interfaces.DSAPublicKey> createNewSUT() {
        return java.security.interfaces.DSAPublicKey.class;
    }

}
