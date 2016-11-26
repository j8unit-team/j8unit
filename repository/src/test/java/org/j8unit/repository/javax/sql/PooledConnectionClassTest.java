package org.j8unit.repository.javax.sql;

import javax.sql.PooledConnection;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PooledConnection} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.sql.PooledConnectionClassTests}).
 */
@RunWith(J8Unit4.class)
public class PooledConnectionClassTest
implements PooledConnectionClassTests<PooledConnection> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.PooledConnection]

    @Override
    public Class<PooledConnection> createNewSUT() {
        return PooledConnection.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.PooledConnection]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.PooledConnection]

}
