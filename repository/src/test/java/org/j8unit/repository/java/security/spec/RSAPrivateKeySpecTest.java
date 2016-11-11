package org.j8unit.repository.java.security.spec;

import java.security.spec.RSAPrivateKeySpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RSAPrivateKeySpec} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.security.spec.RSAPrivateKeySpecTests}).
 */

@RunWith(J8Unit4.class)
public class RSAPrivateKeySpecTest
implements RSAPrivateKeySpecTests<RSAPrivateKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.RSAPrivateKeySpec]

    @Override
    public RSAPrivateKeySpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.spec.RSAPrivateKeySpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.spec.RSAPrivateKeySpec]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.spec.RSAPrivateKeySpec]

}
