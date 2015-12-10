package org.j8unit.repository.java.security.interfaces;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RSAPrivateCrtKeyClassTest
implements org.j8unit.repository.java.security.interfaces.RSAPrivateCrtKeyClassTests<java.security.interfaces.RSAPrivateCrtKey> {

    @Override
    public Class<java.security.interfaces.RSAPrivateCrtKey> createNewSUT() {
        return java.security.interfaces.RSAPrivateCrtKey.class;
    }

}
