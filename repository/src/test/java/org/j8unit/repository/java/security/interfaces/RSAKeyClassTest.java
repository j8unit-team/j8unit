package org.j8unit.repository.java.security.interfaces;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RSAKeyClassTest
implements org.j8unit.repository.java.security.interfaces.RSAKeyClassTests<java.security.interfaces.RSAKey> {

    @Override
    public Class<java.security.interfaces.RSAKey> createNewSUT() {
        return java.security.interfaces.RSAKey.class;
    }

}
