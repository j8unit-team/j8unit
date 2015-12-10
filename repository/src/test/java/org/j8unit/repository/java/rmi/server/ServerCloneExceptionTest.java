package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerCloneExceptionTest
implements org.j8unit.repository.java.rmi.server.ServerCloneExceptionTests<java.rmi.server.ServerCloneException> {

    @Override
    public java.rmi.server.ServerCloneException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.rmi.server.ServerCloneException] available.");
    }

}
