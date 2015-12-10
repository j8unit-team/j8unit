package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UIDClassTest
implements org.j8unit.repository.java.rmi.server.UIDClassTests<java.rmi.server.UID> {

    @Override
    public Class<java.rmi.server.UID> createNewSUT() {
        return java.rmi.server.UID.class;
    }

}
