package org.j8unit.repository.java.time.temporal;

import java.time.temporal.Temporal;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Temporal} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.temporal.TemporalTests}).
 */

@RunWith(J8Unit4.class)
public class TemporalTest
implements TemporalTests<Temporal> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.temporal.Temporal]

    @Override
    public Temporal createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.time.temporal.Temporal], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.temporal.Temporal]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.temporal.Temporal]

}
