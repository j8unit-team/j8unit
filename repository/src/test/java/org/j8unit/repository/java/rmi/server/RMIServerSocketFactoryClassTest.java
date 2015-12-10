package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIServerSocketFactoryClassTest
implements org.j8unit.repository.java.rmi.server.RMIServerSocketFactoryClassTests<java.rmi.server.RMIServerSocketFactory> {

    @Override
    public Class<java.rmi.server.RMIServerSocketFactory> createNewSUT() {
        return java.rmi.server.RMIServerSocketFactory.class;
    }

}
