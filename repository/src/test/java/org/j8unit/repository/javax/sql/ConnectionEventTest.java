package org.j8unit.repository.javax.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConnectionEventTest
implements org.j8unit.repository.javax.sql.ConnectionEventTests<javax.sql.ConnectionEvent> {

    @Override
    public javax.sql.ConnectionEvent createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.sql.ConnectionEvent] available.");
    }

}
