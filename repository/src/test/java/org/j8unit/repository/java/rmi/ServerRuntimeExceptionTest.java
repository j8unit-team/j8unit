package org.j8unit.repository.java.rmi;

import java.rmi.ServerRuntimeException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerRuntimeExceptionTest
implements org.j8unit.repository.java.rmi.ServerRuntimeExceptionTests<ServerRuntimeException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.ServerRuntimeException]

    @Override
    public ServerRuntimeException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.ServerRuntimeException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.ServerRuntimeException]

}
