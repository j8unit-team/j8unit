package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DHPublicKeySpecTest
implements org.j8unit.repository.javax.crypto.spec.DHPublicKeySpecTests<javax.crypto.spec.DHPublicKeySpec> {

    @Override
    public javax.crypto.spec.DHPublicKeySpec createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.crypto.spec.DHPublicKeySpec] available.");
    }

}
