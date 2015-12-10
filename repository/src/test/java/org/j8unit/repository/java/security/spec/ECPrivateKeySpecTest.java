package org.j8unit.repository.java.security.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ECPrivateKeySpecTest
implements org.j8unit.repository.java.security.spec.ECPrivateKeySpecTests<java.security.spec.ECPrivateKeySpec> {

    @Override
    public java.security.spec.ECPrivateKeySpec createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.security.spec.ECPrivateKeySpec] available.");
    }

}
