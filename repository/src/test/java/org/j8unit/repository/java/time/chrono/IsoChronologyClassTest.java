package org.j8unit.repository.java.time.chrono;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IsoChronologyClassTest
implements org.j8unit.repository.java.time.chrono.IsoChronologyClassTests<java.time.chrono.IsoChronology> {

    @Override
    public Class<java.time.chrono.IsoChronology> createNewSUT() {
        return java.time.chrono.IsoChronology.class;
    }

}
