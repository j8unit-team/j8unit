package org.j8unit.repository.java.rmi.server;

import java.rmi.server.RemoteStub;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RemoteStub} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.rmi.server.RemoteStubClassTests}).
 */

@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class RemoteStubClassTest
implements RemoteStubClassTests<RemoteStub> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.RemoteStub]

    @Override
    public Class<RemoteStub> createNewSUT() {
        return RemoteStub.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.server.RemoteStub]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.RemoteStub]

}
