package org.j8unit.repository.java.time.chrono;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HijrahChronologyClassTest
implements org.j8unit.repository.java.time.chrono.HijrahChronologyClassTests<java.time.chrono.HijrahChronology> {

    @Override
    public Class<java.time.chrono.HijrahChronology> createNewSUT() {
        return java.time.chrono.HijrahChronology.class;
    }

}
