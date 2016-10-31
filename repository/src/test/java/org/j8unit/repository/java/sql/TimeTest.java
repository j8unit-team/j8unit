package org.j8unit.repository.java.sql;

import java.sql.Time;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TimeTest
implements org.j8unit.repository.java.sql.TimeTests<Time> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.Time]

    @Override
    public Time createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.sql.Time], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.Time]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.Time]

}
