package org.j8unit.repository.java.sql;

import java.sql.Time;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Time} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.sql.TimeTests}).
 */

@RunWith(J8Unit4.class)
public class TimeTest
implements TimeTests<Time> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.Time]

    @Override
    public Time createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.sql.Time], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.Time]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.Time]

}
