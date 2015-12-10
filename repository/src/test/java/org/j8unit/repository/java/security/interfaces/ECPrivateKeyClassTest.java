package org.j8unit.repository.java.security.interfaces;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ECPrivateKeyClassTest
implements org.j8unit.repository.java.security.interfaces.ECPrivateKeyClassTests<java.security.interfaces.ECPrivateKey> {

    @Override
    public Class<java.security.interfaces.ECPrivateKey> createNewSUT() {
        return java.security.interfaces.ECPrivateKey.class;
    }

}
