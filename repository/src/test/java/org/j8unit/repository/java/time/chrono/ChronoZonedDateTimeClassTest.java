package org.j8unit.repository.java.time.chrono;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ChronoZonedDateTimeClassTest
implements org.j8unit.repository.java.time.chrono.ChronoZonedDateTimeClassTests<java.time.chrono.ChronoZonedDateTime> {

    @Override
    public Class<java.time.chrono.ChronoZonedDateTime> createNewSUT() {
        return java.time.chrono.ChronoZonedDateTime.class;
    }

}
