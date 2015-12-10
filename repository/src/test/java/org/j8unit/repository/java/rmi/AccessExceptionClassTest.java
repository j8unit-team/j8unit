package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessExceptionClassTest
implements org.j8unit.repository.java.rmi.AccessExceptionClassTests<java.rmi.AccessException> {

    @Override
    public Class<java.rmi.AccessException> createNewSUT() {
        return java.rmi.AccessException.class;
    }

}
