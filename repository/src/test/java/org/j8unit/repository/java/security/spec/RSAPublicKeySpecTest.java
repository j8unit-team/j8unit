package org.j8unit.repository.java.security.spec;

import java.security.spec.RSAPublicKeySpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RSAPublicKeySpec} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.security.spec.RSAPublicKeySpecTests}).
 */
@RunWith(J8Unit4.class)
public class RSAPublicKeySpecTest
implements RSAPublicKeySpecTests<RSAPublicKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.RSAPublicKeySpec]

    @Override
    public RSAPublicKeySpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.spec.RSAPublicKeySpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.spec.RSAPublicKeySpec]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.spec.RSAPublicKeySpec]

}
