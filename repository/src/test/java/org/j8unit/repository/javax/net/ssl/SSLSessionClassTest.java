package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.SSLSession;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SSLSession} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.net.ssl.SSLSessionClassTests}).
 */

@RunWith(J8Unit4.class)
public class SSLSessionClassTest
implements SSLSessionClassTests<SSLSession> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.SSLSession]

    @Override
    public Class<SSLSession> createNewSUT() {
        return SSLSession.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.SSLSession]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.SSLSession]

}
