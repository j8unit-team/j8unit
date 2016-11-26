package org.j8unit.repository.java.time.temporal;

import java.time.temporal.TemporalAmount;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TemporalAmount} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.time.temporal.TemporalAmountTests}).
 */
@RunWith(J8Unit4.class)
public class TemporalAmountTest
implements TemporalAmountTests<TemporalAmount> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.TemporalAmount]

    @Override
    public TemporalAmount createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.time.temporal.TemporalAmount], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.temporal.TemporalAmount]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.temporal.TemporalAmount]

}
