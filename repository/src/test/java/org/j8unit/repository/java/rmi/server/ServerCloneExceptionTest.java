package org.j8unit.repository.java.rmi.server;

import java.rmi.server.ServerCloneException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ServerCloneException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.rmi.server.ServerCloneExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class ServerCloneExceptionTest
implements ServerCloneExceptionTests<ServerCloneException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.ServerCloneException]

    @Override
    public ServerCloneException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.server.ServerCloneException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.server.ServerCloneException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.server.ServerCloneException]

}
