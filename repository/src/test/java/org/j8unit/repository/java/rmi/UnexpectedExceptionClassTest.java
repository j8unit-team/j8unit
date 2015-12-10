package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnexpectedExceptionClassTest
implements org.j8unit.repository.java.rmi.UnexpectedExceptionClassTests<java.rmi.UnexpectedException> {

    @Override
    public Class<java.rmi.UnexpectedException> createNewSUT() {
        return java.rmi.UnexpectedException.class;
    }

}
