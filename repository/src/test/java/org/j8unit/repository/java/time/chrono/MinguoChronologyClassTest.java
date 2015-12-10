package org.j8unit.repository.java.time.chrono;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MinguoChronologyClassTest
implements org.j8unit.repository.java.time.chrono.MinguoChronologyClassTests<java.time.chrono.MinguoChronology> {

    @Override
    public Class<java.time.chrono.MinguoChronology> createNewSUT() {
        return java.time.chrono.MinguoChronology.class;
    }

}
