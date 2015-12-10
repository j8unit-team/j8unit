package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AdapterActivatorClassTest
implements org.j8unit.repository.org.omg.PortableServer.AdapterActivatorClassTests<org.omg.PortableServer.AdapterActivator> {

    @Override
    public Class<org.omg.PortableServer.AdapterActivator> createNewSUT() {
        return org.omg.PortableServer.AdapterActivator.class;
    }

}
