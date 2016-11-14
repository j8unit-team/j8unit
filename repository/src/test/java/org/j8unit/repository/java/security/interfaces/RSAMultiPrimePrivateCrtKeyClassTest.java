package org.j8unit.repository.java.security.interfaces;

import java.security.interfaces.RSAMultiPrimePrivateCrtKey;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RSAMultiPrimePrivateCrtKey} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.security.interfaces.RSAMultiPrimePrivateCrtKeyClassTests}).
 */

@RunWith(J8Unit4.class)
public class RSAMultiPrimePrivateCrtKeyClassTest
implements RSAMultiPrimePrivateCrtKeyClassTests<RSAMultiPrimePrivateCrtKey> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.interfaces.RSAMultiPrimePrivateCrtKey]

    @Override
    public Class<RSAMultiPrimePrivateCrtKey> createNewSUT() {
        return RSAMultiPrimePrivateCrtKey.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.interfaces.RSAMultiPrimePrivateCrtKey]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.interfaces.RSAMultiPrimePrivateCrtKey]

}
