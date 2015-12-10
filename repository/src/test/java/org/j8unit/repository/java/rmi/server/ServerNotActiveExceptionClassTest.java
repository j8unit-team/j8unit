package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerNotActiveExceptionClassTest
implements org.j8unit.repository.java.rmi.server.ServerNotActiveExceptionClassTests<java.rmi.server.ServerNotActiveException> {

    @Override
    public Class<java.rmi.server.ServerNotActiveException> createNewSUT() {
        return java.rmi.server.ServerNotActiveException.class;
    }

}
