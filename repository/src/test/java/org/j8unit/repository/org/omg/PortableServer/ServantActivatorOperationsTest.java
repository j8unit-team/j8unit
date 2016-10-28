package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableServer.ServantActivatorOperations;

@RunWith(J8Unit4.class)
public class ServantActivatorOperationsTest
implements org.j8unit.repository.org.omg.PortableServer.ServantActivatorOperationsTests<ServantActivatorOperations> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.ServantActivatorOperations]

    @Override
    public ServantActivatorOperations createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableServer.ServantActivatorOperations], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.ServantActivatorOperations]

}
