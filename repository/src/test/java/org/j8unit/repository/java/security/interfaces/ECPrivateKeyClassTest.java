package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.ECPrivateKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ECPrivateKey} (by simply reusing the
 * J8Unit test interface {@link ECPrivateKeyClassTests}).
 */

@RunWith(J8Unit4.class)
public class ECPrivateKeyClassTest
implements ECPrivateKeyClassTests<ECPrivateKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.interfaces.ECPrivateKey]

    @Override
    public Class<ECPrivateKey> createNewSUT() {
        return ECPrivateKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.interfaces.ECPrivateKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.interfaces.ECPrivateKey]

}
