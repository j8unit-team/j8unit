package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServantLocatorClassTest
implements org.j8unit.repository.org.omg.PortableServer.ServantLocatorClassTests<org.omg.PortableServer.ServantLocator> {

    @Override
    public Class<org.omg.PortableServer.ServantLocator> createNewSUT() {
        return org.omg.PortableServer.ServantLocator.class;
    }

}
