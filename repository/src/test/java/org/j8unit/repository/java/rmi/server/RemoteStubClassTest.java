package org.j8unit.repository.java.rmi.server;

import java.rmi.server.RemoteStub;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RemoteStubClassTest
implements org.j8unit.repository.java.rmi.server.RemoteStubClassTests<RemoteStub> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.RemoteStub]

    @Override
    public Class<RemoteStub> createNewSUT() {
        return RemoteStub.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.RemoteStub]

}
