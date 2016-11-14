package org.j8unit.repository.javax.sql;

import javax.sql.RowSet;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RowSet} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.sql.RowSetTests}).
 */

@RunWith(J8Unit4.class)
public class RowSetTest
implements RowSetTests<RowSet> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.RowSet]

    @Override
    public RowSet createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.RowSet], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.RowSet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.RowSet]

}
