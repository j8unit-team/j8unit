package org.j8unit.repository.java.util;

import java.util.SimpleTimeZone;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SimpleTimeZone} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.SimpleTimeZoneTests}).
 */
@RunWith(J8Unit4.class)
public class SimpleTimeZoneTest
implements SimpleTimeZoneTests<SimpleTimeZone> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.SimpleTimeZone]

    @Override
    public SimpleTimeZone createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.SimpleTimeZone], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.SimpleTimeZone]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.SimpleTimeZone]

}
