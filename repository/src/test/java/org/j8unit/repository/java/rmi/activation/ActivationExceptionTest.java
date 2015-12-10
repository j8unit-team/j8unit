package org.j8unit.repository.java.rmi.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivationExceptionTest
implements org.j8unit.repository.java.rmi.activation.ActivationExceptionTests<java.rmi.activation.ActivationException> {

    @Override
    public java.rmi.activation.ActivationException createNewSUT() {
        return new java.rmi.activation.ActivationException();
    }

}
