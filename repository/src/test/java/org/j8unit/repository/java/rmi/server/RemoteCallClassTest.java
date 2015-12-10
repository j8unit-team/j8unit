package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RemoteCallClassTest
implements org.j8unit.repository.java.rmi.server.RemoteCallClassTests<java.rmi.server.RemoteCall> {

    @Override
    public Class<java.rmi.server.RemoteCall> createNewSUT() {
        return java.rmi.server.RemoteCall.class;
    }

}
