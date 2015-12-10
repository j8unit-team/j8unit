package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConnectExceptionClassTest
implements org.j8unit.repository.java.rmi.ConnectExceptionClassTests<java.rmi.ConnectException> {

    @Override
    public Class<java.rmi.ConnectException> createNewSUT() {
        return java.rmi.ConnectException.class;
    }

}
