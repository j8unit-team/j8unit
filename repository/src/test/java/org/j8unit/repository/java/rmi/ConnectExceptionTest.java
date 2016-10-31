package org.j8unit.repository.java.rmi;

import java.rmi.ConnectException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConnectExceptionTest
implements org.j8unit.repository.java.rmi.ConnectExceptionTests<ConnectException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.ConnectException]

    @Override
    public ConnectException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.ConnectException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.ConnectException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.ConnectException]

}
