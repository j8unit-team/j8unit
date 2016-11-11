package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.RSAKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RSAKey} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.security.interfaces.RSAKeyClassTests}).
 */

@RunWith(J8Unit4.class)
public class RSAKeyClassTest
implements RSAKeyClassTests<RSAKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.interfaces.RSAKey]

    @Override
    public Class<RSAKey> createNewSUT() {
        return RSAKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.interfaces.RSAKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.interfaces.RSAKey]

}
