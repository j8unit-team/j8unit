package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.ActivateFailedException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ActivateFailedException} (by simply
 * reusing the J8Unit test interface {@link ActivateFailedExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class ActivateFailedExceptionTest
implements ActivateFailedExceptionTests<ActivateFailedException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.ActivateFailedException]

    @Override
    public ActivateFailedException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.activation.ActivateFailedException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.activation.ActivateFailedException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.activation.ActivateFailedException]

}
