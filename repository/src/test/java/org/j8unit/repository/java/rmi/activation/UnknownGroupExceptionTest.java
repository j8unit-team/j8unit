package org.j8unit.repository.java.rmi.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownGroupExceptionTest
implements org.j8unit.repository.java.rmi.activation.UnknownGroupExceptionTests<java.rmi.activation.UnknownGroupException> {

    @Override
    public java.rmi.activation.UnknownGroupException createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.rmi.activation.UnknownGroupException] available.");
    }

}
