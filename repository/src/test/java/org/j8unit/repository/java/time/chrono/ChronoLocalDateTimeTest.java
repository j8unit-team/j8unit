package org.j8unit.repository.java.time.chrono;

import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ChronoLocalDateTime} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.time.chrono.ChronoLocalDateTimeTests}).
 */

@RunWith(J8Unit4.class)
public class ChronoLocalDateTimeTest<D extends ChronoLocalDate>
implements ChronoLocalDateTimeTests<ChronoLocalDateTime<D>, D> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.chrono.ChronoLocalDateTime]

    @Override
    public ChronoLocalDateTime<D> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.time.chrono.ChronoLocalDateTime], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.chrono.ChronoLocalDateTime]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.chrono.ChronoLocalDateTime]

}
