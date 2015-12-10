package org.j8unit.repository.javax.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConnectionEventClassTest
implements org.j8unit.repository.javax.sql.ConnectionEventClassTests<javax.sql.ConnectionEvent> {

    @Override
    public Class<javax.sql.ConnectionEvent> createNewSUT() {
        return javax.sql.ConnectionEvent.class;
    }

}
