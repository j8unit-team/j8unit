package org.j8unit.repository.java.time.temporal;

import java.time.temporal.TemporalAdjuster;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TemporalAdjuster} (by simply reusing
 * the J8Unit test interface {@link TemporalAdjusterTests}).
 */

@RunWith(J8Unit4.class)
public class TemporalAdjusterTest
implements TemporalAdjusterTests<TemporalAdjuster> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.TemporalAdjuster]

    @Override
    public TemporalAdjuster createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.time.temporal.TemporalAdjuster], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.temporal.TemporalAdjuster]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.temporal.TemporalAdjuster]

}
