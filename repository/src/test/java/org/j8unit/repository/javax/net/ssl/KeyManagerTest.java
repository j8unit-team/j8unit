package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.KeyManager;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link KeyManager} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.KeyManagerTests}).
 */

@RunWith(J8Unit4.class)
public class KeyManagerTest
implements KeyManagerTests<KeyManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.net.ssl.KeyManager]

    @Override
    public KeyManager createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.net.ssl.KeyManager], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.net.ssl.KeyManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.net.ssl.KeyManager]

}
