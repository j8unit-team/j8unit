package org.j8unit.repository.java.security.interfaces;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DSAPrivateKeyClassTest
implements org.j8unit.repository.java.security.interfaces.DSAPrivateKeyClassTests<java.security.interfaces.DSAPrivateKey> {

    @Override
    public Class<java.security.interfaces.DSAPrivateKey> createNewSUT() {
        return java.security.interfaces.DSAPrivateKey.class;
    }

}
