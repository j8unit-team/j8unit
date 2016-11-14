package org.j8unit.repository.java.sql;

import java.sql.Date;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Date} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.sql.DateTests}).
 */

@RunWith(J8Unit4.class)
public class DateTest
implements DateTests<Date> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.Date]

    @Override
    public Date createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.sql.Date], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.Date]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.Date]

}
