package org.j8unit.repository.java.time.chrono;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HijrahChronologyTest
implements org.j8unit.repository.java.time.chrono.HijrahChronologyTests<java.time.chrono.HijrahChronology> {

    @Override
    public java.time.chrono.HijrahChronology createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.time.chrono.HijrahChronology] available.");
    }

}
