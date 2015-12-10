package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PBEKeySpecTest
implements org.j8unit.repository.javax.crypto.spec.PBEKeySpecTests<javax.crypto.spec.PBEKeySpec> {

    @Override
    public javax.crypto.spec.PBEKeySpec createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.crypto.spec.PBEKeySpec] available.");
    }

}
