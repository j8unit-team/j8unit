package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ECPublicKeySpecTest
implements org.j8unit.repository.java.security.spec.ECPublicKeySpecTests<java.security.spec.ECPublicKeySpec> {

    @Override
    public java.security.spec.ECPublicKeySpec createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.security.spec.ECPublicKeySpec] available.");
    }

}
