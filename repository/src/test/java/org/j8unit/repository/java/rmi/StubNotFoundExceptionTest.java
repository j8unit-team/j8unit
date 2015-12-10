package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StubNotFoundExceptionTest
implements org.j8unit.repository.java.rmi.StubNotFoundExceptionTests<java.rmi.StubNotFoundException> {

    @Override
    public java.rmi.StubNotFoundException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.rmi.StubNotFoundException] available.");
    }

}
