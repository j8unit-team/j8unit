package org.j8unit.repository.java.security;

import java.security.KeyStoreSpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link KeyStoreSpi} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.KeyStoreSpiTests}).
 */
@RunWith(J8Unit4.class)
public class KeyStoreSpiTest
implements KeyStoreSpiTests<KeyStoreSpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.KeyStoreSpi]

    @Override
    public KeyStoreSpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.KeyStoreSpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.KeyStoreSpi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.KeyStoreSpi]

}
