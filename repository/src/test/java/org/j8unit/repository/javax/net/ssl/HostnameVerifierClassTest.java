package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.HostnameVerifier;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HostnameVerifierClassTest
implements org.j8unit.repository.javax.net.ssl.HostnameVerifierClassTests<HostnameVerifier> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.HostnameVerifier]

    @Override
    public Class<HostnameVerifier> createNewSUT() {
        return HostnameVerifier.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.HostnameVerifier]

}
