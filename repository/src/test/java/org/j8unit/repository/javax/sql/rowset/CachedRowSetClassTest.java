package org.j8unit.repository.javax.sql.rowset;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CachedRowSetClassTest
implements org.j8unit.repository.javax.sql.rowset.CachedRowSetClassTests<javax.sql.rowset.CachedRowSet> {

    @Override
    public Class<javax.sql.rowset.CachedRowSet> createNewSUT() {
        return javax.sql.rowset.CachedRowSet.class;
    }

}
