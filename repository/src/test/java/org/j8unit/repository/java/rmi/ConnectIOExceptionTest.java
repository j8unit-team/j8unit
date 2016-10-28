package org.j8unit.repository.java.rmi;

import java.rmi.ConnectIOException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConnectIOExceptionTest
implements org.j8unit.repository.java.rmi.ConnectIOExceptionTests<ConnectIOException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.ConnectIOException]

    @Override
    public ConnectIOException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.ConnectIOException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.ConnectIOException]

}
