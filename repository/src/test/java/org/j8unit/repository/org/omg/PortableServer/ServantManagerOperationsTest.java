package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableServer.ServantManagerOperations;

@RunWith(J8Unit4.class)
public class ServantManagerOperationsTest
implements org.j8unit.repository.org.omg.PortableServer.ServantManagerOperationsTests<ServantManagerOperations> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.ServantManagerOperations]

    @Override
    public ServantManagerOperations createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableServer.ServantManagerOperations], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.ServantManagerOperations]

}
