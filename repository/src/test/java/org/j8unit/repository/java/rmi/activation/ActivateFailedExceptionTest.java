package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.ActivateFailedException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivateFailedExceptionTest
implements org.j8unit.repository.java.rmi.activation.ActivateFailedExceptionTests<ActivateFailedException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.ActivateFailedException]

    @Override
    public ActivateFailedException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.activation.ActivateFailedException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.activation.ActivateFailedException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.activation.ActivateFailedException]

}
