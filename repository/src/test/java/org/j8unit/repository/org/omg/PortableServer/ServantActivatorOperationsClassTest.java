package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.ServantActivatorOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ServantActivatorOperations} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableServer.ServantActivatorOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class ServantActivatorOperationsClassTest
implements ServantActivatorOperationsClassTests<ServantActivatorOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.ServantActivatorOperations]

    @Override
    public Class<ServantActivatorOperations> createNewSUT() {
        return ServantActivatorOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.ServantActivatorOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.ServantActivatorOperations]

}
