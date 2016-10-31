package org.j8unit.repository.java.security.spec;

import java.security.spec.ECPublicKeySpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ECPublicKeySpecTest
implements org.j8unit.repository.java.security.spec.ECPublicKeySpecTests<ECPublicKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.ECPublicKeySpec]

    @Override
    public ECPublicKeySpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.spec.ECPublicKeySpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.spec.ECPublicKeySpec]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.spec.ECPublicKeySpec]

}
