package org.j8unit.repository.java.rmi;

import java.rmi.RMISecurityException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMISecurityExceptionTest
implements org.j8unit.repository.java.rmi.RMISecurityExceptionTests<RMISecurityException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.RMISecurityException]

    @Override
    public RMISecurityException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.RMISecurityException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.RMISecurityException]

}
