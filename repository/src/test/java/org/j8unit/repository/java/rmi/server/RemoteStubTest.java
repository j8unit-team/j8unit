package org.j8unit.repository.java.rmi.server;

import java.rmi.server.RemoteStub;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RemoteStub} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.rmi.server.RemoteStubTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class RemoteStubTest
implements RemoteStubTests<RemoteStub> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.RemoteStub]

    @Override
    public RemoteStub createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.server.RemoteStub], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.server.RemoteStub]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.server.RemoteStub]

}
