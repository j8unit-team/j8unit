package org.j8unit.repository.java.time;

import java.time.Clock;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Clock} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.time.ClockTests}).
 */

@RunWith(J8Unit4.class)
public class ClockTest
implements ClockTests<Clock> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.Clock]

    @Override
    public Clock createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.time.Clock], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.Clock]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.Clock]

}
