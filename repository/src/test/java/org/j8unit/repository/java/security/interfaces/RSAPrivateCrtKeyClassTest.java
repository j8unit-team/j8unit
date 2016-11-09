package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.RSAPrivateCrtKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RSAPrivateCrtKey} (by simply reusing the
 * J8Unit test interface {@link RSAPrivateCrtKeyClassTests}).
 */

@RunWith(J8Unit4.class)
public class RSAPrivateCrtKeyClassTest
implements RSAPrivateCrtKeyClassTests<RSAPrivateCrtKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.interfaces.RSAPrivateCrtKey]

    @Override
    public Class<RSAPrivateCrtKey> createNewSUT() {
        return RSAPrivateCrtKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.interfaces.RSAPrivateCrtKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.interfaces.RSAPrivateCrtKey]

}
