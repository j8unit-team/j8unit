package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.X509TrustManager;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link X509TrustManager} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.X509TrustManagerClassTests}).
 */

@RunWith(J8Unit4.class)
public class X509TrustManagerClassTest
implements X509TrustManagerClassTests<X509TrustManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.X509TrustManager]

    @Override
    public Class<X509TrustManager> createNewSUT() {
        return X509TrustManager.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.X509TrustManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.X509TrustManager]

}
