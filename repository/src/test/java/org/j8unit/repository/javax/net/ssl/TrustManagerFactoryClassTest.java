package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TrustManagerFactoryClassTest
implements org.j8unit.repository.javax.net.ssl.TrustManagerFactoryClassTests<javax.net.ssl.TrustManagerFactory> {

    @Override
    public Class<javax.net.ssl.TrustManagerFactory> createNewSUT() {
        return javax.net.ssl.TrustManagerFactory.class;
    }

}
