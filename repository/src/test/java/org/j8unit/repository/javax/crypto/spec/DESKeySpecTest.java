package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DESKeySpecTest
implements org.j8unit.repository.javax.crypto.spec.DESKeySpecTests<javax.crypto.spec.DESKeySpec> {

    @Override
    public javax.crypto.spec.DESKeySpec createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.crypto.spec.DESKeySpec] available.");
    }

}
