package org.j8unit.repository.java.rmi;

import java.rmi.MarshalException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MarshalException} (by simply reusing
 * the J8Unit test interface {@link MarshalExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class MarshalExceptionTest
implements MarshalExceptionTests<MarshalException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.MarshalException]

    @Override
    public MarshalException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.MarshalException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.MarshalException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.MarshalException]

}
