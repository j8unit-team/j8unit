package org.j8unit.repository.javax.sql.rowset;

import javax.sql.rowset.CachedRowSet;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CachedRowSetClassTest
implements org.j8unit.repository.javax.sql.rowset.CachedRowSetClassTests<CachedRowSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.CachedRowSet]

    @Override
    public Class<CachedRowSet> createNewSUT() {
        return CachedRowSet.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.CachedRowSet]

}
