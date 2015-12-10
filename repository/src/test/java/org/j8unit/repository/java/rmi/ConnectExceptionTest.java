package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConnectExceptionTest
implements org.j8unit.repository.java.rmi.ConnectExceptionTests<java.rmi.ConnectException> {

    @Override
    public java.rmi.ConnectException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.rmi.ConnectException] available.");
    }

}
