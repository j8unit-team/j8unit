package org.j8unit.repository.java.rmi.server;

import java.rmi.server.ServerRef;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ServerRef} (by simply reusing the J8Unit
 * test interface {@link ServerRefClassTests}).
 */

@RunWith(J8Unit4.class)
public class ServerRefClassTest
implements ServerRefClassTests<ServerRef> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.ServerRef]

    @Override
    public Class<ServerRef> createNewSUT() {
        return ServerRef.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.server.ServerRef]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.ServerRef]

}
