package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.KeyManagerFactorySpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link KeyManagerFactorySpi} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.KeyManagerFactorySpiTests}).
 */

@RunWith(J8Unit4.class)
public class KeyManagerFactorySpiTest
implements KeyManagerFactorySpiTests<KeyManagerFactorySpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.KeyManagerFactorySpi]

    @Override
    public KeyManagerFactorySpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.KeyManagerFactorySpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.KeyManagerFactorySpi]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.KeyManagerFactorySpi]

}
