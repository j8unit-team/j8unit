package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AlreadyBoundExceptionClassTest
implements org.j8unit.repository.java.rmi.AlreadyBoundExceptionClassTests<java.rmi.AlreadyBoundException> {

    @Override
    public Class<java.rmi.AlreadyBoundException> createNewSUT() {
        return java.rmi.AlreadyBoundException.class;
    }

}
