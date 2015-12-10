package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RSAPrivateCrtKeySpecClassTest
implements org.j8unit.repository.java.security.spec.RSAPrivateCrtKeySpecClassTests<java.security.spec.RSAPrivateCrtKeySpec> {

    @Override
    public Class<java.security.spec.RSAPrivateCrtKeySpec> createNewSUT() {
        return java.security.spec.RSAPrivateCrtKeySpec.class;
    }

}
