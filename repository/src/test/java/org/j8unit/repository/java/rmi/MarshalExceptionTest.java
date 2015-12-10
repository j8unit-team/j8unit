package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MarshalExceptionTest
implements org.j8unit.repository.java.rmi.MarshalExceptionTests<java.rmi.MarshalException> {

    @Override
    public java.rmi.MarshalException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.rmi.MarshalException] available.");
    }

}
