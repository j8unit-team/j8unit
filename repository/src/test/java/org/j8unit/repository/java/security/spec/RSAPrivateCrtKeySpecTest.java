package org.j8unit.repository.java.security.spec;

import java.security.spec.RSAPrivateCrtKeySpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RSAPrivateCrtKeySpecTest
implements org.j8unit.repository.java.security.spec.RSAPrivateCrtKeySpecTests<RSAPrivateCrtKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.RSAPrivateCrtKeySpec]

    @Override
    public RSAPrivateCrtKeySpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.spec.RSAPrivateCrtKeySpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.RSAPrivateCrtKeySpec]

}
