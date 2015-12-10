package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RSAPrivateCrtKeySpecTest
implements org.j8unit.repository.java.security.spec.RSAPrivateCrtKeySpecTests<java.security.spec.RSAPrivateCrtKeySpec> {

    @Override
    public java.security.spec.RSAPrivateCrtKeySpec createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.security.spec.RSAPrivateCrtKeySpec] available.");
    }

}
