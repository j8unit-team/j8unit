package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketSecurityExceptionTest
implements org.j8unit.repository.java.rmi.server.SocketSecurityExceptionTests<java.rmi.server.SocketSecurityException> {

    @Override
    public java.rmi.server.SocketSecurityException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.rmi.server.SocketSecurityException] available.");
    }

}
