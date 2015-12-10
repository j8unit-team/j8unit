package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServantLocatorPOAClassTest
implements org.j8unit.repository.org.omg.PortableServer.ServantLocatorPOAClassTests<org.omg.PortableServer.ServantLocatorPOA> {

    @Override
    public Class<org.omg.PortableServer.ServantLocatorPOA> createNewSUT() {
        return org.omg.PortableServer.ServantLocatorPOA.class;
    }

}
