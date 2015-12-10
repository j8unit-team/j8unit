package org.j8unit.repository.java.time;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZonedDateTimeClassTest
implements org.j8unit.repository.java.time.ZonedDateTimeClassTests<java.time.ZonedDateTime> {

    @Override
    public Class<java.time.ZonedDateTime> createNewSUT() {
        return java.time.ZonedDateTime.class;
    }

}
