package org.j8unit.repository.java.util;

import java.util.TimeZone;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimeZoneTest
implements org.j8unit.repository.java.util.TimeZoneTests<TimeZone> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.TimeZone]

    @Override
    public TimeZone createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.TimeZone], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.TimeZone]

}
