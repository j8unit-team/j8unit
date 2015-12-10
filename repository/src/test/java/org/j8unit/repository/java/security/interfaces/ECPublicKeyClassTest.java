package org.j8unit.repository.java.security.interfaces;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ECPublicKeyClassTest
implements org.j8unit.repository.java.security.interfaces.ECPublicKeyClassTests<java.security.interfaces.ECPublicKey> {

    @Override
    public Class<java.security.interfaces.ECPublicKey> createNewSUT() {
        return java.security.interfaces.ECPublicKey.class;
    }

}
