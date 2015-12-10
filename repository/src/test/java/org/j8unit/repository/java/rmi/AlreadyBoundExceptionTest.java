package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AlreadyBoundExceptionTest
implements org.j8unit.repository.java.rmi.AlreadyBoundExceptionTests<java.rmi.AlreadyBoundException> {

    @Override
    public java.rmi.AlreadyBoundException createNewSUT() {
        return new java.rmi.AlreadyBoundException();
    }

}
