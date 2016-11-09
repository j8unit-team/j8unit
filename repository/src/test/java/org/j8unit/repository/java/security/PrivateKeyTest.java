package org.j8unit.repository.java.security;

import java.security.PrivateKey;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PrivateKey} (by simply reusing the
 * J8Unit test interface {@link PrivateKeyTests}).
 */

@RunWith(J8Unit4.class)
public class PrivateKeyTest
implements PrivateKeyTests<PrivateKey> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.PrivateKey]

    @Override
    public PrivateKey createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.PrivateKey], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.PrivateKey]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.PrivateKey]

}
