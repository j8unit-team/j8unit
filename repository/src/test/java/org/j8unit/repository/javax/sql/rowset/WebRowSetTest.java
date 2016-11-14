package org.j8unit.repository.javax.sql.rowset;

import javax.sql.rowset.WebRowSet;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link WebRowSet} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sql.rowset.WebRowSetTests}).
 */

@RunWith(J8Unit4.class)
public class WebRowSetTest
implements WebRowSetTests<WebRowSet> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.rowset.WebRowSet]

    @Override
    public WebRowSet createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.rowset.WebRowSet], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.rowset.WebRowSet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.rowset.WebRowSet]

}
