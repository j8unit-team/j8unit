package org.j8unit.repository.java.time.chrono;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ChronoLocalDateTimeClassTest
implements org.j8unit.repository.java.time.chrono.ChronoLocalDateTimeClassTests<java.time.chrono.ChronoLocalDateTime> {

    @Override
    public Class<java.time.chrono.ChronoLocalDateTime> createNewSUT() {
        return java.time.chrono.ChronoLocalDateTime.class;
    }

}
