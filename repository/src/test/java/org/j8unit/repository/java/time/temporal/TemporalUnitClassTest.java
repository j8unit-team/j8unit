package org.j8unit.repository.java.time.temporal;

import java.time.temporal.TemporalUnit;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TemporalUnitClassTest
implements org.j8unit.repository.java.time.temporal.TemporalUnitClassTests<TemporalUnit> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.temporal.TemporalUnit]

    @Override
    public Class<TemporalUnit> createNewSUT() {
        return TemporalUnit.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.temporal.TemporalUnit]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.temporal.TemporalUnit]

}
