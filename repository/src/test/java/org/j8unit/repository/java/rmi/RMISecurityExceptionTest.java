package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMISecurityExceptionTest
implements org.j8unit.repository.java.rmi.RMISecurityExceptionTests<java.rmi.RMISecurityException> {

    @Override
    public java.rmi.RMISecurityException createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.rmi.RMISecurityException] available.");
    }

}
