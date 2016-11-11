package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.ServantLocatorOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ServantLocatorOperations} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableServer.ServantLocatorOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class ServantLocatorOperationsClassTest
implements ServantLocatorOperationsClassTests<ServantLocatorOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.ServantLocatorOperations]

    @Override
    public Class<ServantLocatorOperations> createNewSUT() {
        return ServantLocatorOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.ServantLocatorOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.ServantLocatorOperations]

}
