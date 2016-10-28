package org.j8unit.repository.javax.sql.rowset;

import javax.sql.rowset.JdbcRowSet;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JdbcRowSetTest
implements org.j8unit.repository.javax.sql.rowset.JdbcRowSetTests<JdbcRowSet> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.JdbcRowSet]

    @Override
    public JdbcRowSet createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.rowset.JdbcRowSet], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.JdbcRowSet]

}
