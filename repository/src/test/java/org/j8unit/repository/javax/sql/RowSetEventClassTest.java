package org.j8unit.repository.javax.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetEventClassTest
implements org.j8unit.repository.javax.sql.RowSetEventClassTests<javax.sql.RowSetEvent> {

    @Override
    public Class<javax.sql.RowSetEvent> createNewSUT() {
        return javax.sql.RowSetEvent.class;
    }

}
