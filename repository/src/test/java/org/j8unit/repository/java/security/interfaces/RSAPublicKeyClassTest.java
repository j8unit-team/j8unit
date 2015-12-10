package org.j8unit.repository.java.security.interfaces;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RSAPublicKeyClassTest
implements org.j8unit.repository.java.security.interfaces.RSAPublicKeyClassTests<java.security.interfaces.RSAPublicKey> {

    @Override
    public Class<java.security.interfaces.RSAPublicKey> createNewSUT() {
        return java.security.interfaces.RSAPublicKey.class;
    }

}
