package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.ServantLocator;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ServantLocator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.PortableServer.ServantLocatorClassTests}).
 */

@RunWith(J8Unit4.class)
public class ServantLocatorClassTest
implements ServantLocatorClassTests<ServantLocator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.ServantLocator]

    @Override
    public Class<ServantLocator> createNewSUT() {
        return ServantLocator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.ServantLocator]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.ServantLocator]

}
