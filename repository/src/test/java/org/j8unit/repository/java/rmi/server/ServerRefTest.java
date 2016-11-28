package org.j8unit.repository.java.rmi.server;

import java.rmi.server.ServerRef;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ServerRef} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.rmi.server.ServerRefTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class ServerRefTest
implements ServerRefTests<ServerRef> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.ServerRef]

    @Override
    public ServerRef createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.server.ServerRef], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.server.ServerRef]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.server.ServerRef]

}
