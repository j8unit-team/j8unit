package org.j8unit.repository.javax.sql;

import javax.sql.RowSet;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetClassTest
implements org.j8unit.repository.javax.sql.RowSetClassTests<RowSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.RowSet]

    @Override
    public Class<RowSet> createNewSUT() {
        return RowSet.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.RowSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.RowSet]

}
