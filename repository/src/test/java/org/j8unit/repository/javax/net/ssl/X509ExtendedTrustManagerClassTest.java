package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X509ExtendedTrustManagerClassTest
implements org.j8unit.repository.javax.net.ssl.X509ExtendedTrustManagerClassTests<javax.net.ssl.X509ExtendedTrustManager> {

    @Override
    public Class<javax.net.ssl.X509ExtendedTrustManager> createNewSUT() {
        return javax.net.ssl.X509ExtendedTrustManager.class;
    }

}
