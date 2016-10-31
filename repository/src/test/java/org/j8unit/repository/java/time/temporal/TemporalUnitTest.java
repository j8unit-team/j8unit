package org.j8unit.repository.java.time.temporal;

import java.time.temporal.TemporalUnit;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TemporalUnitTest
implements org.j8unit.repository.java.time.temporal.TemporalUnitTests<TemporalUnit> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.TemporalUnit]

    @Override
    public TemporalUnit createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.time.temporal.TemporalUnit], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.temporal.TemporalUnit]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.temporal.TemporalUnit]

}
