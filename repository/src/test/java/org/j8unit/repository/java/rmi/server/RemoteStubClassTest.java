package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RemoteStubClassTest
implements org.j8unit.repository.java.rmi.server.RemoteStubClassTests<java.rmi.server.RemoteStub> {

    @Override
    public Class<java.rmi.server.RemoteStub> createNewSUT() {
        return java.rmi.server.RemoteStub.class;
    }

}
