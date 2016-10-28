package org.j8unit.repository.java.rmi;

import java.rmi.AccessException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessExceptionTest
implements org.j8unit.repository.java.rmi.AccessExceptionTests<AccessException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.AccessException]

    @Override
    public AccessException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.AccessException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.AccessException]

}
