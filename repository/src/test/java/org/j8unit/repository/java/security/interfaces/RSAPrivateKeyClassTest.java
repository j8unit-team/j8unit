package org.j8unit.repository.java.security.interfaces;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RSAPrivateKeyClassTest
implements org.j8unit.repository.java.security.interfaces.RSAPrivateKeyClassTests<java.security.interfaces.RSAPrivateKey> {

    @Override
    public Class<java.security.interfaces.RSAPrivateKey> createNewSUT() {
        return java.security.interfaces.RSAPrivateKey.class;
    }

}
