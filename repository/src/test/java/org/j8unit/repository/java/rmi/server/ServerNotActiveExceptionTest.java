package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerNotActiveExceptionTest
implements org.j8unit.repository.java.rmi.server.ServerNotActiveExceptionTests<java.rmi.server.ServerNotActiveException> {

    @Override
    public java.rmi.server.ServerNotActiveException createNewSUT() {
        return new java.rmi.server.ServerNotActiveException();
    }

}
