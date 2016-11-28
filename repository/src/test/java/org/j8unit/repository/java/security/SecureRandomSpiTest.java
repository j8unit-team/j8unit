package org.j8unit.repository.java.security;

import java.security.SecureRandomSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SecureRandomSpi} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.security.SecureRandomSpiTests}).
 */
@RunWith(J8Unit4.class)
public class SecureRandomSpiTest
implements SecureRandomSpiTests<SecureRandomSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.SecureRandomSpi]

    @Override
    public SecureRandomSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.SecureRandomSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.SecureRandomSpi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.SecureRandomSpi]

}
