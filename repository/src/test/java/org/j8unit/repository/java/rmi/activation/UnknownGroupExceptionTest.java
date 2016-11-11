package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.UnknownGroupException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link UnknownGroupException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.rmi.activation.UnknownGroupExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class UnknownGroupExceptionTest
implements UnknownGroupExceptionTests<UnknownGroupException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.UnknownGroupException]

    @Override
    public UnknownGroupException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.activation.UnknownGroupException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.activation.UnknownGroupException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.activation.UnknownGroupException]

}
