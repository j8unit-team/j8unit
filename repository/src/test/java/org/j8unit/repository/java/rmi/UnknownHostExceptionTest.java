package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownHostExceptionTest
implements org.j8unit.repository.java.rmi.UnknownHostExceptionTests<java.rmi.UnknownHostException> {

    @Override
    public java.rmi.UnknownHostException createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.rmi.UnknownHostException] available.");
    }

}
