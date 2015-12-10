package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BaseRowSetClassTest
implements org.j8unit.repository.javax.sql.rowset.BaseRowSetClassTests<javax.sql.rowset.BaseRowSet> {

    @Override
    public Class<javax.sql.rowset.BaseRowSet> createNewSUT() {
        return javax.sql.rowset.BaseRowSet.class;
    }

}
