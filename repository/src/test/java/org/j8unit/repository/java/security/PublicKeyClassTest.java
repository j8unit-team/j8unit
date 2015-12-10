package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PublicKeyClassTest
implements org.j8unit.repository.java.security.PublicKeyClassTests<java.security.PublicKey> {

    @Override
    public Class<java.security.PublicKey> createNewSUT() {
        return java.security.PublicKey.class;
    }

}
