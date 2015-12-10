package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RSAPublicKeySpecTest
implements org.j8unit.repository.java.security.spec.RSAPublicKeySpecTests<java.security.spec.RSAPublicKeySpec> {

    @Override
    public java.security.spec.RSAPublicKeySpec createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.security.spec.RSAPublicKeySpec] available.");
    }

}
