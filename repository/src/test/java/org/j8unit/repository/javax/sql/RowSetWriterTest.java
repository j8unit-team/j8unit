package org.j8unit.repository.javax.sql;

import javax.sql.RowSetWriter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSetWriterTest
implements org.j8unit.repository.javax.sql.RowSetWriterTests<RowSetWriter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.RowSetWriter]

    @Override
    public RowSetWriter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.RowSetWriter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.RowSetWriter]

}
