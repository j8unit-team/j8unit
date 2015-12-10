package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServantActivatorPOAClassTest
implements org.j8unit.repository.org.omg.PortableServer.ServantActivatorPOAClassTests<org.omg.PortableServer.ServantActivatorPOA> {

    @Override
    public Class<org.omg.PortableServer.ServantActivatorPOA> createNewSUT() {
        return org.omg.PortableServer.ServantActivatorPOA.class;
    }

}
