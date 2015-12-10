package org.j8unit.repository.javax.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetEventTest
implements org.j8unit.repository.javax.sql.RowSetEventTests<javax.sql.RowSetEvent> {

    @Override
    public javax.sql.RowSetEvent createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.sql.RowSetEvent] available.");
    }

}
