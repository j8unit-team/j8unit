package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjIDTest
implements org.j8unit.repository.java.rmi.server.ObjIDTests<java.rmi.server.ObjID> {

    @Override
    public java.rmi.server.ObjID createNewSUT() {
        return new java.rmi.server.ObjID();
    }

}
