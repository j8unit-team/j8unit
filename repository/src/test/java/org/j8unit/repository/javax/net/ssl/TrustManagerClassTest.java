package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.TrustManager;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TrustManager} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.TrustManagerClassTests}).
 */
@RunWith(J8Unit4.class)
public class TrustManagerClassTest
implements TrustManagerClassTests<TrustManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.TrustManager]

    @Override
    public Class<TrustManager> createNewSUT() {
        return TrustManager.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.TrustManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.TrustManager]

}
