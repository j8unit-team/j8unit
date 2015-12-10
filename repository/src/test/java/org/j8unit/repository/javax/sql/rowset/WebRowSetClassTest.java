package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebRowSetClassTest
implements org.j8unit.repository.javax.sql.rowset.WebRowSetClassTests<javax.sql.rowset.WebRowSet> {

    @Override
    public Class<javax.sql.rowset.WebRowSet> createNewSUT() {
        return javax.sql.rowset.WebRowSet.class;
    }

}
