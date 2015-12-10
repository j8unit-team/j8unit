package org.j8unit.repository.java.rmi.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivationExceptionClassTest
implements org.j8unit.repository.java.rmi.activation.ActivationExceptionClassTests<java.rmi.activation.ActivationException> {

    @Override
    public Class<java.rmi.activation.ActivationException> createNewSUT() {
        return java.rmi.activation.ActivationException.class;
    }

}
