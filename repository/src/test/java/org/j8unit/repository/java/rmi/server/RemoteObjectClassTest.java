package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RemoteObjectClassTest
implements org.j8unit.repository.java.rmi.server.RemoteObjectClassTests<java.rmi.server.RemoteObject> {

    @Override
    public Class<java.rmi.server.RemoteObject> createNewSUT() {
        return java.rmi.server.RemoteObject.class;
    }

}
