package org.j8unit.repository.java.time.chrono;

import java.time.chrono.MinguoChronology;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MinguoChronology} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.chrono.MinguoChronologyClassTests}).
 */

@RunWith(J8Unit4.class)
public class MinguoChronologyClassTest
implements MinguoChronologyClassTests<MinguoChronology> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.chrono.MinguoChronology]

    @Override
    public Class<MinguoChronology> createNewSUT() {
        return MinguoChronology.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.chrono.MinguoChronology]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.chrono.MinguoChronology]

}
