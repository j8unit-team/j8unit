package org.j8unit.repository.java.time;

import java.time.MonthDay;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MonthDay} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.MonthDayTests}).
 */

@RunWith(J8Unit4.class)
public class MonthDayTest
implements MonthDayTests<MonthDay> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.MonthDay]

    @Override
    public MonthDay createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.time.MonthDay], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.MonthDay]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.MonthDay]

}
