package org.j8unit.repository.java.time.chrono;

import java.time.chrono.ChronoPeriod;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChronoPeriodTest
implements org.j8unit.repository.java.time.chrono.ChronoPeriodTests<ChronoPeriod> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.chrono.ChronoPeriod]

    @Override
    public ChronoPeriod createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.time.chrono.ChronoPeriod], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.chrono.ChronoPeriod]

}
