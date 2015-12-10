package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class POAManagerOperationsClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAManagerOperationsClassTests<org.omg.PortableServer.POAManagerOperations> {

    @Override
    public Class<org.omg.PortableServer.POAManagerOperations> createNewSUT() {
        return org.omg.PortableServer.POAManagerOperations.class;
    }

}
