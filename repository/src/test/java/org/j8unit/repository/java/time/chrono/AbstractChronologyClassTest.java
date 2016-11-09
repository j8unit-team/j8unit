package org.j8unit.repository.java.time.chrono;

import java.time.chrono.AbstractChronology;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractChronology} (by simply reusing
 * the J8Unit test interface {@link AbstractChronologyClassTests}).
 */

@RunWith(J8Unit4.class)
public class AbstractChronologyClassTest
implements AbstractChronologyClassTests<AbstractChronology> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.chrono.AbstractChronology]

    @Override
    public Class<AbstractChronology> createNewSUT() {
        return AbstractChronology.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.chrono.AbstractChronology]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.chrono.AbstractChronology]

}
