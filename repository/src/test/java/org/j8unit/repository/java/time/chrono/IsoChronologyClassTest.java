package org.j8unit.repository.java.time.chrono;

import java.time.chrono.IsoChronology;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IsoChronology} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.chrono.IsoChronologyClassTests}).
 */
@RunWith(J8Unit4.class)
public class IsoChronologyClassTest
implements IsoChronologyClassTests<IsoChronology> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.chrono.IsoChronology]

    @Override
    public Class<IsoChronology> createNewSUT() {
        return IsoChronology.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.chrono.IsoChronology]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.chrono.IsoChronology]

}
