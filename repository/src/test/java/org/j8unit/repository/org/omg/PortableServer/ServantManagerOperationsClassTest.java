package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServantManagerOperationsClassTest
implements org.j8unit.repository.org.omg.PortableServer.ServantManagerOperationsClassTests<org.omg.PortableServer.ServantManagerOperations> {

    @Override
    public Class<org.omg.PortableServer.ServantManagerOperations> createNewSUT() {
        return org.omg.PortableServer.ServantManagerOperations.class;
    }

}
