package org.j8unit.repository.javax.net.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SSLServerSocketFactoryClassTest
implements org.j8unit.repository.javax.net.ssl.SSLServerSocketFactoryClassTests<javax.net.ssl.SSLServerSocketFactory> {

    @Override
    public Class<javax.net.ssl.SSLServerSocketFactory> createNewSUT() {
        return javax.net.ssl.SSLServerSocketFactory.class;
    }

}