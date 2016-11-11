package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.HostnameVerifier;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HostnameVerifier} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.net.ssl.HostnameVerifierClassTests}).
 */

@RunWith(J8Unit4.class)
public class HostnameVerifierClassTest
implements HostnameVerifierClassTests<HostnameVerifier> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.HostnameVerifier]

    @Override
    public Class<HostnameVerifier> createNewSUT() {
        return HostnameVerifier.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.HostnameVerifier]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.HostnameVerifier]

}
