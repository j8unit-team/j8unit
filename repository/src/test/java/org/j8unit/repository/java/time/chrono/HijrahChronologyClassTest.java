package org.j8unit.repository.java.time.chrono;

import java.time.chrono.HijrahChronology;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HijrahChronology} (by simply reusing the
 * J8Unit test interface {@link HijrahChronologyClassTests}).
 */

@RunWith(J8Unit4.class)
public class HijrahChronologyClassTest
implements HijrahChronologyClassTests<HijrahChronology> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.chrono.HijrahChronology]

    @Override
    public Class<HijrahChronology> createNewSUT() {
        return HijrahChronology.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.chrono.HijrahChronology]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.chrono.HijrahChronology]

}
