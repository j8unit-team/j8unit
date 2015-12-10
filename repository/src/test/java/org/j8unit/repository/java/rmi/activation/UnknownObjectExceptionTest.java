package org.j8unit.repository.java.rmi.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownObjectExceptionTest
implements org.j8unit.repository.java.rmi.activation.UnknownObjectExceptionTests<java.rmi.activation.UnknownObjectException> {

    @Override
    public java.rmi.activation.UnknownObjectException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.rmi.activation.UnknownObjectException] available.");
    }

}
