package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMISocketFactoryClassTest
implements org.j8unit.repository.java.rmi.server.RMISocketFactoryClassTests<java.rmi.server.RMISocketFactory> {

    @Override
    public Class<java.rmi.server.RMISocketFactory> createNewSUT() {
        return java.rmi.server.RMISocketFactory.class;
    }

}
