package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnexpectedExceptionTest
implements org.j8unit.repository.java.rmi.UnexpectedExceptionTests<java.rmi.UnexpectedException> {

    @Override
    public java.rmi.UnexpectedException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.rmi.UnexpectedException] available.");
    }

}
