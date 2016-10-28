package org.j8unit.repository.java.security.spec;

import java.security.spec.X509EncodedKeySpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X509EncodedKeySpecTest
implements org.j8unit.repository.java.security.spec.X509EncodedKeySpecTests<X509EncodedKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.X509EncodedKeySpec]

    @Override
    public X509EncodedKeySpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.spec.X509EncodedKeySpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.X509EncodedKeySpec]

}
