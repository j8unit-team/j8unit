package org.j8unit.repository.javax.sql;

import javax.sql.PooledConnection;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PooledConnectionTest
implements org.j8unit.repository.javax.sql.PooledConnectionTests<PooledConnection> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.PooledConnection]

    @Override
    public PooledConnection createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.PooledConnection], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.PooledConnection]

}
