package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIClientSocketFactoryClassTest
implements org.j8unit.repository.java.rmi.server.RMIClientSocketFactoryClassTests<java.rmi.server.RMIClientSocketFactory> {

    @Override
    public Class<java.rmi.server.RMIClientSocketFactory> createNewSUT() {
        return java.rmi.server.RMIClientSocketFactory.class;
    }

}
