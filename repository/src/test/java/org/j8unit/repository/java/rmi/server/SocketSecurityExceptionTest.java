package org.j8unit.repository.java.rmi.server;

import java.rmi.server.SocketSecurityException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SocketSecurityException} (by simply
 * reusing the J8Unit test interface {@link SocketSecurityExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class SocketSecurityExceptionTest
implements SocketSecurityExceptionTests<SocketSecurityException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.SocketSecurityException]

    @Override
    public SocketSecurityException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.server.SocketSecurityException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.server.SocketSecurityException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.server.SocketSecurityException]

}
