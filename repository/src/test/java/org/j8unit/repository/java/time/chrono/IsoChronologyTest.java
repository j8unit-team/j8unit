package org.j8unit.repository.java.time.chrono;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IsoChronologyTest
implements org.j8unit.repository.java.time.chrono.IsoChronologyTests<java.time.chrono.IsoChronology> {

    @Override
    public java.time.chrono.IsoChronology createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.time.chrono.IsoChronology] available.");
    }

}