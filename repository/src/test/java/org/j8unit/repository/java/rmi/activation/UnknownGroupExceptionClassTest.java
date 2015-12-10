package org.j8unit.repository.java.rmi.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownGroupExceptionClassTest
implements org.j8unit.repository.java.rmi.activation.UnknownGroupExceptionClassTests<java.rmi.activation.UnknownGroupException> {

    @Override
    public Class<java.rmi.activation.UnknownGroupException> createNewSUT() {
        return java.rmi.activation.UnknownGroupException.class;
    }

}
