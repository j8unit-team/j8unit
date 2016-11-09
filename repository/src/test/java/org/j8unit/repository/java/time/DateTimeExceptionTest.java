package org.j8unit.repository.java.time;

import java.time.DateTimeException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DateTimeException} (by simply reusing
 * the J8Unit test interface {@link DateTimeExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class DateTimeExceptionTest
implements DateTimeExceptionTests<DateTimeException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.DateTimeException]

    @Override
    public DateTimeException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.time.DateTimeException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.DateTimeException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.DateTimeException]

}
