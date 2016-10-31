package org.j8unit.repository.java.security.spec;

import java.security.spec.PKCS8EncodedKeySpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PKCS8EncodedKeySpecTest
implements org.j8unit.repository.java.security.spec.PKCS8EncodedKeySpecTests<PKCS8EncodedKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.PKCS8EncodedKeySpec]

    @Override
    public PKCS8EncodedKeySpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.spec.PKCS8EncodedKeySpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.spec.PKCS8EncodedKeySpec]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.spec.PKCS8EncodedKeySpec]

}
