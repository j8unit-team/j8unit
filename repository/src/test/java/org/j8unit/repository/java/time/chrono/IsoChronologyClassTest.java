package org.j8unit.repository.java.time.chrono;

import java.time.chrono.IsoChronology;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IsoChronologyClassTest
implements org.j8unit.repository.java.time.chrono.IsoChronologyClassTests<IsoChronology> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.chrono.IsoChronology]

    @Override
    public Class<IsoChronology> createNewSUT() {
        return IsoChronology.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.chrono.IsoChronology]

}
