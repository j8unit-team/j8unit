package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DESedeKeySpecTest
implements org.j8unit.repository.javax.crypto.spec.DESedeKeySpecTests<javax.crypto.spec.DESedeKeySpec> {

    @Override
    public javax.crypto.spec.DESedeKeySpec createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.crypto.spec.DESedeKeySpec] available.");
    }

}
