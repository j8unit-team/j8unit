package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServantLocatorOperationsClassTest
implements org.j8unit.repository.org.omg.PortableServer.ServantLocatorOperationsClassTests<org.omg.PortableServer.ServantLocatorOperations> {

    @Override
    public Class<org.omg.PortableServer.ServantLocatorOperations> createNewSUT() {
        return org.omg.PortableServer.ServantLocatorOperations.class;
    }

}
