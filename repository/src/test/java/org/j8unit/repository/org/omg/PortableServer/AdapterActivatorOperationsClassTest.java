package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.AdapterActivatorOperations;

@RunWith(J8Unit4.class)
public class AdapterActivatorOperationsClassTest
implements org.j8unit.repository.org.omg.PortableServer.AdapterActivatorOperationsClassTests<AdapterActivatorOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.AdapterActivatorOperations]

    @Override
    public Class<AdapterActivatorOperations> createNewSUT() {
        return AdapterActivatorOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.AdapterActivatorOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.AdapterActivatorOperations]

}
