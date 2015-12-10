package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotBoundExceptionTest
implements org.j8unit.repository.java.rmi.NotBoundExceptionTests<java.rmi.NotBoundException> {

    @Override
    public java.rmi.NotBoundException createNewSUT() {
        return new java.rmi.NotBoundException();
    }

}
