package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConnectIOExceptionClassTest
implements org.j8unit.repository.java.rmi.ConnectIOExceptionClassTests<java.rmi.ConnectIOException> {

    @Override
    public Class<java.rmi.ConnectIOException> createNewSUT() {
        return java.rmi.ConnectIOException.class;
    }

}
