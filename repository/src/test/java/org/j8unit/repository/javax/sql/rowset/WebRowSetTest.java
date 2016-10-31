package org.j8unit.repository.javax.sql.rowset;

import javax.sql.rowset.WebRowSet;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WebRowSetTest
implements org.j8unit.repository.javax.sql.rowset.WebRowSetTests<WebRowSet> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.WebRowSet]

    @Override
    public WebRowSet createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.rowset.WebRowSet], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.rowset.WebRowSet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.rowset.WebRowSet]

}
