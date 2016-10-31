package org.j8unit.repository.javax.sql;

import javax.sql.RowSetInternal;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetInternalTest
implements org.j8unit.repository.javax.sql.RowSetInternalTests<RowSetInternal> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.RowSetInternal]

    @Override
    public RowSetInternal createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.RowSetInternal], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.RowSetInternal]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.RowSetInternal]

}
