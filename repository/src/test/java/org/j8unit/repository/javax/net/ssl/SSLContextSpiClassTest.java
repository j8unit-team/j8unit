package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLContextSpiClassTest
implements org.j8unit.repository.javax.net.ssl.SSLContextSpiClassTests<javax.net.ssl.SSLContextSpi> {

    @Override
    public Class<javax.net.ssl.SSLContextSpi> createNewSUT() {
        return javax.net.ssl.SSLContextSpi.class;
    }

}
