package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.AdapterActivator;

@RunWith(J8Unit4.class)
public class AdapterActivatorClassTest
implements org.j8unit.repository.org.omg.PortableServer.AdapterActivatorClassTests<AdapterActivator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.AdapterActivator]

    @Override
    public Class<AdapterActivator> createNewSUT() {
        return AdapterActivator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.AdapterActivator]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.AdapterActivator]

}
