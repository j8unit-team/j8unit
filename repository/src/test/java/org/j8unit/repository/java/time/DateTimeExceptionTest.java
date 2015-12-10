package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DateTimeExceptionTest
implements org.j8unit.repository.java.time.DateTimeExceptionTests<java.time.DateTimeException> {

    @Override
    public java.time.DateTimeException createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.time.DateTimeException] available.");
    }

}
