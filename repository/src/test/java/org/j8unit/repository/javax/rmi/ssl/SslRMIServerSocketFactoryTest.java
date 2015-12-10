package org.j8unit.repository.javax.rmi.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SslRMIServerSocketFactoryTest
implements org.j8unit.repository.javax.rmi.ssl.SslRMIServerSocketFactoryTests<javax.rmi.ssl.SslRMIServerSocketFactory> {

    @Override
    public javax.rmi.ssl.SslRMIServerSocketFactory createNewSUT() {
        return new javax.rmi.ssl.SslRMIServerSocketFactory();
    }

}
