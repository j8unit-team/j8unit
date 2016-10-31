package org.j8unit.repository.javax.sql.rowset;

import javax.sql.rowset.BaseRowSet;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BaseRowSetTest
implements org.j8unit.repository.javax.sql.rowset.BaseRowSetTests<BaseRowSet> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.BaseRowSet]

    @Override
    public BaseRowSet createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.rowset.BaseRowSet], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.rowset.BaseRowSet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.rowset.BaseRowSet]

}
