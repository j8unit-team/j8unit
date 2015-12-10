package org.j8unit.repository.java.time.format;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DateTimeParseExceptionTest
implements org.j8unit.repository.java.time.format.DateTimeParseExceptionTests<java.time.format.DateTimeParseException> {

    @Override
    public java.time.format.DateTimeParseException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.time.format.DateTimeParseException] available.");
    }

}
