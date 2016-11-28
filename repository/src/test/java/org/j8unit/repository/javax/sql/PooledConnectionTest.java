package org.j8unit.repository.javax.sql;

import javax.sql.PooledConnection;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PooledConnection} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.sql.PooledConnectionTests}).
 */
@RunWith(J8Unit4.class)
public class PooledConnectionTest
implements PooledConnectionTests<PooledConnection> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sql.PooledConnection]

    @Override
    public PooledConnection createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sql.PooledConnection], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sql.PooledConnection]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sql.PooledConnection]

}
