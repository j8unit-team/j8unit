package org.j8unit.repository.java.rmi.server;

import java.rmi.server.SocketSecurityException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketSecurityExceptionTest
implements org.j8unit.repository.java.rmi.server.SocketSecurityExceptionTests<SocketSecurityException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.SocketSecurityException]

    @Override
    public SocketSecurityException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.server.SocketSecurityException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.server.SocketSecurityException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.server.SocketSecurityException]

}
