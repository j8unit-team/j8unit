package org.j8unit.repository.java.time.temporal;

import java.time.temporal.TemporalUnit;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TemporalUnit} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.temporal.TemporalUnitClassTests}).
 */
@RunWith(J8Unit4.class)
public class TemporalUnitClassTest
implements TemporalUnitClassTests<TemporalUnit> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.temporal.TemporalUnit]

    @Override
    public Class<TemporalUnit> createNewSUT() {
        return TemporalUnit.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.temporal.TemporalUnit]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.temporal.TemporalUnit]

}
