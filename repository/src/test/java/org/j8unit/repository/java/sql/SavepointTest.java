package org.j8unit.repository.java.sql;

import java.sql.Savepoint;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SavepointTest
implements org.j8unit.repository.java.sql.SavepointTests<Savepoint> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.Savepoint]

    @Override
    public Savepoint createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.Savepoint], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.Savepoint]

}
