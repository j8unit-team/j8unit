package org.j8unit.repository.javax.rmi.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SslRMIClientSocketFactoryTest
implements org.j8unit.repository.javax.rmi.ssl.SslRMIClientSocketFactoryTests<javax.rmi.ssl.SslRMIClientSocketFactory> {

    @Override
    public javax.rmi.ssl.SslRMIClientSocketFactory createNewSUT() {
        return new javax.rmi.ssl.SslRMIClientSocketFactory();
    }

}
