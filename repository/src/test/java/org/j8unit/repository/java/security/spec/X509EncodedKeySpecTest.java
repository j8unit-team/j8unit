package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X509EncodedKeySpecTest
implements org.j8unit.repository.java.security.spec.X509EncodedKeySpecTests<java.security.spec.X509EncodedKeySpec> {

    @Override
    public java.security.spec.X509EncodedKeySpec createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.security.spec.X509EncodedKeySpec] available.");
    }

}
