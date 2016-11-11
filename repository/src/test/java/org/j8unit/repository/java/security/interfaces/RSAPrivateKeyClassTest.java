package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.RSAPrivateKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RSAPrivateKey} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.interfaces.RSAPrivateKeyClassTests}).
 */

@RunWith(J8Unit4.class)
public class RSAPrivateKeyClassTest
implements RSAPrivateKeyClassTests<RSAPrivateKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.interfaces.RSAPrivateKey]

    @Override
    public Class<RSAPrivateKey> createNewSUT() {
        return RSAPrivateKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.interfaces.RSAPrivateKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.interfaces.RSAPrivateKey]

}
