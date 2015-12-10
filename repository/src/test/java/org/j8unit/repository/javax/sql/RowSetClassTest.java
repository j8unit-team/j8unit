package org.j8unit.repository.javax.sql;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetClassTest
implements org.j8unit.repository.javax.sql.RowSetClassTests<javax.sql.RowSet> {

    @Override
    public Class<javax.sql.RowSet> createNewSUT() {
        return javax.sql.RowSet.class;
    }

}
