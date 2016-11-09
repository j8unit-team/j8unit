package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.KeyManager;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link KeyManager} (by simply reusing the J8Unit
 * test interface {@link KeyManagerClassTests}).
 */

@RunWith(J8Unit4.class)
public class KeyManagerClassTest
implements KeyManagerClassTests<KeyManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.KeyManager]

    @Override
    public Class<KeyManager> createNewSUT() {
        return KeyManager.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.KeyManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.KeyManager]

}
