package org.j8unit.repository.javax.rmi.ssl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SslRMIClientSocketFactoryClassTest
implements org.j8unit.repository.javax.rmi.ssl.SslRMIClientSocketFactoryClassTests<javax.rmi.ssl.SslRMIClientSocketFactory> {

    @Override
    public Class<javax.rmi.ssl.SslRMIClientSocketFactory> createNewSUT() {
        return javax.rmi.ssl.SslRMIClientSocketFactory.class;
    }

}
