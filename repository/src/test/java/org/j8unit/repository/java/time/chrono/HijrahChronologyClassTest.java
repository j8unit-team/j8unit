package org.j8unit.repository.java.time.chrono;

import java.time.chrono.HijrahChronology;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HijrahChronologyClassTest
implements org.j8unit.repository.java.time.chrono.HijrahChronologyClassTests<HijrahChronology> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.chrono.HijrahChronology]

    @Override
    public Class<HijrahChronology> createNewSUT() {
        return HijrahChronology.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.chrono.HijrahChronology]

}
