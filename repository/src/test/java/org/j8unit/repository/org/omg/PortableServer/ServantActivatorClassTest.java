package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.ServantActivator;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ServantActivator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.PortableServer.ServantActivatorClassTests}).
 */

@RunWith(J8Unit4.class)
public class ServantActivatorClassTest
implements ServantActivatorClassTests<ServantActivator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.ServantActivator]

    @Override
    public Class<ServantActivator> createNewSUT() {
        return ServantActivator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.ServantActivator]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.ServantActivator]

}
