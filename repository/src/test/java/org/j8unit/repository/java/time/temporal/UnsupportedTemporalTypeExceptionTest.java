package org.j8unit.repository.java.time.temporal;

import java.time.temporal.UnsupportedTemporalTypeException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link UnsupportedTemporalTypeException} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.time.temporal.UnsupportedTemporalTypeExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class UnsupportedTemporalTypeExceptionTest
implements UnsupportedTemporalTypeExceptionTests<UnsupportedTemporalTypeException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.UnsupportedTemporalTypeException]

    @Override
    public UnsupportedTemporalTypeException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.time.temporal.UnsupportedTemporalTypeException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.temporal.UnsupportedTemporalTypeException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.temporal.UnsupportedTemporalTypeException]

}
