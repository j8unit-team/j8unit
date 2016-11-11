package org.j8unit.repository.java.rmi;

import java.rmi.AccessException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AccessException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.rmi.AccessExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class AccessExceptionTest
implements AccessExceptionTests<AccessException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.AccessException]

    @Override
    public AccessException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.AccessException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.AccessException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.AccessException]

}
