package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HostnameVerifierClassTest
implements org.j8unit.repository.javax.net.ssl.HostnameVerifierClassTests<javax.net.ssl.HostnameVerifier> {

    @Override
    public Class<javax.net.ssl.HostnameVerifier> createNewSUT() {
        return javax.net.ssl.HostnameVerifier.class;
    }

}
