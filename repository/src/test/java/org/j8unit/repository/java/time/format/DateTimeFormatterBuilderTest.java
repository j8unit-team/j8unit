package org.j8unit.repository.java.time.format;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DateTimeFormatterBuilderTest
implements org.j8unit.repository.java.time.format.DateTimeFormatterBuilderTests<java.time.format.DateTimeFormatterBuilder> {

    @Override
    public java.time.format.DateTimeFormatterBuilder createNewSUT() {
        return new java.time.format.DateTimeFormatterBuilder();
    }

}
