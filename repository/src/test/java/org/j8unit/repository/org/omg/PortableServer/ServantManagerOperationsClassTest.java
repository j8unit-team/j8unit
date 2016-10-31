package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.ServantManagerOperations;

@RunWith(J8Unit4.class)
public class ServantManagerOperationsClassTest
implements org.j8unit.repository.org.omg.PortableServer.ServantManagerOperationsClassTests<ServantManagerOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.ServantManagerOperations]

    @Override
    public Class<ServantManagerOperations> createNewSUT() {
        return ServantManagerOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.ServantManagerOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.ServantManagerOperations]

}
