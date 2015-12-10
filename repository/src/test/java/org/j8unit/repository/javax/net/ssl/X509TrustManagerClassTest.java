package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X509TrustManagerClassTest
implements org.j8unit.repository.javax.net.ssl.X509TrustManagerClassTests<javax.net.ssl.X509TrustManager> {

    @Override
    public Class<javax.net.ssl.X509TrustManager> createNewSUT() {
        return javax.net.ssl.X509TrustManager.class;
    }

}
