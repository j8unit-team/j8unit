package org.j8unit.repository.javax.rmi.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SslRMIServerSocketFactoryClassTest
implements org.j8unit.repository.javax.rmi.ssl.SslRMIServerSocketFactoryClassTests<javax.rmi.ssl.SslRMIServerSocketFactory> {

    @Override
    public Class<javax.rmi.ssl.SslRMIServerSocketFactory> createNewSUT() {
        return javax.rmi.ssl.SslRMIServerSocketFactory.class;
    }

}
