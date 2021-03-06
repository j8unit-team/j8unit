package org.j8unit.repository.java.time.temporal;

import java.time.temporal.ValueRange;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ValueRange} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.temporal.ValueRangeTests}).
 */
@RunWith(J8Unit4.class)
public class ValueRangeTest
implements ValueRangeTests<ValueRange> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.ValueRange]

    @Override
    public ValueRange createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.time.temporal.ValueRange], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.temporal.ValueRange]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.temporal.ValueRange]

}
