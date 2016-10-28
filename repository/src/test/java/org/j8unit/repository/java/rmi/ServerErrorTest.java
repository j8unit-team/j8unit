package org.j8unit.repository.java.rmi;

import java.rmi.ServerError;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerErrorTest
implements org.j8unit.repository.java.rmi.ServerErrorTests<ServerError> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.ServerError]

    @Override
    public ServerError createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.ServerError], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.ServerError]

}
