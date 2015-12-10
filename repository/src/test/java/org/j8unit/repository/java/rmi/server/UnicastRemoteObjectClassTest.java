package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnicastRemoteObjectClassTest
implements org.j8unit.repository.java.rmi.server.UnicastRemoteObjectClassTests<java.rmi.server.UnicastRemoteObject> {

    @Override
    public Class<java.rmi.server.UnicastRemoteObject> createNewSUT() {
        return java.rmi.server.UnicastRemoteObject.class;
    }

}
