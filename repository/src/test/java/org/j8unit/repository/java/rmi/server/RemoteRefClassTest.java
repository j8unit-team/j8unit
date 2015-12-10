package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RemoteRefClassTest
implements org.j8unit.repository.java.rmi.server.RemoteRefClassTests<java.rmi.server.RemoteRef> {

    @Override
    public Class<java.rmi.server.RemoteRef> createNewSUT() {
        return java.rmi.server.RemoteRef.class;
    }

}
