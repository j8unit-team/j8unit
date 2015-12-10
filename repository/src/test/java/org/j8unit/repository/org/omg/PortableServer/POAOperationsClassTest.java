package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class POAOperationsClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAOperationsClassTests<org.omg.PortableServer.POAOperations> {

    @Override
    public Class<org.omg.PortableServer.POAOperations> createNewSUT() {
        return org.omg.PortableServer.POAOperations.class;
    }

}
