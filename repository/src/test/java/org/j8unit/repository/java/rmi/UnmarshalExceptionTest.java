package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnmarshalExceptionTest
implements org.j8unit.repository.java.rmi.UnmarshalExceptionTests<java.rmi.UnmarshalException> {

    @Override
    public java.rmi.UnmarshalException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.rmi.UnmarshalException] available.");
    }

}
