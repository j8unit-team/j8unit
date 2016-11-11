package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.ECPrivateKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ECPrivateKey} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.interfaces.ECPrivateKeyTests}).
 */

@RunWith(J8Unit4.class)
public class ECPrivateKeyTest
implements ECPrivateKeyTests<ECPrivateKey> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.interfaces.ECPrivateKey]

    @Override
    public ECPrivateKey createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.interfaces.ECPrivateKey], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.interfaces.ECPrivateKey]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.interfaces.ECPrivateKey]

}
