package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConnectIOExceptionTest
implements org.j8unit.repository.java.rmi.ConnectIOExceptionTests<java.rmi.ConnectIOException> {

    @Override
    public java.rmi.ConnectIOException createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.rmi.ConnectIOException] available.");
    }

}
