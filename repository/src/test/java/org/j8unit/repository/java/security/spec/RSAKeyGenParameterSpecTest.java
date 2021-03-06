package org.j8unit.repository.java.security.spec;

import java.security.spec.RSAKeyGenParameterSpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RSAKeyGenParameterSpec} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.security.spec.RSAKeyGenParameterSpecTests}).
 */
@RunWith(J8Unit4.class)
public class RSAKeyGenParameterSpecTest
implements RSAKeyGenParameterSpecTests<RSAKeyGenParameterSpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.RSAKeyGenParameterSpec]

    @Override
    public RSAKeyGenParameterSpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.spec.RSAKeyGenParameterSpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.spec.RSAKeyGenParameterSpec]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.spec.RSAKeyGenParameterSpec]

}
