package org.j8unit.repository.java.time.format;

import java.time.format.DateTimeParseException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DateTimeParseException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.time.format.DateTimeParseExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class DateTimeParseExceptionTest
implements DateTimeParseExceptionTests<DateTimeParseException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.format.DateTimeParseException]

    @Override
    public DateTimeParseException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.time.format.DateTimeParseException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.format.DateTimeParseException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.format.DateTimeParseException]

}
