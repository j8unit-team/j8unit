package org.j8unit.repository.java.rmi;

import java.rmi.ServerException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerExceptionTest
implements org.j8unit.repository.java.rmi.ServerExceptionTests<ServerException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.ServerException]

    @Override
    public ServerException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.ServerException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.ServerException]

}
