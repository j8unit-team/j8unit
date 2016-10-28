package org.j8unit.repository.java.time.temporal;

import java.time.temporal.TemporalAccessor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TemporalAccessorTest
implements org.j8unit.repository.java.time.temporal.TemporalAccessorTests<TemporalAccessor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.TemporalAccessor]

    @Override
    public TemporalAccessor createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.time.temporal.TemporalAccessor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.TemporalAccessor]

}
