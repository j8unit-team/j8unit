package org.j8unit.repository.java.time.chrono;

import java.time.chrono.ThaiBuddhistChronology;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ThaiBuddhistChronology} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.time.chrono.ThaiBuddhistChronologyClassTests}).
 */
@RunWith(J8Unit4.class)
public class ThaiBuddhistChronologyClassTest
implements ThaiBuddhistChronologyClassTests<ThaiBuddhistChronology> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.chrono.ThaiBuddhistChronology]

    @Override
    public Class<ThaiBuddhistChronology> createNewSUT() {
        return ThaiBuddhistChronology.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.chrono.ThaiBuddhistChronology]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.chrono.ThaiBuddhistChronology]

}
