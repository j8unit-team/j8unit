package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketSecurityExceptionClassTest
implements org.j8unit.repository.java.rmi.server.SocketSecurityExceptionClassTests<java.rmi.server.SocketSecurityException> {

    @Override
    public Class<java.rmi.server.SocketSecurityException> createNewSUT() {
        return java.rmi.server.SocketSecurityException.class;
    }

}
