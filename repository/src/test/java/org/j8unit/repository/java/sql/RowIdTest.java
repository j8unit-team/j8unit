package org.j8unit.repository.java.sql;

import java.sql.RowId;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowIdTest
implements org.j8unit.repository.java.sql.RowIdTests<RowId> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.RowId]

    @Override
    public RowId createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.RowId], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.RowId]

}
