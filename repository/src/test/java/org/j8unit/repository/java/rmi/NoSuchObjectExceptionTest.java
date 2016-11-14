package org.j8unit.repository.java.rmi;

import java.rmi.NoSuchObjectException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NoSuchObjectException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.rmi.NoSuchObjectExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class NoSuchObjectExceptionTest
implements NoSuchObjectExceptionTests<NoSuchObjectException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.NoSuchObjectException]

    @Override
    public NoSuchObjectException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.NoSuchObjectException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.NoSuchObjectException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.NoSuchObjectException]

}
