package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.UnknownObjectException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link UnknownObjectException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.rmi.activation.UnknownObjectExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class UnknownObjectExceptionTest
implements UnknownObjectExceptionTests<UnknownObjectException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.UnknownObjectException]

    @Override
    public UnknownObjectException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.activation.UnknownObjectException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.activation.UnknownObjectException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.activation.UnknownObjectException]

}
