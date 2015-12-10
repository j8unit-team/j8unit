package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynamicImplementationClassTest
implements org.j8unit.repository.org.omg.PortableServer.DynamicImplementationClassTests<org.omg.PortableServer.DynamicImplementation> {

    @Override
    public Class<org.omg.PortableServer.DynamicImplementation> createNewSUT() {
        return org.omg.PortableServer.DynamicImplementation.class;
    }

}
