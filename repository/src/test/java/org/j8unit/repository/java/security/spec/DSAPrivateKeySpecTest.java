package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DSAPrivateKeySpecTest
implements org.j8unit.repository.java.security.spec.DSAPrivateKeySpecTests<java.security.spec.DSAPrivateKeySpec> {

    @Override
    public java.security.spec.DSAPrivateKeySpec createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.security.spec.DSAPrivateKeySpec] available.");
    }

}
