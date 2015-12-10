package org.j8unit.repository.java.time.format;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DateTimeFormatterClassTest
implements org.j8unit.repository.java.time.format.DateTimeFormatterClassTests<java.time.format.DateTimeFormatter> {

    @Override
    public Class<java.time.format.DateTimeFormatter> createNewSUT() {
        return java.time.format.DateTimeFormatter.class;
    }

}
