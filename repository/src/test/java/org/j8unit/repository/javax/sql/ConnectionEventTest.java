package org.j8unit.repository.javax.sql;

import javax.sql.ConnectionEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConnectionEventTest
implements org.j8unit.repository.javax.sql.ConnectionEventTests<ConnectionEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.ConnectionEvent]

    @Override
    public ConnectionEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.sql.ConnectionEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.ConnectionEvent]

}
