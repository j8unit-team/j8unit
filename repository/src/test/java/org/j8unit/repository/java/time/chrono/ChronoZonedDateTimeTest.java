package org.j8unit.repository.java.time.chrono;

import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoZonedDateTime;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ChronoZonedDateTime} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.time.chrono.ChronoZonedDateTimeTests}).
 */

@RunWith(J8Unit4.class)
public class ChronoZonedDateTimeTest<D extends ChronoLocalDate>
implements ChronoZonedDateTimeTests<ChronoZonedDateTime<D>, D> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.chrono.ChronoZonedDateTime]

    @Override
    public ChronoZonedDateTime<D> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.time.chrono.ChronoZonedDateTime], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.chrono.ChronoZonedDateTime]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.chrono.ChronoZonedDateTime]

}
