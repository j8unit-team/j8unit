package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.X509KeyManager;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link X509KeyManager} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.X509KeyManagerClassTests}).
 */
@RunWith(J8Unit4.class)
public class X509KeyManagerClassTest
implements X509KeyManagerClassTests<X509KeyManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.X509KeyManager]

    @Override
    public Class<X509KeyManager> createNewSUT() {
        return X509KeyManager.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.X509KeyManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.X509KeyManager]

}
