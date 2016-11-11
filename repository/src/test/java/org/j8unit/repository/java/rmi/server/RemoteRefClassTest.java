package org.j8unit.repository.java.rmi.server;

import java.rmi.server.RemoteRef;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RemoteRef} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.rmi.server.RemoteRefClassTests}).
 */

@RunWith(J8Unit4.class)
public class RemoteRefClassTest
implements RemoteRefClassTests<RemoteRef> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.RemoteRef]

    @Override
    public Class<RemoteRef> createNewSUT() {
        return RemoteRef.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.server.RemoteRef]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.RemoteRef]

}
