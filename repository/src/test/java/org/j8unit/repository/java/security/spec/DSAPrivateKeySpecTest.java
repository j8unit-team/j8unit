package org.j8unit.repository.java.security.spec;

import java.security.spec.DSAPrivateKeySpec;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DSAPrivateKeySpec} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.security.spec.DSAPrivateKeySpecTests}).
 */
@RunWith(J8Unit4.class)
public class DSAPrivateKeySpecTest
implements DSAPrivateKeySpecTests<DSAPrivateKeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.spec.DSAPrivateKeySpec]

    @Override
    public DSAPrivateKeySpec createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.spec.DSAPrivateKeySpec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.spec.DSAPrivateKeySpec]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.spec.DSAPrivateKeySpec]

}
