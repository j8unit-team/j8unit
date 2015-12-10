package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerRefClassTest
implements org.j8unit.repository.java.rmi.server.ServerRefClassTests<java.rmi.server.ServerRef> {

    @Override
    public Class<java.rmi.server.ServerRef> createNewSUT() {
        return java.rmi.server.ServerRef.class;
    }

}
