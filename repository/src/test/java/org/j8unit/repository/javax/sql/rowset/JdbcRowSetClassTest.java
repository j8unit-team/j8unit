package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JdbcRowSetClassTest
implements org.j8unit.repository.javax.sql.rowset.JdbcRowSetClassTests<javax.sql.rowset.JdbcRowSet> {

    @Override
    public Class<javax.sql.rowset.JdbcRowSet> createNewSUT() {
        return javax.sql.rowset.JdbcRowSet.class;
    }

}
