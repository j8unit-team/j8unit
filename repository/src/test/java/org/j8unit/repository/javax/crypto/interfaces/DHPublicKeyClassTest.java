package org.j8unit.repository.javax.crypto.interfaces;

import javax.crypto.interfaces.DHPublicKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DHPublicKey} (by simply reusing the
 * J8Unit test interface {@link DHPublicKeyClassTests}).
 */

@RunWith(J8Unit4.class)
public class DHPublicKeyClassTest
implements DHPublicKeyClassTests<DHPublicKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.interfaces.DHPublicKey]

    @Override
    public Class<DHPublicKey> createNewSUT() {
        return DHPublicKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.interfaces.DHPublicKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.interfaces.DHPublicKey]

}
