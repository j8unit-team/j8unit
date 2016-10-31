package org.j8unit.repository.java.time;

import java.time.ZonedDateTime;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZonedDateTimeTest
implements org.j8unit.repository.java.time.ZonedDateTimeTests<ZonedDateTime> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.ZonedDateTime]

    @Override
    public ZonedDateTime createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.time.ZonedDateTime], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.ZonedDateTime]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.ZonedDateTime]

}
