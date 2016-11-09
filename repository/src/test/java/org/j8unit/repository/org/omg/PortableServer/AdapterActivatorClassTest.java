package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.AdapterActivator;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AdapterActivator} (by simply reusing the
 * J8Unit test interface {@link AdapterActivatorClassTests}).
 */

@RunWith(J8Unit4.class)
public class AdapterActivatorClassTest
implements AdapterActivatorClassTests<AdapterActivator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.AdapterActivator]

    @Override
    public Class<AdapterActivator> createNewSUT() {
        return AdapterActivator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.AdapterActivator]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.AdapterActivator]

}
