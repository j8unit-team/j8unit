package org.j8unit.repository.java.time.chrono;

import java.time.chrono.HijrahDate;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link HijrahDate} (by simply reusing the
 * J8Unit test interface {@link HijrahDateTests}).
 */

@RunWith(J8Unit4.class)
public class HijrahDateTest
implements HijrahDateTests<HijrahDate> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.chrono.HijrahDate]

    @Override
    public HijrahDate createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.time.chrono.HijrahDate], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.chrono.HijrahDate]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.chrono.HijrahDate]

}
