package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZonedDateTimeTest
implements org.j8unit.repository.java.time.ZonedDateTimeTests<java.time.ZonedDateTime> {

    @Override
    public java.time.ZonedDateTime createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.time.ZonedDateTime] available.");
    }

}
