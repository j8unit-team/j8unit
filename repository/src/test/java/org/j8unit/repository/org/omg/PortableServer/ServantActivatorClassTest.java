package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServantActivatorClassTest
implements org.j8unit.repository.org.omg.PortableServer.ServantActivatorClassTests<org.omg.PortableServer.ServantActivator> {

    @Override
    public Class<org.omg.PortableServer.ServantActivator> createNewSUT() {
        return org.omg.PortableServer.ServantActivator.class;
    }

}
