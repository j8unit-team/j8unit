package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RemoteServerClassTest
implements org.j8unit.repository.java.rmi.server.RemoteServerClassTests<java.rmi.server.RemoteServer> {

    @Override
    public Class<java.rmi.server.RemoteServer> createNewSUT() {
        return java.rmi.server.RemoteServer.class;
    }

}
