package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TrustManagerFactorySpiClassTest
implements org.j8unit.repository.javax.net.ssl.TrustManagerFactorySpiClassTests<javax.net.ssl.TrustManagerFactorySpi> {

    @Override
    public Class<javax.net.ssl.TrustManagerFactorySpi> createNewSUT() {
        return javax.net.ssl.TrustManagerFactorySpi.class;
    }

}
