package org.j8unit.repository.javax.sql;

import javax.sql.RowSetWriter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RowSetWriter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sql.RowSetWriterTests}).
 */

@RunWith(J8Unit4.class)
public class RowSetWriterTest
implements RowSetWriterTests<RowSetWriter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.RowSetWriter]

    @Override
    public RowSetWriter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.RowSetWriter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.RowSetWriter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.RowSetWriter]

}
