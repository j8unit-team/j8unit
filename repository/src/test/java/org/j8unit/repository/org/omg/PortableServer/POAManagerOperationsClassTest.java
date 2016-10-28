package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableServer.POAManagerOperations;

@RunWith(J8Unit4.class)
public class POAManagerOperationsClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAManagerOperationsClassTests<POAManagerOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.POAManagerOperations]

    @Override
    public Class<POAManagerOperations> createNewSUT() {
        return POAManagerOperations.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.POAManagerOperations]

}
