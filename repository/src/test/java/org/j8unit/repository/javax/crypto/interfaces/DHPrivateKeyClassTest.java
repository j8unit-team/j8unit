package org.j8unit.repository.javax.crypto.interfaces;

import javax.crypto.interfaces.DHPrivateKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DHPrivateKey} (by simply reusing the
 * J8Unit test interface {@link DHPrivateKeyClassTests}).
 */

@RunWith(J8Unit4.class)
public class DHPrivateKeyClassTest
implements DHPrivateKeyClassTests<DHPrivateKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.interfaces.DHPrivateKey]

    @Override
    public Class<DHPrivateKey> createNewSUT() {
        return DHPrivateKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.interfaces.DHPrivateKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.interfaces.DHPrivateKey]

}
