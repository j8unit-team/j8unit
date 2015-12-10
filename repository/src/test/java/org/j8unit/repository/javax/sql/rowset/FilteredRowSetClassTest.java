package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FilteredRowSetClassTest
implements org.j8unit.repository.javax.sql.rowset.FilteredRowSetClassTests<javax.sql.rowset.FilteredRowSet> {

    @Override
    public Class<javax.sql.rowset.FilteredRowSet> createNewSUT() {
        return javax.sql.rowset.FilteredRowSet.class;
    }

}
