package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMISecurityExceptionClassTest
implements org.j8unit.repository.java.rmi.RMISecurityExceptionClassTests<java.rmi.RMISecurityException> {

    @Override
    public Class<java.rmi.RMISecurityException> createNewSUT() {
        return java.rmi.RMISecurityException.class;
    }

}
