package org.j8unit.repository.java.rmi.server;

import java.rmi.server.RMIServerSocketFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIServerSocketFactoryClassTest
implements org.j8unit.repository.java.rmi.server.RMIServerSocketFactoryClassTests<RMIServerSocketFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.RMIServerSocketFactory]

    @Override
    public Class<RMIServerSocketFactory> createNewSUT() {
        return RMIServerSocketFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.server.RMIServerSocketFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.RMIServerSocketFactory]

}
