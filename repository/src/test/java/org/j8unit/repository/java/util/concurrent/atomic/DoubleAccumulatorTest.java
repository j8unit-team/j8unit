package org.j8unit.repository.java.util.concurrent.atomic;

import java.util.concurrent.atomic.DoubleAccumulator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DoubleAccumulatorTest
implements org.j8unit.repository.java.util.concurrent.atomic.DoubleAccumulatorTests<DoubleAccumulator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.atomic.DoubleAccumulator]

    @Override
    public DoubleAccumulator createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.atomic.DoubleAccumulator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.atomic.DoubleAccumulator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.atomic.DoubleAccumulator]

}
