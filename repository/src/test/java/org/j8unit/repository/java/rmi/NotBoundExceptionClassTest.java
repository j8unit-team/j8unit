package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotBoundExceptionClassTest
implements org.j8unit.repository.java.rmi.NotBoundExceptionClassTests<java.rmi.NotBoundException> {

    @Override
    public Class<java.rmi.NotBoundException> createNewSUT() {
        return java.rmi.NotBoundException.class;
    }

}
