package org.j8unit.repository.java.rmi.server;

import java.rmi.server.RemoteCall;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RemoteCall} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.rmi.server.RemoteCallClassTests}).
 */

@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class RemoteCallClassTest
implements RemoteCallClassTests<RemoteCall> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.RemoteCall]

    @Override
    public Class<RemoteCall> createNewSUT() {
        return RemoteCall.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.server.RemoteCall]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.RemoteCall]

}
