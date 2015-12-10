package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServantActivatorOperationsClassTest
implements org.j8unit.repository.org.omg.PortableServer.ServantActivatorOperationsClassTests<org.omg.PortableServer.ServantActivatorOperations> {

    @Override
    public Class<org.omg.PortableServer.ServantActivatorOperations> createNewSUT() {
        return org.omg.PortableServer.ServantActivatorOperations.class;
    }

}
