package org.j8unit.repository.java.security.spec;

import java.security.spec.ECPrivateKeySpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ECPrivateKeySpecTest
implements org.j8unit.repository.java.security.spec.ECPrivateKeySpecTests<ECPrivateKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.ECPrivateKeySpec]

    @Override
    public ECPrivateKeySpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.spec.ECPrivateKeySpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.spec.ECPrivateKeySpec]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.spec.ECPrivateKeySpec]

}
