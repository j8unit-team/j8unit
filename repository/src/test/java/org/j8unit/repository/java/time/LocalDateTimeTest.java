package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LocalDateTimeTest
implements org.j8unit.repository.java.time.LocalDateTimeTests<java.time.LocalDateTime> {

    @Override
    public java.time.LocalDateTime createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.time.LocalDateTime] available.");
    }

}
