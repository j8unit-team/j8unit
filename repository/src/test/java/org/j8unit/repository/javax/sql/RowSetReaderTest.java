package org.j8unit.repository.javax.sql;

import javax.sql.RowSetReader;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetReaderTest
implements org.j8unit.repository.javax.sql.RowSetReaderTests<RowSetReader> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.RowSetReader]

    @Override
    public RowSetReader createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.RowSetReader], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.RowSetReader]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.RowSetReader]

}
