package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerRuntimeExceptionTest
implements org.j8unit.repository.java.rmi.ServerRuntimeExceptionTests<java.rmi.ServerRuntimeException> {

    @Override
    public java.rmi.ServerRuntimeException createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.rmi.ServerRuntimeException] available.");
    }

}
