package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UIDTest
implements org.j8unit.repository.java.rmi.server.UIDTests<java.rmi.server.UID> {

    @Override
    public java.rmi.server.UID createNewSUT() {
        return new java.rmi.server.UID();
    }

}
