package org.j8unit.repository.java.rmi.server;

import java.rmi.server.ServerRef;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerRefTest
implements org.j8unit.repository.java.rmi.server.ServerRefTests<ServerRef> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.ServerRef]

    @Override
    public ServerRef createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.server.ServerRef], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.server.ServerRef]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.server.ServerRef]

}
