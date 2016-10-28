package org.j8unit.repository.java.sql;

import java.sql.Date;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DateTest
implements org.j8unit.repository.java.sql.DateTests<Date> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.Date]

    @Override
    public Date createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.sql.Date], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.Date]

}
