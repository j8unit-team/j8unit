package org.j8unit.repository.java.time.format;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DateTimeParseExceptionClassTest
implements org.j8unit.repository.java.time.format.DateTimeParseExceptionClassTests<java.time.format.DateTimeParseException> {

    @Override
    public Class<java.time.format.DateTimeParseException> createNewSUT() {
        return java.time.format.DateTimeParseException.class;
    }

}
