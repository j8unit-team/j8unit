package org.j8unit.repository.java.util;

import java.util.TimeZone;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TimeZone} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.TimeZoneTests}).
 */
@RunWith(J8Unit4.class)
public class TimeZoneTest
implements TimeZoneTests<TimeZone> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.TimeZone]

    @Override
    public TimeZone createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.TimeZone], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.TimeZone]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.TimeZone]

}
