package org.j8unit.repository.java.time.temporal;

import java.time.temporal.ValueRange;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValueRangeTest
implements org.j8unit.repository.java.time.temporal.ValueRangeTests<ValueRange> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.ValueRange]

    @Override
    public ValueRange createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.time.temporal.ValueRange], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.temporal.ValueRange]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.temporal.ValueRange]

}
