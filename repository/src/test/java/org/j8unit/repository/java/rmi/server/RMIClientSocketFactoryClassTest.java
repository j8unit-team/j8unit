package org.j8unit.repository.java.rmi.server;

import java.rmi.server.RMIClientSocketFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIClientSocketFactoryClassTest
implements org.j8unit.repository.java.rmi.server.RMIClientSocketFactoryClassTests<RMIClientSocketFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.RMIClientSocketFactory]

    @Override
    public Class<RMIClientSocketFactory> createNewSUT() {
        return RMIClientSocketFactory.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.RMIClientSocketFactory]

}
