package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrivateKeyClassTest
implements org.j8unit.repository.java.security.PrivateKeyClassTests<java.security.PrivateKey> {

    @Override
    public Class<java.security.PrivateKey> createNewSUT() {
        return java.security.PrivateKey.class;
    }

}
