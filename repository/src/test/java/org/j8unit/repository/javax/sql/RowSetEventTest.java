package org.j8unit.repository.javax.sql;

import javax.sql.RowSetEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetEventTest
implements org.j8unit.repository.javax.sql.RowSetEventTests<RowSetEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.RowSetEvent]

    @Override
    public RowSetEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sql.RowSetEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.RowSetEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.RowSetEvent]

}
