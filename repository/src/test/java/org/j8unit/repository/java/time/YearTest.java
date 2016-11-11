package org.j8unit.repository.java.time;

import java.time.Year;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Year} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.time.YearTests}).
 */

@RunWith(J8Unit4.class)
public class YearTest
implements YearTests<Year> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.Year]

    @Override
    public Year createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.time.Year], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.Year]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.Year]

}
