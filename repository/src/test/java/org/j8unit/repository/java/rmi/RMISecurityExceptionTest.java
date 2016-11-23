package org.j8unit.repository.java.rmi;

import java.rmi.RMISecurityException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RMISecurityException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.rmi.RMISecurityExceptionTests}).
 */

@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class RMISecurityExceptionTest
implements RMISecurityExceptionTests<RMISecurityException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.RMISecurityException]

    @Override
    public RMISecurityException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.RMISecurityException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.RMISecurityException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.RMISecurityException]

}
