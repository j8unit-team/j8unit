package org.j8unit.repository.java.rmi.server;

import java.rmi.server.RMIServerSocketFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RMIServerSocketFactory} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.rmi.server.RMIServerSocketFactoryClassTests}).
 */
@RunWith(J8Unit4.class)
public class RMIServerSocketFactoryClassTest
implements RMIServerSocketFactoryClassTests<RMIServerSocketFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.RMIServerSocketFactory]

    @Override
    public Class<RMIServerSocketFactory> createNewSUT() {
        return RMIServerSocketFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.server.RMIServerSocketFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.RMIServerSocketFactory]

}
