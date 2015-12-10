package org.j8unit.repository.java.rmi.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownObjectExceptionClassTest
implements org.j8unit.repository.java.rmi.activation.UnknownObjectExceptionClassTests<java.rmi.activation.UnknownObjectException> {

    @Override
    public Class<java.rmi.activation.UnknownObjectException> createNewSUT() {
        return java.rmi.activation.UnknownObjectException.class;
    }

}
