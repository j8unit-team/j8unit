package org.j8unit.repository.java.rmi.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivateFailedExceptionClassTest
implements org.j8unit.repository.java.rmi.activation.ActivateFailedExceptionClassTests<java.rmi.activation.ActivateFailedException> {

    @Override
    public Class<java.rmi.activation.ActivateFailedException> createNewSUT() {
        return java.rmi.activation.ActivateFailedException.class;
    }

}
