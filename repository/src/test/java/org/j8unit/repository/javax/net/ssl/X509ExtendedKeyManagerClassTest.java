package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.X509ExtendedKeyManager;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link X509ExtendedKeyManager} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.X509ExtendedKeyManagerClassTests}).
 */
@RunWith(J8Unit4.class)
public class X509ExtendedKeyManagerClassTest
implements X509ExtendedKeyManagerClassTests<X509ExtendedKeyManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.X509ExtendedKeyManager]

    @Override
    public Class<X509ExtendedKeyManager> createNewSUT() {
        return X509ExtendedKeyManager.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.X509ExtendedKeyManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.X509ExtendedKeyManager]

}
