package org.j8unit.repository.java.rmi.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivateFailedExceptionTest
implements org.j8unit.repository.java.rmi.activation.ActivateFailedExceptionTests<java.rmi.activation.ActivateFailedException> {

    @Override
    public java.rmi.activation.ActivateFailedException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.rmi.activation.ActivateFailedException] available.");
    }

}
