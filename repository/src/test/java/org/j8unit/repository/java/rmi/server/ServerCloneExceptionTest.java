package org.j8unit.repository.java.rmi.server;

import java.rmi.server.ServerCloneException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerCloneExceptionTest
implements org.j8unit.repository.java.rmi.server.ServerCloneExceptionTests<ServerCloneException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.ServerCloneException]

    @Override
    public ServerCloneException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.server.ServerCloneException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.ServerCloneException]

}
