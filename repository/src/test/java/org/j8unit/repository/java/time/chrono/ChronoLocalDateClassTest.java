package org.j8unit.repository.java.time.chrono;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChronoLocalDateClassTest
implements org.j8unit.repository.java.time.chrono.ChronoLocalDateClassTests<java.time.chrono.ChronoLocalDate> {

    @Override
    public Class<java.time.chrono.ChronoLocalDate> createNewSUT() {
        return java.time.chrono.ChronoLocalDate.class;
    }

}
