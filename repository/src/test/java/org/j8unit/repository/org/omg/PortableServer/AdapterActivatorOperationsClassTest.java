package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AdapterActivatorOperationsClassTest
implements org.j8unit.repository.org.omg.PortableServer.AdapterActivatorOperationsClassTests<org.omg.PortableServer.AdapterActivatorOperations> {

    @Override
    public Class<org.omg.PortableServer.AdapterActivatorOperations> createNewSUT() {
        return org.omg.PortableServer.AdapterActivatorOperations.class;
    }

}
