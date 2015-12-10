package org.j8unit.repository.javax.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StatementEventClassTest
implements org.j8unit.repository.javax.sql.StatementEventClassTests<javax.sql.StatementEvent> {

    @Override
    public Class<javax.sql.StatementEvent> createNewSUT() {
        return javax.sql.StatementEvent.class;
    }

}
