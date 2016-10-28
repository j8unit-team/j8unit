package org.j8unit.repository.java.time.temporal;

import java.time.temporal.TemporalAmount;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TemporalAmountTest
implements org.j8unit.repository.java.time.temporal.TemporalAmountTests<TemporalAmount> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.TemporalAmount]

    @Override
    public TemporalAmount createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.time.temporal.TemporalAmount], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.TemporalAmount]

}
