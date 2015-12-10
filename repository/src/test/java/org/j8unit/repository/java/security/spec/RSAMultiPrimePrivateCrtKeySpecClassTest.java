package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RSAMultiPrimePrivateCrtKeySpecClassTest
implements org.j8unit.repository.java.security.spec.RSAMultiPrimePrivateCrtKeySpecClassTests<java.security.spec.RSAMultiPrimePrivateCrtKeySpec> {

    @Override
    public Class<java.security.spec.RSAMultiPrimePrivateCrtKeySpec> createNewSUT() {
        return java.security.spec.RSAMultiPrimePrivateCrtKeySpec.class;
    }

}
